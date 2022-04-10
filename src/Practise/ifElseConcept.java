package Practise;

public class ifElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b= 20;
		if(a>b)
		{
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		//comparision opertors;
		//< > <= .= == !=
		int c= 40;
		int d = 40;
		if(c==d)
		{
			System.out.println("c and d are equal");
		}
		else
		{
			System.out.println("c and d are not equal");
		}
		
		int a1= 100;
		int b1= 200;
		int c1= 300;
		if(a1>b1 & a1>c1) {
			System.out.println("A1 is the highest number");
		}
		else if (b1>c1 & b1>a1)
		{
			System.out.println("b1 is the highest number");
		}
		else {
			System.out.println("C1 is the highest number");
		}

	}

}
