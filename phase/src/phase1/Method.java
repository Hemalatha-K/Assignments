package phase1;

public class Method {
		
		public int calculate(int a, int b)
		{	
			int c=a+b;
			return c;
		}
		public int calculate(int a)
		{	
			int m= (int)3.14*a*a;
			return m;
		}
		public int calculate(float c, float d)
		{	
			int m = (int) ((int)c*d);
			return m;
		}
		public int calculate(float d)
		{	
			int j= (int)((int)d*d);
			return j;
		}
		

		public static void main(String[] args) {
			Method C = new Method();
			int i=C.calculate(2,6);
			int j=C.calculate(1);
			int k=C.calculate(2f,6f);
			int l=C.calculate(2f);
			
			System.out.println("Add Two Numbers="+ i);
			System.out.println("Area of circle="+ j);
			System.out.println("Area of rectangle="+ k);
			System.out.println("Area of square="+ l);
		}

	}


