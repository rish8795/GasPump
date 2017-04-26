package Output.PumpGasUnit;

import DataStore.Data;

//this is a abstract class use to group all gaspump unit actions under one class.
public abstract class PumpGasUnit {
	
	Data data;
	
	public PumpGasUnit(Data data)
	{
		this.data = data;
	}
	
	public abstract void pumpgasunit();

}
