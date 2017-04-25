package Output.DisplayMenu;

import DataStore.Data;
import DataStore.DataStore1;

/*
 * This class is use to print the menu.
 *  It is also use to print the credit card approval message.
 *  displaymenu() method is use to show the menu of available gases for gaspump1.
 *  */

public class DisplayMenu1 extends DisplayMenu{

	public DisplayMenu1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displaymenu() {
		// TODO Auto-generated method stub
		
		DataStore1 d = (DataStore1) data;
		System.out.println("Credit card approved");
		System.out.println("Please select gas type");
		System.out.println("All prices of gas are per gallon");
		System.out.println("Select (5) for Regular, Price $" + d.R_price + "\n Select (6) for Super, price $" + d.S_price +"\n or select (7) to cancel");
		
	}
	
	

}
