package MDA.EFSM;

public class InitialState extends State{

	public InitialState(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	
	void activate()
	{
	
		
		if(sm.s == sm.LS[7])
		{
			sm.s = sm.LS[0];
			sm.getOP().StoreData();
		}
		
	}

}
