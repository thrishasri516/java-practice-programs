package practices;

public class Test{

	public static void main(String[] args) {
	
		// Mutable String (can change the value)
	    // 1. String Buffer(slow-thread safe) 2. String Builder(fast-no thread safe )
	    
	    StringBuffer buff=new StringBuffer("manikandan");
	    buff.append(" welcome");
	    buff.append( "sachine");
	    System.out.println(buff);
	    
	    
	    
	    // immutable ( cannot change)class name mention as final
	    String s=new String("mani");
	    s.concat(" welcome");
	    System.out.println(s);
	    
}

	}


