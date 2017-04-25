package MDA.EFSM;

public class S3 extends State{

	public S3(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void selectgas(int g)
	{
		if(sm.s == sm.LS[3])
		{
			sm.s = sm.LS[4];
			sm.getOP().SetPrice(g);
		}
		
	}

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
