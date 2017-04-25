package Output.ReadyMsg;

import DataStore.Data;
import DataStore.DataStore2;

public class ReadyMsg2 extends ReadyMsg{

	public ReadyMsg2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readymsg() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		
		System.out.println("Your Fuel is ready now, You can fill it. \n");
		System.out.println(" Select (8) to pump 1 gallon of " + d.gastype + "gas");
		System.out.println("Select (9) to Stop operation");
		
	}

}
