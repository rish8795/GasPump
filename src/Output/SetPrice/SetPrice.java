package Output.SetPrice;

import DataStore.Data;

public abstract class SetPrice {

	Data data;
	
	public SetPrice(Data data)
	{
		this.data = data;
	}
	
	public abstract void setprice(int g);
}
