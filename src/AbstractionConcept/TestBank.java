package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.fund();
		
		Bank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		
		
		Bank b1 = new HDFCBank();
	
	}

}
