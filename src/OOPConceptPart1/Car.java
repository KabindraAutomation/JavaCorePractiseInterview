package OOPConceptPart1;

public class Car {
	//Class vars;
	int mod;
	int wheel; 

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Car(): ---> is the object of car class
		//new keyword is used to create the object
		//a,b,c --> Object reference variable.
		Car a = new Car();
		a.mod = 2018;
		a.wheel= 4;
		
		Car b = new Car();
		b.mod = 2014;
		b.wheel= 4;
			
		Car c = new Car(); 
		c.mod= 2013;
		c.wheel = 4;
		
		System.out.println("Befire assigning the references");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);

		
		System.out.println("After shifting the references");
		a= b;
		b= c;
		c= a;
		
		a.mod = 10;
		System.out.println(a.mod); //10
		c.mod = 20;
		System.out.println(a.mod);//20
		System.out.println(c.mod); //20
		
		
		
		
	}

}
