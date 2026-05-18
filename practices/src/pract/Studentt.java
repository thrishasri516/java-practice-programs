package pract;

public class Studentt {
	// instance prop's
	private int age;
	private String name;
	private int id;
	
	public void setId(int m) {
		id=m;
	}
	
	public int getId() {
		return id;
	}
	
	public void write() {
		System.out.println("writing");
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	Studentt(int age,String name){
		this.name=name;
		this.age=age;
	}
	
	Studentt(){
		
	}
	public static void main(String[] args) {
		Studentt s=new Studentt();
		System.out.println(s.age);
		s.age=20;
		s.name="dhinesh";
		System.out.println(s.age);
		
		Studentt s1=new Studentt();
		s1.age=30;

	}

}
