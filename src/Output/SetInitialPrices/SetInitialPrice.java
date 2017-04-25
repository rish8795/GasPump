package Output.SetInitialPrices;

import DataStore.Data;

public abstract class SetInitialPrice {
	
	Data data;
	
	public SetInitialPrice(Data data)
	{
		this.data = data;
	}
	
	public abstract void setinitialprice();
	
	

}
