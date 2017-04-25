package Output.SetPrice;

import DataStore.Data;
import DataStore.DataStore1;

public class SetPrice1 extends SetPrice {

	public SetPrice1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setprice(int g) {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		
			if(g==1)
			{
				d.price = d.R_price;
				d.gastype = "Regular Gas";
				
			}
			else if(g==2)
			{
				d.price = d.S_price;
				d.gastype = "Super Gas";
			}
		
			System.out.println(d.gastype + "fuel has been selected whose price is" + d.price + "per gallon" + "\n TO begin pumping of gas please press (8)");
	}

}
