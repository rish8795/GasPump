package Output.DisplayMenu;

import DataStore.Data;
import DataStore.DataStore2;

public class DisplayMenu2 extends DisplayMenu{

	public DisplayMenu2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displaymenu() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		
		System.out.println("Please select gas type");
		System.out.println("All prices of gas are per gallon");
		System.out.println("Select (3) for Regular, Price $" + d.R_price + 
								"\n Select (4) for Super, price $" + d.S_price + 
											"Select (5) for Premium, Price $" + d.P_price +"\n or select (6) to cancel");
		
	}

}
