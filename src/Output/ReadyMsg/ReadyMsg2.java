package Output.ReadyMsg;

import DataStore.Data;
import DataStore.DataStore2;

//this method is use to print ready message for gaspump2.
public class ReadyMsg2 extends ReadyMsg{

	public ReadyMsg2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readymsg() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		//print a message that gaspump2 is ready to dispense 1 liter of gas.
		System.out.println("Your Fuel is ready now, You can fill it. \n");
		System.out.println(" Select (8) to pump 1 liter of " + d.gastype + "gas");
		System.out.println("Select (9) to Stop operation");
		
	}

}
