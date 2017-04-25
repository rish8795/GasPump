package Output.GasPumpedMsg;


import DataStore.Data;
import DataStore.DataStore1;

public class GasPumpedMsg1 extends GasPumpedMsg{

	public GasPumpedMsg1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gaspumpedmsg() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		System.out.println("Pumped 1 gallon of " + d.gastype + "");
		System.out.println("Total gallons pumped:" +d.g);
	}

}
