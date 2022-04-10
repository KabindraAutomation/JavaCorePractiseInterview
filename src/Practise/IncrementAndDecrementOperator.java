package Practise;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++
		// --

		int i = 1;
		int j = i++;// post increment ouput 2 and 1
		System.out.println(i);
		System.out.println(j);

		int a = 1;
		int b = ++a; // pre increment out 2 and 2
		System.out.println(a);
		System.out.println(b);

		int m = 2;
		int n = m--; // post decrement
		System.out.println(m);// output = 1
		System.out.println(n); // output = 2

		int p = 2;
		int q = --p; // pre decrement
		System.out.println(p); // output= 1
		System.out.println(q); // output = 1
	}

}
