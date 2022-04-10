package Practise;

public class ConstructorConcpet {

	public ConstructorConcpet() { // default constructor--> 0 paramerter not passing any things.

		System.out.println("Default constructor");

	}

	public ConstructorConcpet(int i) {
		System.out.println("Single param Constructor");
		System.out.println("the value of i " + i);

	}

	public ConstructorConcpet(int i, int j) {
		System.out.println("Single param Constructor");
		System.out.println("the value of i " + i);
		System.out.println("the value of i " + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcpet obj = new ConstructorConcpet();
		ConstructorConcpet obj1 = new ConstructorConcpet(10);
		ConstructorConcpet obj2 = new ConstructorConcpet(15, 20);

	}
}
