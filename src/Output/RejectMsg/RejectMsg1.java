package Output.RejectMsg;

// this class is use to print credit card rejection message for gaspump1.
public class RejectMsg1 extends RejectMsg {

	@Override
	public void rejectmsg() {
		// TODO Auto-generated method stub
		//printing credit card declined message.
		System.out.println("Credit Card declined");
		System.out.println("Cancelling Transaction..."+ "\n Transaction Cancelled due to some error please try again!! :-(");
		
	}
	
	

}
