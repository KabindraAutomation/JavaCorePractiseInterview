package Practise;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it store the value bases on the index
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.23);
		ar.add('M');
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(7));
		System.out.println("*****************************************");
		//using java Stram
		ar.stream().forEach(b->System.out.println(b));
				
		//to print all the values aor Array List By Using For next:
		for( int i = 0; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
		}
			
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(100);
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Hello Learner");
		
		

	}

}
