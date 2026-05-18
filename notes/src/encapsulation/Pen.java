package encapsulation;

public class Pen {
		// encapsulation is wrapping data and method binds together in a single unit.
		public static void main(String[] args) {
			Students s=new Students();
//			s.name="mani";
			s.setName("mani");
			s.setAge(20);
//			s.age=20;
			System.out.println(s.getName());

}}
