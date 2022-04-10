package Practise;

public class ExceptionHandling {

	
	//int a = 10;
	//Static  ExceptionHandling obj;
	public static void main(String[] args)  {
		
		// Uncaught exception: 
		//int i = 9/0;
		
		//caught exception:
		//Thread.sleep(2000);
		
		//1. try -- catch block
		try {
			
			int i = 9/0; // this code will throw an exception
		}
		catch(Exception e){  // instead of writing invividual exception we can also write Exception
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("ABC");
		
		//Creating own exception by using "throw" key work
		String Exe_Flag= "N";
		if(Exe_Flag.equals("N")) {
			try {
				throw new Exception("Custome Execption flag is No Exception by Kabin");	
			}catch(Exception e) {
				
				e.printStackTrace();
			}
				
		}
		
		System.out.println("Still it can be run");
		
		

	}

}
