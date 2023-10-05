package Artist;

import java.util.List;

public class Main {
    private static String searchTerm;

    public static void main(String[] args) {
        searchTerm = "Ma";
        MusicCompany myMusic = new MusicCompany("NKH Music");
        ArtistClass linkingPark = new ArtistClass("Linking Park", "alternative rock");
        myMusic.addArtist(linkingPark);
        linkingPark.addSong("In the End", "Hybrid Theory");
        linkingPark.addSong("Crawling", "Hybrid Theory");
        linkingPark.addSong("Numb", "Meteora");
        linkingPark.introduce();
        myMusic.addArtist(new ArtistClass("Machete", "pop/rock"));
        myMusic.addArtist(new ArtistClass("Marilyn Manson", "rock"));
        List<ArtistClass> searchResult = myMusic.searchArtist(searchTerm);
        System.out.println("For your search '" + searchTerm + "' found " + searchResult.size() + " artists: ");
        for (ArtistClass artist : searchResult
        ) {
            System.out.println(artist.getArtistName());
        }

    }
}
