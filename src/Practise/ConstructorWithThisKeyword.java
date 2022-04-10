package Practise;

public class ConstructorWithThisKeyword {

	//Class vars
	String name;
	int age;
	int level;
	
	 public ConstructorWithThisKeyword (String name, int age, int level) {
	
		 this.name = name;
		 this.age = age; 
		 this.level = level;
		 
		 System.out.println("Name = "+ name);
	System.out.println("Age "+ age);
	System.out.println("Class "+ level);	 
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30, 4);
		
		ConstructorWithThisKeyword obj1 = new ConstructorWithThisKeyword("John",33, 4);
		ConstructorWithThisKeyword obj2 = new ConstructorWithThisKeyword("Stephanie",35, 6);
		System.out.println(obj.name + " "+ obj.age + " "+ obj.level);
		System.out.println(obj1.name + " "+ obj1.age + " "+ obj1.level);
		System.out.println(obj2.name + " "+ obj2.age + " "+ obj2.level);
		
				
	}

}
