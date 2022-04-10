package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { //we are achieving multiple inheritance
	//Is-a-relationship ( we are talking about Interface and class)
	
	//if a class is implementing any Interface, then its mandatory to define/ override all the methods of Interface.
	
	//These three method overriding from USBank
	public void credit() {
		
		System.out.println("HSBC -- credit");
		
	}
	public void debit() {
		System.out.println("HSBC -- debit");
	}
	public void transferMoney() {
		System.out.println("HSBC -- transferMoney");
		
		//************************************************************
		
	//These two method seperate method of HSBC bank class
	}
	public void educationLoan() {
		System.out.println("HSBC -- edu Loan");
	}
	public void carLoan() {
		
		System.out.println("HSBC -- Car Loan");
	}
	//******************************************
	//This method Implementing or overriding metho from Barzil Bank method:
	public void mutualFun() {
		System.out.println("HSBC-- mutual fund");
		
	}

}
