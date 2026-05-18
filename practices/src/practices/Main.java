package practices;

public class Main {

		public static void main(String[] args) {
			String s="dhinesh";
			System.out.println(s);
			// string methods
			System.out.println(s.toUpperCase());
			String mm="mani";
			String vv=mm.toUpperCase();
			System.out.println(vv);
			System.out.println(vv.toLowerCase());
			System.out.println(vv.length());
			System.out.println(vv.startsWith("MA"));
			System.out.println(vv.endsWith("k"));
			String d="welcome,chennai";
			 //       012345678910
			String change=d.replace("e", "s");
			System.out.println(change);
			System.out.println(d.contains("Chennai"));
			System.out.println(d.charAt(1));
			System.out.println(d.indexOf("e"));
			System.out.println(mm.equals(vv));
			System.out.println(mm.equalsIgnoreCase(vv));
			String vk=d.substring(0,7);
			System.out.println(vk);
			System.out.println(vk.isEmpty());
			String vs=" sachin tendular ";
			System.out.println(vs.isBlank());
			System.out.println(vs.trim());
			System.out.println(vs.stripTrailing());
			String[] vlk = d.split(",");
			System.out.println(vlk[0]);

		}

	}

