package phase1;

public class StringBufferCls {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("Started Java");
		s.insert(7, "Language");
		System.out.println("Insertion: "+s);
		s.append("Phase1");
		System.out.println("Append: "+s);
		s.delete(2, 5);
		System.out.println("Delete: "+s);
		s.replace(8,11,"Python");
		System.out.println("Replace: "+s);
		s.reverse();
		System.out.println("Reverse: "+s);
		s.charAt(9);
		System.out.println("Char At Index 9: "+s);
	}

}
