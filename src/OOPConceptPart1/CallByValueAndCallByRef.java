package OOPConceptPart1;

public class CallByValueAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		obj.testsum(10, 20);
		int x = 10;
		int y = 20;
		obj.testsum(x, y); //call by value OR pass by value
		
		obj.p = 50;
		obj.q= 60;
		
		obj.swap(obj);
		
		//after swap 
		System.out.println("value for p = " + obj.p);
		System.out.println("Value of q =  " + obj.q);
		
		
		
		
	}
	
	public int testsum(int a, int b) {
		a = 30;
		b= 40;
		int c= a+b;
		return c ;
		
	}
	//call by reference
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp= t.p; //temp = 50
		t.p = t.q; //t.p = 60
		t.q= temp; //t.q= 50
		
	}

}
