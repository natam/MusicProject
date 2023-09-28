package Artist;

public class ArtistClass implements Artist {
    @Override
    public void introduce(String artistName){
        System.out.println("This is "+artistName);
    }
    public void addAlbum(String albumName){
        System.out.println("This is the album "+albumName);
    }
    public void addSong(String songName){
        System.out.println("This is the song "+songName);
    }

    public static void main(String[] args) {
        ArtistClass edSheeran = new ArtistClass();
        edSheeran.introduce("Ed Sheeran");
        edSheeran.addAlbum("Divide");
        edSheeran.addSong("Perfect");
    }
}