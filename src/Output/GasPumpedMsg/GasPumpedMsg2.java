package Output.GasPumpedMsg;

import DataStore.Data;
import DataStore.DataStore2;

//GasPump2 action responsible for printing a message that gas has been pumped.
public class GasPumpedMsg2 extends GasPumpedMsg {

	public GasPumpedMsg2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gaspumpedmsg() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		//Informing user that 1 liter of gas pumped.
		System.out.println("Pumped 1 liter of " +d.gastype+ "");
		// displaying total number of liters pumped.
		System.out.println("Total liters pumped: "+ d.l + "");
		
	}

}
