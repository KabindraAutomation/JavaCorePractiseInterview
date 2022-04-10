package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body -- only prototype
	// in Inteface, we can decare the variables, vars are by default static in nature
	//variables value will not be changed, its final/Constant in nature
		// no static method in interface
	//no main method in interface
	//we can not create the object of interface
	//Interface is abstract in nature
	

}
