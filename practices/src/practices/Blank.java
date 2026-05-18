package practices;

public class Blank {
	
	Blank(){
		System.out.println("main cons called");
	}
 static {
	 System.out.println("static block 1");
 }
 {System.out.println("object block");
 
 }
 static {
	 System.out.println("static block 2");
 }
	public static void main(String[] args) {      
		// TODO Auto-generated method stub
		Blank m=new Blank();
		System.out.println("main called");
		Blank m1=new Blank();

	}

}
