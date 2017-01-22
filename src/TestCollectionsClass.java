import java.util.*;


public class TestCollectionsClass {
	
	
	
	public static void main(String args[]){
		//Map<String,Integer> testh = new HashMap<String,Integer>();
		
		//List lis = new ArrayList();		
		//lis.addAll(lis);
		
		Map<String,Integer> ma1 = new HashMap<String,Integer>();
		Map<String,Integer> ma = new TreeMap<String,Integer>();
		/*List<String> str = new ArrayList<String>();
		str.add("kr");
		str.add("kr");
		str.add("kr2");
		Collections.replaceAll(str, "kr", "kr1");
		Arrays.asList(str);
		
		ListIterator lstr = str.listIterator();
		
		while(lstr.hasNext()){
			System.out.println(lstr.next());
			System.out.println(str);
		}*/
		
		ma1.put("one", 1);
		ma1.put("two", 0);
		ma1.put("three", 1);
		ma1.put("four", 0);
		
		System.out.println(ma1);
		
		ma.putAll(ma1);
		
		System.out.println(ma);
		
	
		
		
	}
	


}
