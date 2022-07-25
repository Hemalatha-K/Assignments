package phase1;
class ConstructorOverloading {
     String name;
     int age;
     char Section;
     char gender;
     int l;int m;int n;
     //char s1;char s2;char s3;
     ConstructorOverloading( int sub1,int sub2,int sub3)
     {
    	 l=sub1;
    	 m=sub2;
    	 n=sub3;
     }
     ConstructorOverloading(double p1,double p2,double p3){
    	
    	 p1=(l/3)%100;
    	 p2 =(m/100)%100;
    	 p3 =(n/100)%100;
     }
     static void methodDisplay(){
    	 System.out.println(s1+l+p1);
    	 System.out.println(s2+m+p2);
    	 System.out.println(s3+n+p3);
     }
    public static void main(String[] args){
    	     methodDisplay();
    	    ConstructorOverloading ob=new ConstructorOverloading();
    		ob.s1();
    		ob.s2();
    		ob.s3();
    		ob.s4();
    	 }
     }
     
     

