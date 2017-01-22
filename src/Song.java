
public class Song  {
	
	String title;
	String artist;
	Integer rating;
	
	/*public int compareTo(Song s){
		return rating.compareTo(s.getRating());			
	}*/
	
	Song(String t,String a,Integer r){
		title = t;
		artist = a;
		rating = r;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public Integer getRating(){
		return rating;
	}
	
}
