package phase1;

public class TestL {
	public void PublicMethod(){
		PrivateMethod();
		defaultMethod();
		
	}
	void defaultMethod(){
		System.out.println( "value of long in class TestM is "+ l);
	}
	private void PrivateMethod(){
		System.out.println( "value of int in class TestM is "+ a);
	}
	public void ProtectedMethod(){
		System.out.println( "value of float in class TestM is "+ b);
	}
 
 long l=235l;
 private int a=20;
 protected float b=23.5f;
}
