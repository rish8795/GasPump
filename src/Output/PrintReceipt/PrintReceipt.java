package Output.PrintReceipt;

import DataStore.Data;

public abstract class PrintReceipt {
	
	Data data;
	
	public PrintReceipt (Data data)
	{
		this.data = data;
	}
	
	public abstract void printreceipt();

}
