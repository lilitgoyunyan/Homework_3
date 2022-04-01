import java.util.ArrayList;

public class MusicPlatform {
    private ArrayList<Song> songs;


    public MusicPlatform() {
        this.songs = new ArrayList<>();
        this.songs.add(new Song("Whatever Happens", "Michael Jackson", "downloaded"));
        this.songs.add(new Song("My Way", "Frank Sinatra", "not downloaded"));
    }

    public ArrayList<Song> getSongsList() {
        return songs;
    }


    public Object findSong(String name, String singer) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getSinger().equals(name) && songs.get(i).getSinger().equals(singer)) {
                return songs.get(i);
            }
        }
        return true;
    }

    public boolean addSong(Song s) {
        if (!songs.contains(s)) {
            songs.add(s);
            return true;
        }
        return false;
    }

    public boolean removeSong(Song s) {
        if (songs.contains(s)) {
            songs.remove(s);
            return true;

        }
        return false;
    }

}
