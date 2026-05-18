package encapsulation;

public class Deer extends Animal {
	

	/*// deer class acquires all the props and behaviours from the parent class(Animal)
		
		public void longjump() {
			System.out.println("Long jumping....");
		}

		public static void main(String[] args) {
			// we have called deer class fnction and animal(parent) class function using deer instance(child)
			//we can call child function and parent function using child instance
			Deer d=new Deer();
			d.longjump();
			d.run();
			d.jump();
			
			// we cannot call the child class functions using parent class.
			Animal a=new Animal();
			a.run();
			a.jump();
			
			//  single inheritance animal--->deer
			// multilevel  -  animal-->deer--->wilddeer(animal,deer,wilddeer)
			

		}

}*/
	
	public void longjump() {
		System.out.println("Long jumping....");
	}
	
	public void run() {
		super.run();///super keyword used to call parent class function.
		System.out.println("deer is runing..");
	}

	public static void main(String[] args) {
		// we have called deer class fnction and animal(parent) class function using deer instance(child)
		//we can call child function and parent function using child instance
		Deer d=new Deer();
		d.longjump();
		d.run();
		d.jump();
		
		// we cannot call the child class functions using parent class.
		Animal a=new Animal();
		a.run();
		a.jump();
		
		//  single inheritance animal--->deer
		// multilevel  -  animal-->deer--->wilddeer(animal,deer,wilddeer)
		

	}

}
