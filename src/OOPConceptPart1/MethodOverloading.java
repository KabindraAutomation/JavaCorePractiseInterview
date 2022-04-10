package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 30);

	}
	
	//we can overload mani method also but not usally do that. 
	//you can not create method inside a method.
	//duplicate methods--> i.e same method name with same number of arguments are not allowed.
	
	
	//Method overloading --> when the method name is same with different arguments or input parameters within the same class.
	public void sum() { // zero parameter
		
		System.out.println("summ method-- zero param");
	}
	
	public void sum(double d) { //one input parameter
		
		System.out.println("summ method-- one input param");
		System.out.println(d);
	}
	public void sum(int i) { //one input parameter
		
		System.out.println("summ method-- one input param");
		System.out.println(i);
	}
	 void sum(int i, int j) {// two input paramerter 
		
		System.out.println("summ method-- two input param");
		System.out.println(i+j);
		//System.out.println(j);
		
	}
	

}
