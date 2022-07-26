package phase1;
class ConstructorOverloading {
	String l,m;
	int A,K=0,p,q,a;
	char section,s;
	char gender,g;
	float total;
	float percentage;
     ConstructorOverloading (String name,int A,int K,int p, int q,char section,char gender){
    			 total=(K+p+q);
    			 percentage=(total/300)*100;
    			 m=l;
    			 a=A;
    			 s=section;
    			 g=gender;
    			
     }
     ConstructorOverloading(String l,int A,int p, int q,char section,char gender){
		 total=(K+p+q);
		 percentage=(total/300)*100;
		 m=l;
		 a= A;
		 s=section;
		 g=gender;
     }
      void methodDisplay(){
    	  System.out.println("student name is "+m+" age:"+a+" section:"+s+" gender:"+g+" total:"+total+" percentage:"+percentage);
     }
    public static void main(String[] args){
        ConstructorOverloading s1=new ConstructorOverloading("Kaviya",22,98,76,70,'E','M');
		s1.methodDisplay();
	     ConstructorOverloading s2=new  ConstructorOverloading("Arun",21,72,69,'A','M');
		s2.methodDisplay();
	     ConstructorOverloading s3=new  ConstructorOverloading("Nisha",20,74,99,'F','F');
		s3.methodDisplay();
	     ConstructorOverloading s4=new  ConstructorOverloading("Vimal",22,66,96,95,'C','F');
		s4.methodDisplay();
    	 }
     }
     
     

