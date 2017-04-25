package Output.ReadyMsg;

import DataStore.Data;
import DataStore.DataStore1;

public class ReadyMsg1  extends ReadyMsg{

	public ReadyMsg1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readymsg() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		
		System.out.println("Your Fuel is ready now, You can fill it. \n");
		System.out.println(" Select (9) to pump 1 gallon of " + d.gastype + "gas");
		System.out.println("Select (s) to Stop operation");
		
	}

}
