package Output.ReadyMsg;

import DataStore.Data;

//this is a abstract class which groups all ready message actions under one class.

public abstract class ReadyMsg {
	
	Data data;
	
	public ReadyMsg(Data data)
	{
		this.data = data;
	}
	
	public abstract void readymsg();

}
