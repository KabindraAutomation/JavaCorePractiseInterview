package Practise;

public class Singleton {

	// in OOP, a singleton class is a class that can have only one object or
	// (instance of the class)--> object and Instance is same onhy terminolies are difference
	// How to desing singleton class:
	// - make sure constructor as private
	// - write a public static method that has return type of object this singleton class. This is also called as (Lazt Initialization)
	
	// Diff between normal calss and Singleton class:
	//For normal class we use constructor where for singleton class we use getInstance() method for instantiation 

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {

		str = "Hey I'm using Singlton class patter";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null)

			singleton_instance = new Singleton();
		return singleton_instance;

	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		z.str = (z.str).toLowerCase();
		
		System.out.println();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	

	}

}
