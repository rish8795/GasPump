package Output.PrintReceipt;

import DataStore.Data;

// this is abstract class use to group all PrintReceipt actions under one action.

public abstract class PrintReceipt {
	
	Data data;
	
	public PrintReceipt (Data data)
	{
		this.data = data;
	}
	
	public abstract void printreceipt();

}
