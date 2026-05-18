package car;

public class Car {
	private String model;
    private int year;
    
    public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

    // Parameterized constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("paramter consc called");
    }
    
    Car(){
    	System.out.println("const called");
    }

    void display() {
        System.out.println(model + " " + year);
    }
    public static void main(String[] args) {
		Car c=new Car("a",1995);
	}
}


