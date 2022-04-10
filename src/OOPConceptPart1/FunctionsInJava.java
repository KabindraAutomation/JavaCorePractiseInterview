package OOPConceptPart1;

public class FunctionsInJava {
	
	//main method--> Starting point of execution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, obj is the reference variable;
		//after creating the object, the copy of all non static methods will be given to this object.
		
		//main Method is void--> it will never the returns a values.
		obj.test();
		String p = obj.qa();
		System.out.println(p);
		int l = obj.pqr();
		System.out.println(l);
		
		int div = obj.division(30, 10);
		System.out.println(div);

	}
	
	// non static Method
	
	//Void- Does not return any value
	//return type = void
	public void test() { //no input, not output
		
		System.out.println("Test Method");
	}
	
	//return type = int
	public int pqr() { //no input, some output
		System.out.println("PQR method");
		int a = 10;
		int b= 20;
		int c= a+ b;
		return c;
	}
	
	//return type = String;
	public String qa() { //no input, some output;
		System.out.println("qa method");
		String s= "Selenium";
		return s; 
	}
	
	//return type = int
	//x, y --> input parameters or arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d= x/y;
		return d;
		
	}

}
