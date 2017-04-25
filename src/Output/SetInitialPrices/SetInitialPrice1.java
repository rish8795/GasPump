package Output.SetInitialPrices;

import DataStore.Data;
import DataStore.DataStore1;

public class SetInitialPrice1 extends SetInitialPrice{

	public SetInitialPrice1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setinitialprice() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		d.g = 0;
		d.total = 0;
		
	}

}
