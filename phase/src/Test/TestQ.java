package Test;
import phase1.TestM;
import Test.TestP;
public class TestQ extends TestM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestP().PublicMethod();
		new TestM().PublicMethod();
		new TestM().PublicMethod();
		
		new TestQ().ProtectedMethod();
		System.out.println( "value of int in class N is "+ new TestM().k);
		System.out.println( "value of long in class X is "+new TestP().l);
		System.out.println( "value of float in class X is "+new TestP().f);
		System.out.println( "value of char in class X is "+new TestP().c);
	}
}

