package Output.GasPumpedMsg;

import DataStore.Data;
import DataStore.DataStore2;

public class GasPumpedMsg2 extends GasPumpedMsg {

	public GasPumpedMsg2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gaspumpedmsg() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		
		System.out.println("Pumped 1 gallon of " +d.gastype+ "");
		System.out.println("Total gallons pumped: "+ d.l + "");
		
	}

}
