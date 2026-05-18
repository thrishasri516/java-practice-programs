package exception;

public class Voting {

		public static void main(String[] args) {
			try {
				checkmyageforvote(15);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("checked");

		}

		private static void checkmyageforvote(int i) {
			if(i>=18) {
				System.out.println("allowing for voting..");
			}else {
				throw new ArithmeticException("not eligible for vote");
			}
			
		}

}
