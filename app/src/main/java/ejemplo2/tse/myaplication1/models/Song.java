package ejemplo2.tse.myaplication1.models;

/**
 * Created by TSE on 14/08/2015.
 */
public class Song {

    private String songName;
    private String songArtist;
    private int stars;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
