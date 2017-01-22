import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileReadingAndWriting {
	
	public static void main(String args[]) throws IOException{
		
		File fis = new File("C:/Users/karthik/Desktop/karthikfrom/karthiktest.txt");
		FileInputStream fis1 = null;
		FileOutputStream fos1 = null;
		
		try {
			fis1 = new FileInputStream("C:/Users/karthik/Desktop/karthikfrom/karthiktest.txt");
			fos1 = new FileOutputStream("C:/Users/karthik/Desktop/karthikto/karthiktest.txt");
			
			int c;
			while((c=fis1.read())!= -1){
				
				fos1.write(fis1.read());
				//fos1.write(fis1.re);
				
			}
			
			try{
				
			}finally{
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis1 != null){
				fis1.close();
			}
			if(fos1 != null){
				fos1.close();
			}
		
		}
		
		
	}

}
