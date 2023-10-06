package Artist;

import java.util.ArrayList;
import java.util.List;

public class Album implements CsvPrintable{
    private static final char CSV_SEPARATOR = ';';
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

    @Override
    public String printCsv() {
        StringBuilder albumCSV = new StringBuilder().append(albumTitle)
                .append(CSV_SEPARATOR)
                .append(releaseDate);
        for (Song song: albumSongs
             ) {
            albumCSV.append(CSV_SEPARATOR)
                    .append(song.printCsv());
        }
        return albumCSV.toString();
    }
}
