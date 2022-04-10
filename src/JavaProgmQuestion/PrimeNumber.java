package JavaProgmQuestion;

public class PrimeNumber {
	// 2 is the lowset prime number

	public static boolean isPrimeNumber(int num) {
		// edge/corner case:
		if (num <= 1) {

			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;

			}

		}
		return true;

	}
	public static void getPrimeNumber(int num) {
		
		for (int i = 2; i<= num; i++) {
			if(isPrimeNumber(i)) 
				System.out.println(i + " ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrimeNumber(2));

		// which can be divide by itself e.g 13 can be divide by 13. 13, 17, 19 is prime
		// no.
		getPrimeNumber(20);

	}

}
