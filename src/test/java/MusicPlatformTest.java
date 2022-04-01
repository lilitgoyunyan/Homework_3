import javafx.application.Platform;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.*;
//import org.testng.Assert;

public class MusicPlatformTest {
    @Test
    public void getSongsListTest(){
        Assert.assertNotNull(new MusicPlatform().getSongsList());
    }
    @Test
    public void findSongTest(){
       Assert.assertNotNull(new MusicPlatform().findSong("Whatever Happens", "Michael Jackson"));
    }
    @Test
    public void addSongTest(){
        Assert.assertNotNull(new MusicPlatform().addSong(new Song("My Music and Me", "Nate Dogg", "not downloaded")));
    }
    @Test
    public void removeSongTest(){
        Assert.assertNotNull(new MusicPlatform().removeSong(new Song("My Music and Me", "Nate Dogg", "not downloaded")));
    }
}
