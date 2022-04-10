package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.start();
		b.start();
		b.refuel();
		
		Car c = new BMW();
			c.start();
		c.stop();
		c.refuel();
	
		

	}

}
