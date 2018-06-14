public class Economy extends AutoLoanService {
	public void economyAmount(int ta,int la) {
		 int downpayment = ta - la;
		System.out.println("the approved loan amount is" +la+ "and the downpayment is" +downpayment);
	}
}

