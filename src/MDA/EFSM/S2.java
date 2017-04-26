package MDA.EFSM;

//State 2 in MDA.EFSM 

public class S2 extends State {

	public S2(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}

	// transition to state S3 and call DisplayMenu meta-action
	@Override
	void approve()
	{
		
		if(sm.s == sm.LS[2])
		{
			sm.s= sm.LS[3];
			sm.getOP().DisplayMenu();
		}
		
		
	}
	
	@Override
	void reject()
	{
		if(sm.s == sm.LS[2])
		{
			sm.s = sm.LS[0];
			sm.getOP().RejectMsg();
		}
	}
}
