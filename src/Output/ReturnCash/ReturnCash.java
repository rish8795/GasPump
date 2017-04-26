package Output.ReturnCash;
import DataStore.Data;

// this is a abstract class use to group all ReturnCash actions under one class.

public abstract class ReturnCash {
	
	Data data;
	
	public ReturnCash()
	{
		// for gaspump 1
		// GasPump1 will never call this constructor.
	}
	
	public ReturnCash(Data data)
	{
		// for gaspump2
		// GasPump2 needs shared data constructor.
		
		this.data = data;
	}
	
	public abstract void returncash();

}
