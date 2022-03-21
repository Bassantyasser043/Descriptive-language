package egtry.html;

public class Main {
	public static void main(String[] args) throws ParseException {
		 try {
			 new egtry.html.html(System.in).create();
			 System.out.println("Syntax check ok");
		 }
		 catch (Throwable e) {
			 System.out.println("Syntax check failed!");
		 }
	}
}
