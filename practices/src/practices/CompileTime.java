package practices;

public class CompileTime {
		// same method name but different argument or different data types
		public void add(int a, int b) {
			System.out.println(a+b);
		}
		
		public void add(float a, int b) {
			System.out.println(a+b);
		}
		
		public void add(double a, double b) {
			System.out.println(a+b);
		}
		
		public void add(int a, int b, int c) {
			System.out.println(a+b+c);
		}

		public static void main(String[] args) {
			CompileTime c=new CompileTime();
//			c.add
			c.add(5, 10);
			c.add(10, 7,7);
			c.add(10.5f, 8);
			

		}


}
