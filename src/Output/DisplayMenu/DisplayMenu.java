package Output.DisplayMenu;

import DataStore.Data;

public abstract class DisplayMenu {
	
	Data data;
	
	public DisplayMenu(Data data)
	{
		this.data= data;
	}
	
	public abstract void displaymenu();

}
