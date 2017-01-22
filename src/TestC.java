import java.util.HashMap;
import java.util.Map;


public class TestC {
	
	public static void main(String args[]){
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		String str = "Tester Test Tester";
		String[] strarray = str.split(" ");
		
		//System.out.println(strarray);
		
		for(String freq: strarray){
			
			//System.out.println(freq);
			if(map.get(freq)==null){
			map.put(freq,1);
			}else
				map.put(freq,map.get(freq)+1);
			
		}
		
		System.out.println(map);
	}

}
