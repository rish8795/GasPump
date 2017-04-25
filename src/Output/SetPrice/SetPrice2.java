package Output.SetPrice;

import DataStore.Data;
import DataStore.DataStore2;

public class SetPrice2 extends SetPrice {

	public SetPrice2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setprice(int g) {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		
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
			
			else if(g==3)
			{
				d.price = d.P_price;
				d.gastype = "Premium Gas";
				
			}
			
			System.out.println(d.gastype + "has been selected at a price of $" + d.price + " \n You can Start pumping by pressing (7)" );
		
	}
	
	

}
