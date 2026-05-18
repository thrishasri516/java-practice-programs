package thread;
import thread.MyInterface;

	public class Student implements Runnable, MyInterface{
		
		
		 public void run() {
				for(int i=0;i<=20;i++) {
					
					System.out.println(Thread.currentThread().getName()+"  " +i);
				}
			}

		public void sayhello() {
			// TODO Auto-generated method stub
			
		}
		
		public static void main(String[] args) {
				Student s=new Student();
				
				Thread t=new Thread(s);
				Thread t1=new Thread(s);
				Thread t2=new Thread(s);
				
				t.start();
				t1.start();
				t2.start();

		}

		

	}

