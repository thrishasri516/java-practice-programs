package collectionOfFramework;
import java.util.TreeSet;
import java.util.Stack;
import java.util.HashMap;

public class MapExample {
	TreeSet<Integer> tree = new TreeSet<Integer>();{
	tree.add(111);
	tree.add(231);
	tree.add(112);
	System.out.println(tree);
	
//	Stack
	
	Stack<Integer> st=new Stack();
	st.push(12);
	st.push(14);
	st.stream().forEach(i->System.out.println(i));
	System.out.println(st);
	st.pop();	
	System.out.println(st);
	st.pop();
	System.out.println(st);
	System.out.println(st.isEmpty());
	
//	st.pop();
	if(!st.isEmpty()) {
		st.pop();
	}
	
	HashMap<Integer,String> studentmap=new HashMap();
	studentmap.put(1, "anu");
	studentmap.put(2, "mani");
	studentmap.put(1, "guna");
	studentmap.put(null,"sara");
	System.out.println(studentmap);
	System.out.println(studentmap.get(2));
	System.out.println(studentmap.containsKey(3));
	
	
	
	
}}





