package Artist;

public class Song implements CsvPrintable{
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

    @Override
    public String printCsv() {
        return new StringBuilder().append(title).toString();
    }
}
