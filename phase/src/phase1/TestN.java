package phase1;

public class TestN {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	new TestL().PublicMethod();
	new TestL().ProtectedMethod();
	  new TestM().ProtectedMethod();
	  new TestM().DefaultMethod();
	  new TestN().MethodInP();
}
	public void MethodInP()
	{
	System.out.println( "value of int in class N is "+ new TestM().k);
}
}
