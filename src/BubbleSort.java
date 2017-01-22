
public class BubbleSort {
	
	public static void main(String args[]){
		
		int a[] ={2,1,3,6,7,8};
		//String str = "karthik";
		int temp;
		int modified;
		
		for(int j=0;j<a.length;j++){
			modified =0;
		
		for(int i=0;i<(a.length-1);i++){
			
			if(a[i]>a[i+1]){
				
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				modified = 1;
			}
			
		}
		if(modified==0){
			break;
		}
		}
		
		for(int i=0;i<a.length;i++){
			
			System.out.println(a[i]);			
		}
		
		
	}

}
