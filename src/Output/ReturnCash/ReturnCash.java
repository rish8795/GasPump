package Output.ReturnCash;

import DataStore.Data;

public abstract class ReturnCash {
	
	Data data;
	
	public ReturnCash()
	{
		// for gaspump 1
	}
	
	public ReturnCash(Data data)
	{
		// for gaspump2
		
		this.data = data;
	}
	
	public abstract void returncash();

}
