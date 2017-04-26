package Output.SetPrice;
import DataStore.Data;

//this is a abstract class which groups all SetPrice actions under one class.

public abstract class SetPrice {

	Data data;
	
	public SetPrice(Data data)
	{
		this.data = data;
	}
	
	public abstract void setprice(int g);
}
