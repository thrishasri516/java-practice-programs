package practices;

public class RuntimeChild extends RunTime{
	 // same method name and same argument but implemtatikon is different
	@Override
	public void execute() {
		System.out.println("Child perfomring");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimeChild child=new RuntimeChild();
		child.execute();

	}


}
