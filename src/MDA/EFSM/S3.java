package MDA.EFSM;

//State 3 in MDA.EFSM

public class S3 extends State{

	public S3(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
	// transition to state s4 and call SetPrice() meta-action
	@Override
	void selectgas(int g)
	{
		if(sm.s == sm.LS[3])
		{
			sm.s = sm.LS[4];
			sm.getOP().SetPrice(g);
		}
		
	}

	// transition to state s0 and call CancelMsg() and ReturnCash() meta-action
	@Override
	void cancel()
	{
		if(sm.s== sm.LS[3])
		{
			sm.s = sm.LS[0];
			sm.getOP().CancelMsg();
			sm.getOP().ReturnCash();
		}
	}
}
