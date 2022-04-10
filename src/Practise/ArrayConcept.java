package Practise;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//array to store similar data type values in a array variable
		//1.int array
		//Lowest bound/ index = 0
		//Upper bound index = n-1 ( n is size of array)
		
		//disadvantage of array:
		//1. size is fixed- Static Array--> To overcome this problem -- we use collecction--> ArrayList, HashTable--> use dynamic array
		/*2. Stores only similar data types--> In Array we cannot store different data type like int, double string at same time.
		To overcome this problem, we use Object array */
		
		//if you will try to i[4] excepetion = ArrayIndexOutOfBoundsException
		int i[] = new int[4];
		i[0]= 10;
		i[1]= 20;
		i[2]=30;
		i[3]=40; 
		
		//Print all the value of array: using for loop
		for(int j= 0; j<i.length; j++) {
			System.out.println(i[j]);
			
		}
		// 2. double array;
		double d[] = new double[3];
		d[0]= 12.22;
		d[1]=13.33;
		d[2]= 14.33;
		 
		for (int p = 0; p<d.length; p++) {
			System.out.println(d[p]);
		}
		//3. Char Array
		char c[]= new char[3];
		c[0]= 'a';
		c[1]= 's';
		c[2]= 'p';
		
		//4.Boolean array
		boolean b[] = new boolean[2];
		b[0]= true;
		b[1]= false;
		
		//5. String Array;
		String s[]= new String[3];
		s[0]= "test";
		s[1]= "Automation";
		s[2]= "Learning";
		System.out.println(s.length);
		for (int q = 0; q<s.length; q++) {
			System.out.println(s[q]);
		}
		
		//6. Object Array:(Object is class--> object array is used to store different data types values.)
		Object ob[] = new Object[6];
		ob[0]= "Tom";
		ob[1]= 25;
		ob[2]= 12.33;
		ob[3]= "1/1/1990";
		ob[4]= 'M';
		ob[5]= "London";
		for (int r = 0; r<ob.length; r++) {
			System.out.println(ob[r]);
		}

	}

}
