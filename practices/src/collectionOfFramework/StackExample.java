package collectionOfFramework;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(15);
		s.push(10);
		s.push(11);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.pop();
System.out.println(s);
	}

}
