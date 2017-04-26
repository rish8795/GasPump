package Output.PumpGasUnit;

import DataStore.Data;
import DataStore.DataStore1;

//method responsible for pumping a gallon of gas in gaspump1.
public class PumpGasUnit1 extends PumpGasUnit {

	public PumpGasUnit1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	// read and update pumping of gas.
	@Override
	public void pumpgasunit() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		
		//System.out.println("calling pumpgas1 pumpgasunit method for testing");
		// pumping 1 gallon gas and updating values.
		d.g++;
		d.total = d.price * d.g;
		
	}

}
