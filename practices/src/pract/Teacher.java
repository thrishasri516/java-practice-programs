package pract;

public class Teacher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentt s=new Studentt();
//		s.age=30;
		s.setAge(30);
//		s.name="mani";
//		System.out.println(s.age);
		System.out.println(s.getAge());
		
		Studentt s1=new Studentt();
		s1.setAge(40);
		s1.setName("mani");
		String f=s1.getName();
		System.out.println(f);
		
		Studentt s2=new Studentt(25,"seeman");
		System.out.println(s2.getAge());
		s2.setAge(27);
		System.out.println(s2.getAge());
		
		s2.setId(15);
		System.out.println(s2.getId());
	}

}

