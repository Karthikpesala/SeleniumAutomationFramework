import java.util.ArrayList;
import java.util.Collections;


public class Jukebox3 {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args){
		new Jukebox3().go();
	}
	
	public void go() {
		getSongs();
		//System.out.println(songList);
		//Collections.sort(songList);
		System.out.println(songList.get(0).getArtist());
	}
	
	void getSongs(){
		Song nextSong = new Song("chinni","karthik",5);
		songList.add(nextSong);
		nextSong =new Song("e rayi","kumar",1);
		songList.add(nextSong);
		nextSong =new Song("a rayi","abc",3);
		songList.add(nextSong);	
		
	}

}
