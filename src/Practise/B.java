package Practise;

public class B extends A {

	public B() {
		super();
		System.out.println("Child Default Parameter");
		System.out.println();

	}

	public B(int i) {
		super(i);
		System.out.println("Child Single parameter");
		System.out.println();
	}

	public B(int i, int j) {

		super(i, j);
		System.out.println("Child --> two parameter called");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(20, 30);

	}

}
