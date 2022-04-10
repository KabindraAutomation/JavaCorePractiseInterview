package Practise;

public class ThrowKeywordConcept {// it will also handle the exception but throwskeyword we don't report any thing

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		ThrowKeywordConcept obj = new ThrowKeywordConcept();
		obj.sum();
		 
		

	}
	public void sum() throws ArithmeticException {
		div();
		
	}
	public  void div() throws ArithmeticException{  
		//when div method will throw the exceotion who will catch it-
		//Ans - Sum methos will catch. why? = coz sum method is calling div method
													
		int i = 9/0; //exception line
	
	}

}
