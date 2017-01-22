import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;


public class FileMoving {
	
	
	public static void main(String args[]) throws IOException{
		
		/*String str = "karthirak";
		Set<String> set = new TreeSet<String>();
		
		File fis = new File("");
		
		Path p = fis.toPath();
		//Files.move(fis.toPath(), fis.toPath(), arg2);
		
		
		for(int i =0;i<str.length();i++){
			
			for(int j=i+1;j<str.length();j++){
				
				if(str.substring(i, j).equals((StringUtils.reverse(str)).substring(i, j))){
					set.add(str.substring(i, j));
				}
				
			}
			
		}*/
		
		//System.out.println(set);
		
		File fis = new File("C:/Users/karthik/Desktop/karthikfrom/karthik.txt");
		File fis1 = new File("C:/Users/karthik/Desktop/karthikto/karthik.txt");
		
		fis.renameTo(fis1);
		
		Files.move(fis.toPath(), fis1.toPath());
		
	
	}

}
