package Artist;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumTitle;
    private String releaseDate;
    private List<Song> albumSongs = new ArrayList();

    public Album(String albumTitle){
        this.albumTitle = albumTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void addSong(Song song){
        this.albumSongs.add(song);
    }

    public List<Song> getAlbumSongs(){
        return albumSongs;
    }
}
