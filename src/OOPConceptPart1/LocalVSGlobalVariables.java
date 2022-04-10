package OOPConceptPart1;

public class LocalVSGlobalVariables {
	//Global vars --> or class variable
	String name = "Tom";
	int age= 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i = 100; 	//local variable
	LocalVSGlobalVariables obj = new LocalVSGlobalVariables();
	System.out.println(obj.name);
	System.out.println(obj.age);

	}
	public void sum() {
	int i= 20; //local variable for sum method
	int j = 30; 
	int age = 25; 
	}

}
