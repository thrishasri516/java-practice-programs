package encapsulation;

public class Student {
	
	    // state
	    int age; //default value of int is zero , float 0.0 and string null
	    String name;
	    int height=10;
	    
	    //behaviour
	    public void study(){
	        System.out.println("student studying");
	    }
	    
		public static void main(String[] args) {
			int a=10;
			Student s=new Student();
			s.name="mani";
			s.age=20;
			s.study();
			System.out.println(s.height);
			s.height=40;
			System.out.println(s.height);
			
			Student s1=new Student();
			s1.name="kumar";
			s1.age=15;
			System.out.println(s.name);
			System.out.println(s1.age);
			
			Student s2=new Student();
			System.out.println(s2.age);
			System.out.println(s2.name);
			System.out.println(s2.height);
		}
	}

