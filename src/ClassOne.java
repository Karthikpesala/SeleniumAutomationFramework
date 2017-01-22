import org.testng.Assert;
import org.testng.annotations.Test;


public class ClassOne {
	
	@Test
	public void loginTest(){
		System.out.println("Before Method Calling");
		boolean flag = testMethod();
		System.out.println(flag);
		
		
	}
	
	public boolean testMethod(){
		System.out.println("During Method Calling");
		Assert.fail("Making failed");
		return true;
	}

}
