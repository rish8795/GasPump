package GasPumps;

import AbstractFactory.AbstractFactory;
import DataStore.Data;
import MDA.EFSM.StateMachine;
import OutputProcessor.OutputProcessor;

public abstract class Gaspumps {
	
	Data data;
	StateMachine sm;
	
	public Gaspumps(AbstractFactory af) {
		// TODO Auto-generated constructor stub
		this.data = af.getObject();
		this.sm = new StateMachine();
		this.sm.setOP(new OutputProcessor(af));
	}
	
	public abstract void DisplayOps();

}
