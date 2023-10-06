package Artist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MusicCompany implements CsvPrintable {
    private String companyName;
    private List<ArtistClass> artists = new ArrayList<>();

    public MusicCompany(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void addArtist(ArtistClass artist) {
        this.artists.add(artist);
    }

    public List<ArtistClass> searchArtist(String query) {
        List<ArtistClass> searchResult = new ArrayList<>();
        for (ArtistClass artist : artists) {
            if (artist.getArtistName().contains(query)) {
                searchResult.add(artist);
            }
        }
        return searchResult;
    }

    public List<ArtistClass> searchArtistByName(String name) {
        List<ArtistClass> searchResult = new ArrayList<>();
        Collections.sort(artists, Comparator.comparing(ArtistClass::getArtistName));
        int index = Collections.binarySearch(artists, new ArtistClass("Linking Park", "alternative rock"), Comparator.comparing(ArtistClass::getArtistName));
        if (index >= 0) {
            searchResult.add(artists.get(index));
        }
        return searchResult;
    }

    public ArtistClass searchArtistByName2(String name) {
        List<ArtistClass> searchResult = new ArrayList<>();
        Collections.sort(artists, Comparator.comparing(ArtistClass::getArtistName));
        int low = 0;
        int high = artists.size() - 1;
        int mid = (low + high) / 2;
        int comps = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (artists.get(mid).getArtistName().compareTo(name) < 0) {
                low = mid + 1;
            } else if (artists.get(mid).getArtistName().compareTo(name) > 0) {
                high = mid - 1;
            } else {
                return artists.get(mid);
            }
            comps++;
        }
        System.out.println(comps);
        return null;
    }

    public void exportCsv() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(companyName + ".csv"))) {
            for (ArtistClass artist : artists) {
                writer.append(companyName)
                        .append(";")
                        .append(artist.printCsv())
                        .append(System.lineSeparator());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String printCsv() {
        StringBuilder companyCSV = new StringBuilder();
        for (ArtistClass artist : artists) {
            companyCSV.append(companyName)
                    .append(";")
                    .append(artist.printCsv())
                    .append(System.lineSeparator());
        }
        return companyCSV.toString();
    }
}
