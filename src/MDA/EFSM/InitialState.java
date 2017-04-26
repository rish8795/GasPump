package MDA.EFSM;


// this is the initial state in MDA.EFSM
public class InitialState extends State{

	public InitialState(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	
	void activate()
	{
	
		// Transition to state S0 and call StoreData() meta-action.
		
		if(sm.s == sm.LS[7])
		{
			sm.s = sm.LS[0];
			sm.getOP().StoreData();
		}
		
	}

}
