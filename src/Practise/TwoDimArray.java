package Practise;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][]= new String [3][5];
		x[0][0]= "A";
		x[0][1]= "b";
		x[0][2]= "C";
		x[0][3]= "D";
		x[0][4]= "E";
		
		x[1][0]= "A1";
		x[1][1]= "b1";
		x[1][2]= "C1";
		x[1][3]= "D1";
		x[1][4]= "E1";
		
		x[2][0]= "A2";
		x[2][1]= "b2";
		x[2][2]= "C2";
		x[2][3]= "D2";
		x[2][4]= "E2";
		
		System.out.println(x.length);// Output= 3 total no of row = 3
		System.out.println(x[0].length);// Output= Total no of column = 5
		
		for (int row = 0; row<x.length; row++) {
			
			for (int col = 0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
	
		
		
		
		
		
		

	}

}
