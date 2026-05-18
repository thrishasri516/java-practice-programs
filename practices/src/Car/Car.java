package Car;

public class Car {
	String Model;
	int Year;
	
	public static void main(String[]args) {
		
		Car c= new Car();
		c.setModel("a");
		c.setYear(1995);
		Car cc=new Car();
		Car c1=new Car("bmw",2024);
		c1.display();
		Car c2=new Car("audi",2026);
		System.out.println(c1.getModel());
	}

}
