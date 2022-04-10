package Practise;

public class FunctionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionInJava obj = new FunctionInJava();
		int d = obj.sum();
		System.out.println(d);
	}
	//1.no inout no putput
	//void: doesn't return any value
	public void test() {
		
		System.out.println("Test metho");
		
	}
	
	// no input and some outPut
	public int sum() {
		System.out.println("Sum method");
		int a = 10;
		int b = 20;
		int sum = a+b;
		return sum();
		
	}
	public  String PQR() {
		
		System.out.println("PQR method");
		String s = "Selenium";
		return s;
				
	}
	//3. Some Input and some output
	public void div(int x, int y) {
		
		
		
	}
	

	

}
