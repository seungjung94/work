public class staticTest {

	public static void main(String[] args) {
		TestClass c1 = new TestClass();
		TestClass c2 = new TestClass();
		
		c1.classMethod();
		c1.instanceMethod();
		
		c2.classMethod();
		c2.instanceMethod();
		
		c1.insVar="change ins";
		c1.instanceMethod();
		c2.instanceMethod();
		
		c1.claVar="change cla";
		c1.classMethod();
		c2.classMethod();	
		
	}
}
