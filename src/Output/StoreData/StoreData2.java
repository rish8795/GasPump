package Output.StoreData;

import DataStore.Data;
import DataStore.DataStore2;

public class StoreData2 extends StoreData{

	public StoreData2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storedata() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		
		d.R_price = d.a;
		d.S_price = d.b;
		d.P_price = d.c;
		
		System.out.println("GasPump 2 value has been set sucessfully and GasPump 2 has been activated");
		
		
	}

}
