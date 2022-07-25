package Test;
import phase1.TestL;
import phase1.TestN;
import phase1.TestM;
public class TestR extends TestM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestP().PublicMethod();
		new TestM().PublicMethod();
		new TestL().PublicMethod();
	    new TestR().ProtectedMethod();
		new TestN().MethodInP();
		System.out.println( "value of long in class TestX is "+new TestP().l);
		System.out.println( "value of float in class TestX is "+new TestP().f);
		System.out.println( "value of char in class TestX is "+new TestP().c);
	
	}

}