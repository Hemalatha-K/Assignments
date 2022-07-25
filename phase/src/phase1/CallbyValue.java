package phase1;

public class CallbyValue {
	int v= 150;
	int operation(int v)
	{
		v=v*10/100;
		return v;
	}

public static void main(String[] args) {
	
	CallbyValue d = new CallbyValue();
	
	System.out.println("before:"+ d.v);
	int f= d.operation(100);
	System.out.println("after:"+ f);


}

}