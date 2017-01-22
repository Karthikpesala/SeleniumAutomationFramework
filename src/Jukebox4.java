import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Jukebox4 {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args){
		new Jukebox4().go();
	}
	
	class ArtistCompare implements Comparator<Song>{
		
		public int compare(Song one,Song two){
			return one.getArtist().compareTo(two.getArtist());			
		}		
	}
	
	public void go() {
		ArtistCompare artistcmp = new ArtistCompare();
		getSongs();
		//System.out.println(songList);
		Collections.sort(songList,artistcmp);
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
