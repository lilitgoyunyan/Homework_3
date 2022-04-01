public class Song {
    private String songName;
    private String singer;
    //state: downloaded or not
    private String state;

    public Song(String songName, String singer, String state) {
        this.songName = songName;
        this.singer = singer;
        this.state = state;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
