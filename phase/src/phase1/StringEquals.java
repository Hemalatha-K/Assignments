package phase1;
public class StringEquals{

public static void main(String[] args) {
  String t="Delhi";
  String o="Mumbai";
  String k="delhi";
  String y=new String("Mumbai");
  String l=new String("delhi");
  String p=new String("Hello");
  if(t==o && t.equals(o)){
	  System.out.println("True");
  }
  else{
	  System.out.println("false");
  }
  if(y==p && y.equals(p)){
	  System.out.println("True");
  }else{
	  System.out.println("False");
  }
  if(t==o && t.equals(o)){
	  System.out.println("True");
	  }else{
		  System.out.println("False");
	  }
  if(k==y && k.equals(y)){
	  System.out.println("True");
  }else{
	  System.out.println("False");
  }
  if(p==y && p.equals(y)){
	  System.out.println("true.");
  }else{
	  System.out.println("False");
  }
}
}