package Output.PumpGasUnit;

import DataStore.Data;
import DataStore.DataStore2;

public class PumpGasUnit2 extends PumpGasUnit {

	public PumpGasUnit2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pumpgasunit() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		
		System.out.println("Callling pumpgasunit method of gp 2 for testing");
		d.l++;
		d.total = d.price * d.l;
		
	}

}
