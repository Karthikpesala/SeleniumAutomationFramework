
public class ChildClass extends ParentClass{
	
	public void methodA(String str){
		System.out.println("Child class A "+str );
	}
	
	public void methodB(){
		System.out.println("Child class B");
	}
	
	public static void main(String args[]) {
		
		ParentClass p = new ChildClass();
		p.methodB();
		p.methodA();
		
		ParentClass p1 = new ParentClass();
		p1.methodA();
		p1.methodB();
		
		ChildClass c = new ChildClass();
		c.methodA();
		c.methodA("Karthik");
		c.methodB();
		
		//ChildClass c1 = new ParentClass();
		
	}
	
	

}
