import java.util.Scanner;


public class Triangle {
	
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true){
			 System.out.println("Enter the input value:");
			 input = sc.nextInt();
			
			 
			 for(int i =0;i<input;i++) {
				 
				 for(int j=input;j>0;j--){
					 
					 if(j<=i+1){
						 
						 System.out.print("#");
						 
					 }
					 else{
					 System.out.print(" ");
					 }
				 }
				 System.out.println();
				 
			 }
			
		
			//System.out.println("Enter the input value:"+input);
			
			if(8==input){
				System.out.println("Exit!");
                System.exit(0);
			}
			
			
			
		}
		
		
		
		
		
	}

}
