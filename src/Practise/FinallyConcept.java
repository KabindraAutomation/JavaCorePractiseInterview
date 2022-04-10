package Practise;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test1();
		// test2();

		division();

	}

	public static void test1() {

		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");

		} catch (Exception e) {

			System.out.println("Inside catch block");
		} finally {

			System.out.println("Inside Finally block");
		}
	}

	public static void test2() {

		try {
			System.out.println("Inside test2");
		} finally {
			System.out.println("Finally code in test2 method");
		}
	}

	public static void division() {

		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("inside Catch Block");
			System.out.println("Divide by zero error");
		} finally {
			System.out.println("Execute the code even after any exception");
		}

	}

}
