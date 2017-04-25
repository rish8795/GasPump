package Output.ReturnCash;

import DataStore.Data;
import DataStore.DataStore2;

public class ReturnCash2 extends ReturnCash{
	
	public ReturnCash2(Data data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void returncash() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		float return_c = d.cash - d.total;
		
			if(return_c > 0)
				{
					System.out.println("Your remaining cash is " +return_c);
				}
			else
			{
				System.out.println("No cash to return");
				
			}
		d.cash = 0;
		
		System.out.println("Transaction finalized..!!");
		
		
	}

}
