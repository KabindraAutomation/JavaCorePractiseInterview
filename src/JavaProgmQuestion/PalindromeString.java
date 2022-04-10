package JavaProgmQuestion;

public class PalindromeString {
	
	
	public static void isPlalindromeString( String alpha)  {
		String rev = "";
		
		for(int i= alpha.length()-1; i>=0; i--) {
			
			rev = rev + alpha.charAt(i); 
				
		}
		if(rev.equals(alpha)) {
			
			System.out.println("Enter string is Palindrome "+ rev);
		}
		else {
			System.out.println("Etner string is not palindrome "+ rev);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPlalindromeString("kanaka");

	}

}
