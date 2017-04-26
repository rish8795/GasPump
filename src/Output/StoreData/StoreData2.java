package Output.StoreData;

import DataStore.Data;
import DataStore.DataStore2;

/*
 * GasPump2 StoreData action responsible for storing the "a" "b" and "c" price parameters specified by method "Activate" of the InputProcessor for GasPump1
*/

public class StoreData2 extends StoreData{

	public StoreData2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storedata() {
		// TODO Auto-generated method stub
		//Read the temporary variables "a", "b", and "c"  and initialize the gas prices of the system accordingly
		DataStore2 d = (DataStore2) data;
		
		d.R_price = d.a;
		d.S_price = d.b;
		d.P_price = d.c;
		
		System.out.println("GasPump 2 value has been set sucessfully and GasPump 2 has been activated");
		
		
	}

}
