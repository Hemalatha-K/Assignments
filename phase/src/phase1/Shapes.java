package phase1;

public class Shapes {
	int A;
	float B;
	double O,K,P;
	Shapes(){
		
	}
	Shapes(int J){
		A=(J*J);
	}
	Shapes(float G, float H){
		
		B=(G*H);
		
	}
	Shapes(double r){
		O=(3.14*r*r);
	}
	void Square(){
		System.out.println("area of square is " +A);
	}
	void Rectangle(){
		System.out.println("area of rectangle is " +B);
	}
	void Circle(){
		System.out.println("area of circle is " +O);
	}
	void Area(float k, float l){
		K=(0.5*k*l);
		System.out.println("area of triangle is " +K);
	} 
	void Area(double d1, double d2){
		P=(0.5*d1*d2);
		System.out.println("area of rhombus is " +P);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s1=new Shapes(14);
		Shapes s2=new Shapes(5,2);
		Shapes s3=new Shapes(6.5);
		Shapes s4=new Shapes();
		Shapes s5=new Shapes();
		s1.Square();
		s2.Rectangle();
		s3.Circle();
		s4.Area(21.5,10.2);
		s5.Area(21,10);
		
	}

}

