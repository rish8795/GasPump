package MDA.EFSM;

public class S4 extends State{

	public S4(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}

	@Override
	void startpump()
	{
		if(sm.s == sm.LS[4])
		{
			sm.s = sm.LS[5];
			sm.getOP().SetInitialPrice();
			sm.getOP().ReadyMsg();
		}
	}
}
