package AbstractionConcept;

public interface Car {  // full Abstraction.. inside interface when ever you define method no needs of method body
	
	
	int wheels = 4; /// by default this is final
	
	//Only final and static variables can define
	// I can have only and only abstract methods
	//always define only abstraction methods--
	// only method declaration 
	//achieve 100% abstraction
	//can not create the object of interface
	
	
	public void start();
	public void stop();
	public void refuel();
	

}
