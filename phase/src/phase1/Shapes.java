package phase1;

public class Shapes {
	int x;
	float y;
	double z,t,rh;
	Shapes(){
		
	}
	Shapes(int s){
		x=(s*s);
	}
	Shapes(float l, float b){
		
		y=(l*b);
		
	}
	Shapes(double r){
		z=(3.14*r*r);
	}
	void displaySquare(){
		System.out.println("area of square is " +x);
	}
	void displayRect(){
		System.out.println("area of rectangle is " +y);
	}
	void displayCircle(){
		System.out.println("area of circle is " +z);
	}
	void area(float k, float l){
		t=(0.5*k*l);
		System.out.println("area of triangle is " +t);
	} 
	void area(double d1, double d2){
		rh=(0.5*d1*d2);
		System.out.println("area of rhombus is " +rh);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s1=new Shapes(14);
		Shapes s2=new Shapes(5,2);
		Shapes s3=new Shapes(6.5);
		Shapes s4=new Shapes();
		Shapes s5=new Shapes();
		s1.displaySquare();
		s2.displayRect();
		s3.displayCircle();
		s4.area(21.5,10.2);
		s5.area(21,10);
		
	}

}

