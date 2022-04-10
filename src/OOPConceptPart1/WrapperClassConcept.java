package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x= "100";
		System.out.println(x+20);
		
		
		//paseInt will data conversion: String onto Int:
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		//Interger, Double, Character, Boolean
		
		//String to double conversion:
		String y = "12.33";
		double d= Double.parseDouble(y);
		System.out.println(d);
		
		//String to boolean:
		String l = "true";
		boolean b = Boolean.parseBoolean(l);
		System.out.println(b);
		
		//int to String conversion:
		int j = 200; 
		System.out.println(j+20);
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		String u = "100A";
		int a1= Integer.parseInt(u);//NumberFormatException
		
	}

}
