package collectionOfFramework;

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.LinkedList;

	public class Student {

		public static void main(String[] args) {
			ArrayList<Integer> list=new ArrayList();
			list.add(5);
			list.add(10);
			list.add(20);
			list.add(0,100);
			list.remove(1);
//			list.clear();
			
			System.out.println(list);
			
			ArrayList<Integer> listOne=new ArrayList(list);
			listOne.addAll(list);
			System.out.println(listOne);
			
			listOne.stream().forEach(i -> System.out.println(i));
			
			LinkedList<String> s=new LinkedList<String>();
			s.add("anu");
			s.addFirst("mani");
			s.addLast("saranya");
			s.add("anu");
			System.out.println(s);
			
			
			// duplicates wont allow
			// it doesnot follow the order
			HashSet<Integer> set=new HashSet<Integer>(listOne);
			set.add(10);
			set.add(20);
			System.out.println(set);
		}

	}

