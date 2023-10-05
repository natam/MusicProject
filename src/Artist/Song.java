package Artist;

public class Song {
    public String getTitle() {
        return title;
    }

    public Song(String songTitle){
        this.title = songTitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
}
