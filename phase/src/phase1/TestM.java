package phase1;

public class TestM {
	public void PublicMethod(){
		DefaultMethod();
		new TestL().ProtectedMethod();
	}
	void DefaultMethod(){
		System.out.println( "value of double in class TestN is"+ d);
	}
	protected void ProtectedMethod(){
		System.out.println( "value of long in class TestN is "+ l1);
	}
	
	protected long l1=33l;
	public int k=29;
	double d =45.6d;
 }
