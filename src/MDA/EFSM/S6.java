package MDA.EFSM;

public class S6 extends State {

	public S6(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
	// transition to state S0 and call PrintReceipt() and ReturnCash().
	@Override
	void receipt()
	{
		if(sm.s == sm.LS[6])
		{
			sm.s = sm.LS[0];
			sm.getOP().PrintReceipt();
			sm.getOP().ReturnCash();
		}
		
	}
	
	// transition to state S0 and call ReturnCash() meta-action.
	@Override
	void noreceipt()
	{
		if(sm.s == sm.LS[6])
		{
			sm.s = sm.LS[0];
			sm.getOP().ReturnCash();
			
		}
	}

}
