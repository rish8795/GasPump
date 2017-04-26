package Output.SetPrice;

import DataStore.Data;
import DataStore.DataStore1;

// SetPrice is use to update the price based on selected Gas type.
public class SetPrice1 extends SetPrice {

	public SetPrice1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setprice(int g) {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		// set the price per gallon of whichever gas is selected.
		// g = 1 i.e Regular Gas.
		// g = 2 i.e Super Gas.
		
			if(g==1)
			{
				d.price = d.R_price;
				d.gastype = "Regular Gas"; //regular selected
				
			}
			else if(g==2)
			{
				d.price = d.S_price;
				d.gastype = "Super Gas"; // super selected
			}
		
			System.out.println(d.gastype + "fuel has been selected whose price is" + d.price + "per gallon" + "\n TO begin pumping of gas please press (8)");
	}

}
