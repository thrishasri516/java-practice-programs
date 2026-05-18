package car;

public class Test {
	
	    public static void main(String[] args) {
	    	Car c=new Car();
	    	c.setModel("a");
	    	
	    	c.setYear(1995);
	    	Car cc=new Car();
	    	
	        Car c1 = new Car("BMW", 2024);
	        c1.display();
	        Car c2=new Car("Audi",2025);
	        c2.setModel("Maruthi");
	        
	        System.out.println(c2.getYear());
	        System.out.println(c1.getModel());
	    }
	}

