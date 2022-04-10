package OOPConceptPart2;

public class BMW extends Car{ //"has - a relationship (means= class to class relationship)

	public void start() { // Overriddent Methods
		
		//when same methods is present in parent class as well as in child class with the same name and same number of arguments is called method overriding.
		
		System.out.println("BMW-- start");
		
	}
	
	
	public void theftSaftey() {
		
		System.out.println("BMW -- theftsaftery");
	}
}
