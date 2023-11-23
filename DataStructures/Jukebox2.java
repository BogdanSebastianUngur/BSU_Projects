import java.util.*;
import java.util.Collections;
public class Jukebox2 {
    public static void main(String[] args){
        new Jukebox2().go();
    }
    public void go(){
        List<SongV3> songList = MockSongs.getSongV3();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}
