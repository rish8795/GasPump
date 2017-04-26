package MDA.EFSM;

// This class is the abstract State superclass in the De-centralized State Design Pattern.

/* 
 * In this State methods are initially defined to print a "errormessage" message.
 * Each state subclass inherits these methods and overrides the appropriate ones.
 * This means that methods that do not get overridden will print a "errormessage" message
 * if they are called from a state that does not allow them to be called
 * */

public abstract class State {
	
	StateMachine sm;
	
	
		 public State(StateMachine sm) {
			// TODO Auto-generated constructor stub
			this.sm = sm;
		}

		 
		 void activate()
		 {
			 errormessage();
		 }
		 
		 void start()
		 {
			 errormessage();
		 }
		 
		 void paytype(int t)
		 {
			 errormessage();
		 }
		 
		 void approve()
		 {
			 errormessage();
		 }
		 
		 void reject()
		 {
			 errormessage();
		 }
		 
		 void selectgas(int g)
		 {
			 errormessage();
		 }
		 void cancel()
		 {
			 errormessage();
		 }
		 
		 void startpump()
		 {
			 errormessage();
		 }
		 
		 void pump()
		 {
			 errormessage();
		 }
		 
		 void stoppump()
		 {
			 errormessage();
		 }
		 
		 void receipt()
		 {
			 errormessage();
		 }
		 
		 void noreceipt()
		 {
			 errormessage();
		 }
		 
		 private void errormessage()
		 {
			 System.out.println("Sorry you have selected wrong option. This operation is not allowed in this state");
		 }
}
