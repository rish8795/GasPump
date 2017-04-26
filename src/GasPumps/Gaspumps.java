package GasPumps;

import AbstractFactory.AbstractFactory;
import DataStore.Data;
import MDA.EFSM.StateMachine;
import OutputProcessor.OutputProcessor;


/* 
 * This class serves as a abstract super class which implements client side of AbstractFactory pattern.
 * 
 * It has a constructor whose subclasses can be used to develop various drivers for gaspumps
 * 
 * */
public abstract class Gaspumps {
	
	Data data;
	StateMachine sm;
	
	public Gaspumps(AbstractFactory af) {
		// TODO Auto-generated constructor stub
		this.data = af.getObject();
		this.sm = new StateMachine();
		this.sm.setOP(new OutputProcessor(af));
	}
	
	/*
	 *  Each GasPump must display a menu of its supported operations
 */
	
	public abstract void DisplayOps();

}
