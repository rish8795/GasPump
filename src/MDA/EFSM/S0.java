package MDA.EFSM;

public class S0 extends State {

	public S0(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
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
