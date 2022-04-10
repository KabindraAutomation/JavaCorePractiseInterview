package TestMain;

public class TestBase {

	// Can we overload main() method in Java // interview question
	/*
	 * nswer: Yes, you can overload main method in Java. But the program doesn't
	 * execute the overloaded main method when you run your program, you have to
	 * call the overloaded main method from the actual main method.
	 * 
	 * that means main method acts as an entry point for the java interpreter to
	 * start the execute of the application. where as a loaded main need to be
	 * called from main.
	 */

	//JVM will try to search  -- Main (String arg[] -- public static method
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Main Method -1 ");
		main("Testing");
		main(10);
		main(20,330);
		

	}
public static void main(String args) {
		
		// TODO Auto-generated method stub
		System.out.println("Main Method - 2");

	}

	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("Main method with int parameter - 3");

	}

	public static void main(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Main method with two int parameter - 4");

	}

}
