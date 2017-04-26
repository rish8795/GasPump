package Output.StoreData;

import DataStore.Data;
import DataStore.DataStore1;

/*
 * GasPump1 StoreData action responsible for storing the "a" and "b" price parameters specified by method "Activate" of the InputProcessor for GasPump1
*/
public class StoreData1  extends StoreData{

	public StoreData1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void storedata() {
		// TODO Auto-generated method stub
		// Read the temporary variables "a" and "b" and initialize the gas prices of the system accordingly
		DataStore1 d = (DataStore1) data;
		
		d.R_price = d.a;
		d.S_price = d.b;
		
		System.out.println("GasPump 1 value has been set sucessfully and GasPump 1 has been activated");
		
	}
	
	
}
