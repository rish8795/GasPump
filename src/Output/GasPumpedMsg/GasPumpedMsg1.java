package Output.GasPumpedMsg;


import DataStore.Data;
import DataStore.DataStore1;

//GasPump1 action responsible for printing a message that gas has been pumped.
public class GasPumpedMsg1 extends GasPumpedMsg{

	public GasPumpedMsg1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gaspumpedmsg() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		//Informing User that 1 gallon has been pumped
		System.out.println("Pumped 1 gallon of " + d.gastype + "");
		//displays total number of gallons pumped.
		System.out.println("Total gallons pumped:" +d.g);
	}

}
