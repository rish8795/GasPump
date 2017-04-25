package MDA.EFSM;

public class S5 extends State{

	public S5(StateMachine sm) {
		super(sm);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void pump()
	{
		if(sm.s == sm.LS[5])
		{
			//Same state
			sm.getOP().PumpGasUnit();
			sm.getOP().GasPumpedMsg();
		}
	}
	
	@Override
	void stoppump()
	{
		if(sm.s == sm.LS[5])
		{
			sm.s = sm.LS[6];
			sm.getOP().StopMsg();
		}
	}

}
