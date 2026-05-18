package practices;

public class MethodsExample {
	static void myRole(){
        System.out.println("hello buddy");
        System.out.println(" welcome");
        System.out.println("hello buddy");
        System.out.println(" welcome");
        
    }
    static void add(int a,int b){
        int c=a+b;
        System.out.println("Value of c is: "+c);
    }
    static void addition(int a,int b, int c){
        System.out.println(a+b+c);
    }
    
    static int substraction(int a, int v){
        int d=a-v;
        return d;//return 10 as value
    }
    
	public static void main(String[] args) {
		myRole();
		myRole();
		myRole();
// 		int v=10+9;
// 		int k=20+78;
add(10,9);
add(20,450);
addition(15,20,15);
int k=substraction(30,20);
System.out.println(":sub value is:"+k );

int l=substraction(50,20);
System.out.println(":sub value is:"+l );
System.out.println(substraction(100,10));
	}
}

