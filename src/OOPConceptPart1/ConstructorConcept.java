package OOPConceptPart1;

public class ConstructorConcept {
	//class variable : instance variables
	String name;
	
	int age; 
	
	 public ConstructorConcept() { // 0 parameter
		System.out.println("Default constructor");
		
	}
	 
	 public ConstructorConcept(int i ) { // 1 parameter
			System.out.println("1 parameter constructor");
		}
	 public ConstructorConcept(String name, int age ) { // 2 parameter
			System.out.println("Two constructor");
			this.name = name; //this.class variable = local variable
			this.age = age;
			System.out.println("Name of persone = "+ name);
			System.out.println(" Age of persone = "+ age);
			 
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to you call Constructor of any class? Ans. we have create obj
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept("pandu",30);
	

	}

}
