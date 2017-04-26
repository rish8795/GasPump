package MDA.EFSM;

// State 4 in MDA.EFSM

public class S4 extends State{

	public S4(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}

	//TRANITION TO STATE S5 and call SetInitialPrice() and ReadyMsg() meta-action.
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
