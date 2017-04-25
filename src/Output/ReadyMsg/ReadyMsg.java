package Output.ReadyMsg;

import DataStore.Data;

public abstract class ReadyMsg {
	
	Data data;
	
	public ReadyMsg(Data data)
	{
		this.data = data;
	}
	
	public abstract void readymsg();

}
