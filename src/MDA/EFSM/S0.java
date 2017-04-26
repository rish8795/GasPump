package MDA.EFSM;


// State S0 in MDA.EFSM
public class S0 extends State {
	
	public S0(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
	// Transition to state S1 and call PayMsg() meta-action
	@Override
	void start()
	{
		if(sm.s == sm.LS[0])
		{
			sm.s = sm.LS[1];
			sm.getOP().PayMsg();
		}
		
	}

}
