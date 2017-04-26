package Output.DisplayMenu;

import DataStore.Data;

// This is abstract class which groups all Display Menu actions under one class.
public abstract class DisplayMenu {
	
	Data data;
	
	public DisplayMenu(Data data)
	{
		this.data= data;
	}
	
	public abstract void displaymenu();

}
