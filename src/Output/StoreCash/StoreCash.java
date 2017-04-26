package Output.StoreCash;

import DataStore.Data;

// this is a abstract class which groups all the StoreCash actions into a single class.
public abstract class StoreCash {
	
	Data data;
	
	public StoreCash()
	{
		//this is for gaspump1 but as there is no PayCash method in gasPump1 it will never use it.
	}
	
	public StoreCash(Data data)
	{
		// this constructor is for GasPump2.
		this.data = data;
	}
	
	public abstract void storecash();

}
