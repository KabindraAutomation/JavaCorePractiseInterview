package Practise;

public class PalimString {
	
	
	public static void checkpalimstring(String a) {
		String rev= ""; 
		for(int i =a.length()-1; i>=0; i--) {
			rev = rev+ a.charAt(i);
			
			
		}
		if(rev.equals(a)) {
			
			System.out.println("Enter word is palindrome");
		}
		else
		{
			System.out.println("Etner workd is not palindrome");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkpalimstring("plp");
		checkpalimstring("tildd");

	}

}
