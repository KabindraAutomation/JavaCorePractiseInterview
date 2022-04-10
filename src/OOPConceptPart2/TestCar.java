package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Static polymorphism -- or Comple time polymorphism--> method overriding 
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSaftey();
		b.engine();
		
		System.out.println("*********************************************************");
		
	 Car c = new Car();
	 c.start();
	 c.stop();
	 c.refuel();


	 System.out.println("*********************************************************");
	 
	 //Top Casting
	 Car c1= new BMW();//Child class object can be referred by parent class reference variable -- dynamic polymorphism --> Run time polymorphism
	 c1.start();
	 c1.start();
	 c1.refuel();
	 
	 
	 //Down Casting
	 BMW b1 = (BMW)new Car(); //Class Exception
	}

}
