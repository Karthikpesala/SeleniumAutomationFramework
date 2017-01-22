
public class TestB extends TestA{
	
	public TestB() {
		
		System.out.println("Test B");
	}
	
	public TestB(int i){
		super(i);
		System.out.println(4);
	}

	public static void main(String args[]){
		
		TestA test = new TestB(3);
		
	}
	

}
