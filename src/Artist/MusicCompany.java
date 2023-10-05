package Artist;

import java.util.ArrayList;
import java.util.List;

public class MusicCompany {
    private String companyName;
    private List<ArtistClass> artists = new ArrayList<>();

    public MusicCompany(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void addArtist(ArtistClass artist){
        this.artists.add(artist);
    }

    public List<ArtistClass> searchArtist(String query){
        List<ArtistClass> searchResult = new ArrayList<>();
        for (ArtistClass artist: artists) {
            if(artist.getArtistName().contains(query)){
            searchResult.add(artist);
            }
        }
        return searchResult;
    }
}
