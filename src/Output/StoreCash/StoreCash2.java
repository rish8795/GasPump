package Output.StoreCash;

import DataStore.Data;
import DataStore.DataStore2;

public class StoreCash2 extends StoreCash {

	 public StoreCash2(Data data) {
		// TODO Auto-generated constructor stub
		 super(data);
	}
	
	@Override
	public void storecash() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		d.cash = d.temp_cash;
		System.out.println("You have given Cash :$" +d.cash);
		
	}

}
