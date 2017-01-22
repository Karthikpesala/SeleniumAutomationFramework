
public class InsertionSort {

	public static void main(String args[]){
		int a[] = {2,3,1,6,7,8};
		int temp;
		
		for(int i=1;i<a.length;i++){
			
			if(a[i]<a[i-1]){				
				temp = a[i-1];
				a[i-1] = a[i];
				a[i] = temp;				
			}
			
		}
		
	}
}
