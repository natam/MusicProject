package Artist;

import java.util.ArrayList;
import java.util.List;

public class ArtistClass implements Artist {
    private String artistName;
    private String musicalGenre;
    private String country;
    private List<Album> albums = new ArrayList<>();

    public ArtistClass(String artistName, String musicalGenre) {
        setArtistName(artistName);
        setMusicalGenre(musicalGenre);
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getMusicalGenre() {
        return musicalGenre;
    }

    public void setMusicalGenre(String musicalGenre) {
        this.musicalGenre = musicalGenre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void introduce() {

        System.out.println("This is " + artistName);
        System.out.println("Albums: ");
        for (Album album : albums
        ) {
            System.out.println(album.getAlbumTitle());
            for (Song song : album.getAlbumSongs()
            ) {
                System.out.println("    " + song.getTitle());
            }
        }
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public Album getAlbumOrAddByTitle(String albumName) {
        for (Album album : albums) {
            if (album.getAlbumTitle().equalsIgnoreCase(albumName)) {
                return album;
            }
        }
        Album newAlbum = new Album(albumName);
        addAlbum(newAlbum);
        return newAlbum;
    }

    public void addSong(String songName, String albumName) {
        getAlbumOrAddByTitle(albumName).addSong(new Song(songName));
    }

}