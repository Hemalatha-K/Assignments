package phase1;

public class CallbyValue {
	int val = 150;
	int operation(int val)
	{
		val=val*10/100;
		return val;
	}

public static void main(String[] args) {
	
	CallbyValue d = new CallbyValue();
	
	System.out.println("before:"+ d.val);
	int f= d.operation(100);
	System.out.println("after:"+ f);


}

}