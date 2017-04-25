package MDA.EFSM;

public class S1 extends State {

	public S1(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void paytype(int t)
	{
		if((t==1) && (sm.s == sm.LS[1]))
		{
			sm.s = sm.LS[2];
		}
		else if((t==2) && (sm.s == sm.LS[1]))
		{
			sm.s = sm.LS[3];
			sm.getOP().StoreCash();
			sm.getOP().DisplayMenu();
		}
	}

}
