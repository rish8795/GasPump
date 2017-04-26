package Output.StoreCash;

import DataStore.Data;
import DataStore.DataStore2;

// GasPump2 StoreCash action responsible for updating the shared data with the inserted cash amount during each transaction
public class StoreCash2 extends StoreCash {

	 public StoreCash2(Data data) {
		// TODO Auto-generated constructor stub
		 super(data);
	}
	
	 
	 /*
     Read the temporarily cash information input by the InputProcessor
     and store it in the cash attribute of the shared data.
     Then, print the amount of cash that was inserted
  */
	@Override
	public void storecash() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		d.cash = d.temp_cash;
		System.out.println("You have given Cash :$" +d.cash);
		
	}

}
