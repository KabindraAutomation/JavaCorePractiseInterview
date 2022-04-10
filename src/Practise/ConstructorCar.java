package Practise;

public class ConstructorCar {

	String name;
	String modelNumber;
	int price;
	String engine;

	public ConstructorCar(String name, String modelNumber, int price, String engine) {
		
		this.name= name;
		this.modelNumber = modelNumber;
		this .price= price;
		this.engine = engine; 

	}

	public static void main(String[] args) {
		ConstructorCar obj1 = new ConstructorCar("Toyota", "RAV4", 25, "Automatic");
		System.out.println(obj1.name + " "+ obj1.modelNumber + " "+ obj1.price + " "+ obj1.engine);
		ConstructorCar obj2 = new ConstructorCar("Honda", "Acodiya", 25, "Semi- Automatic");
		System.out.println(obj2.name + " "+ obj2.modelNumber + " "+ obj2.price + " "+ obj2.engine);
		

	}

}
