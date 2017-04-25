package Output.PumpGasUnit;

import DataStore.Data;
import DataStore.DataStore1;

public class PumpGasUnit1 extends PumpGasUnit {

	public PumpGasUnit1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pumpgasunit() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		
		System.out.println("calling pumpgas1 pumpgasunit method for testing");
		
		d.g++;
		d.total = d.price * d.g;
		
	}

}
