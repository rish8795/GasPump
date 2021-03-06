package MDA.EFSM;

import OutputProcessor.OutputProcessor;
// it serves as a VM class in De-centralized state design pattern.

//state classes are use for performing actions and state transitions.

public class StateMachine {
	
	protected State s;
	protected State [] LS;
	private OutputProcessor op;
	
	
	public StateMachine()
	{
		//list of states in MDA.EFSM
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
	
	// Getters and Setters methods.
	public OutputProcessor getOP()
	{
		return op;
	}
	
	public void setOP(OutputProcessor op)
	{
		this.op = op;
	}
	
	
	
	public void activate() {
        s.activate();
    }

    public void start() {
        s.start();
    }

    public void payType(int t) {
        s.paytype(t);
    }

    public void approve() {
        s.approve();
    }

    public void reject() {
        s.reject();
    }

    public void cancel() {
        s.cancel();
    }
    
    public void selectgas(int g)
    {
    	s.selectgas(g);
    }
    
    public void startpump()
    {
    	s.startpump();
    }
    
    public void pump()
    {
    	s.pump();
    }
    public void stoppump()
    {
    	s.stoppump();
    }
    
    public void receipt()
    {
    	s.receipt();
    }
    
    public void noreceipt()
    {
    	s.noreceipt();
    }


}
