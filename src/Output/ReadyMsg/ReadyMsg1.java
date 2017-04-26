package Output.ReadyMsg;

import DataStore.Data;
import DataStore.DataStore1;

// this method is use to print ready message for gaspump1.
public class ReadyMsg1  extends ReadyMsg{

	public ReadyMsg1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readymsg() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		//print a message that gaspump1 is ready to dispense 1 gallon of gas.
		System.out.println("Your Fuel is ready now, You can fill it. \n");
		System.out.println(" Select (9) to pump 1 gallon of " + d.gastype + "gas");
		System.out.println("Select (s) to Stop operation");
		
	}

}
