package AbstractionConcept;

public class BMW implements Car{
	
	public void start(){
		System.out.println("BMW - Start");
	}
	
	
	public void stop(){
	System.out.println("BMW - Stop");	
	}
	
	
	public void refuel(){
	System.out.println("BMW - Refule");	
	}

	
	//non overriding method
	public  void theftSaftey() {
		
		
		System.out.println("BMW = theftSaftey");
	}
	
	
	
}
