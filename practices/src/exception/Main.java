package exception;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) { 
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
			
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block");
		}
		
		try {
			int[] arr=new int[3];
			arr[4]=89;
		}catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f);
		}
		
		System.out.println("welcome");
		System.out.println("completed");
}}
		/*File f=new File("D:\\a.txt");// its location that stores data
		{f.createNewFile();
//		f.delete();
		FileWriter ff=new FileWriter("javaclass.txt");
		ff.write("welcome guys\n");
		ff.close();

	}
}*/



