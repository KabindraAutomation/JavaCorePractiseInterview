package JavaProgmQuestion;

public class PalindromeNumber {
	//151, 454, 34543
	
	public static void isPalindromeNumber(int num) {
		int r = 0; 
		int sum = 0; 
		int t;	
		t= num;
		
		while (num>0) {
			r= num % 10;
			sum= (sum *10)+ r;
			num = num/10; 
		}
		if(t== sum) {
			System.out.println("Enter number is palindrome number "+ sum);
		}
		else {
			
			System.out.println("Enter number is not palindrome number "+ sum);
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindromeNumber(254);
		
		
		
	}

}
