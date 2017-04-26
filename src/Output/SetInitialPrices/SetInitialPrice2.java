package Output.SetInitialPrices;

import DataStore.Data;
import DataStore.DataStore2;

////initializing the necessary attributes to begin a transaction calculation for GasPump2.
public class SetInitialPrice2 extends SetInitialPrice{

	public SetInitialPrice2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setinitialprice() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		//Set the number of liters pumped and payment balance initially to zero for this transaction
		d.l = 0;
		d.total = 0;
		
	}

}
