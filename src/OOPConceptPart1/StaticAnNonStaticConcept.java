package OOPConceptPart1;

public class StaticAnNonStaticConcept {
	//global variable: the scope of global vars will be available across all the functions with some conditions
	
	String name = "Tom"; // non static gloable variable.
	static int age = 20; // Static gloable variable.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to call static methods and variables?--> There are two ways of calling
		//1. Direct calling;
		sum();
		//2.calling by classname;
		StaticAnNonStaticConcept.sum();
		
		
		//how to call variable? same as method
		//1.direct call:
		System.out.println(age);
		//2. calling by class
		System.out.println(StaticAnNonStaticConcept.age);
		
		// ************************************************************************
		//how to call non static methods and variables? --> we need to create object and new className
		StaticAnNonStaticConcept obj = new StaticAnNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can I access static methods by using object reference? Yes
		obj.sum(); //Warning will be given it is not a good way of calling for static method
		
	
		
	}
	public void sendMail() { //Non static method
		System.out.println("Send mail method");
	}
	public static void sum() { //Static Method
		
		System.out.println("Sum Method");
	}
// At concluse, for Non static variables and methods we have to call by  creating objects and for non static methods and varaible you can call by directly or calling by className/.
}
