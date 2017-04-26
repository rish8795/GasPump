package Output.SetInitialPrices;

import DataStore.Data;
//abstract class use to group all SetInitial price actions under one class.

public abstract class SetInitialPrice {
	
	Data data;
	
	public SetInitialPrice(Data data)
	{
		this.data = data;
	}
	
	public abstract void setinitialprice();
	
	

}
