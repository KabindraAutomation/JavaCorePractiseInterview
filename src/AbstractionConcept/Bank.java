package AbstractionConcept;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;

	// abstract method without any method body. at least one abstract method is
	// complusory. it can be denboted by abstract keyword
	//Hiding the implementation logic -- is called Abstraction\ (OOP Concept)
	//abs class can have abs method and non abs methods
	//can't create the object of abstract class
	
	public abstract void loan(); // abstract method -- no method body// Implements will define by child class. her we didn't defined any things for loan abstract method 
	


	public void credit() {

		System.out.println("Bank -- Credit");

	}

	public void debit() {
		System.out.println("Bank --- debit");
	}
}
