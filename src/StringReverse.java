
public class StringReverse {

	public static void main(String args[]){
		
		String name = "karthik";
		String name1 = "";
		
		for(int i =name.length();i>0;i--){			
			name1 = name1 +name.charAt(i-1);			
		}
		
		System.out.println(name1);
		
	}
}
