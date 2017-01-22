import java.util.Map;
import java.util.TreeMap;


public class StringRepeatability {
	
	public static void main(String args[]){
		
		String str = "Testing improves Testing quality of the product";
		Map<String,Integer> map = new TreeMap<String,Integer>();
		String str1[] = str.split(" ");
		
		for(String str2: str1){
			
			Integer value = map.get(str2);
			if(value==null){
				map.put(str2, 1);
			}
			else{
				map.put(str2, value+1);
			}	
			
		}
		
		System.out.println(map);
		
	}

}
