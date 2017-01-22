
public class SelectionSort {
	
	public static void main(String args[]){
		
		int a[] ={2,1,3,6,7,8};
		//String str = "karthik";
		int minValue,temp;
		//int modified;
		
		for(int j=0;j<a.length-1;j++){
		
		minValue = j;
		
			for(int i=j+1;i<a.length;i++){
				
				if(a[i]<a[minValue]){	
					minValue =i;				
				}
				
			}
			if(!(minValue==j)){
				temp = a[j];
				a[j] = a[minValue];
				a[minValue] = temp;				
			}
		}
		
		for(int i=0;i<a.length;i++){			
			System.out.println(a[i]);			
		}
		
	}

}
