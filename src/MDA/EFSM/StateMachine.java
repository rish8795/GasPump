package MDA.EFSM;

import OutputProcessor.OutputProcessor;

public class StateMachine {
	
	protected State s;
	protected State [] LS;
	private OutputProcessor op;
	
	
	public StateMachine()
	{
		LS = new State[8];
		
		
		LS[0] = new S0(this);
		LS[1] = new S1(this);
		LS[2] = new S2(this);
		LS[3] = new S3(this);
		LS[4] = new S4(this);
		LS[5] = new S5(this);
		LS[6] = new S6(this);
		LS[7] = new InitialState(this);
		
		s = LS[7];
	}
	
	
	public OutputProcessor getOP()
	{
		return op;
	}
	
	public void setOP(OutputProcessor op)
	{
		this.op = op;
	}

}
