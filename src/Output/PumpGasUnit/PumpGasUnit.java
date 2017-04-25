package Output.PumpGasUnit;

import DataStore.Data;

public abstract class PumpGasUnit {
	
	Data data;
	
	public PumpGasUnit(Data data)
	{
		this.data = data;
	}
	
	public abstract void pumpgasunit();

}
