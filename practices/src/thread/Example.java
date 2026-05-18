package thread;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Set;
	import java.util.stream.Collectors;

	public class Example{

		
		public void sayhello() {
			System.out.println("hello guys");	
		}
		
		public static void main(String[] args) {
//			MyInterface examp=new Example();
//			examp.sayhello();
			Example e=new Example();
			MyInterface obj=()->{
				int a=10;
				int b=4;
				System.out.println(a+b);
			};
			obj.sayhello();
			
			List<Integer> list = Arrays.asList(1,2,3,4,5,1);
			long count=list.stream().filter(i->i%2==0).count();
			
			System.out.println(count);

			// Print even numbers
//			list.stream()
//			    .filter(n -> n % 2 == 0).map(i-> i+2)
//			    .forEach(i->System.out.println(i));
			Set<Integer> ten = list.stream().map(i->i*10).collect(Collectors.toSet());
			System.out.println(ten);
			
//			list.forEach(i->System.out.println(i));
			// method reference
			list.forEach(System.out::println);
			
			
			
		}

	}

