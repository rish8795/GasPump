package Output.GasPumpedMsg;

import DataStore.Data;

// this is abstract class which groups GasPumpedMsg actions under 1 class.
public abstract class GasPumpedMsg {
	
	Data data;
	public GasPumpedMsg(Data data)
	{
		this.data = data;
	}
	
	public abstract void gaspumpedmsg();

}
