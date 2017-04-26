package Output.ReturnCash;

import DataStore.Data;
import DataStore.DataStore2;
// GasPump2 returncash is responsible for retruning the remaining amount of cash.
public class ReturnCash2 extends ReturnCash{
	
	public ReturnCash2(Data data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	// this method will first calculate the total bill amount generated and then it will calculate the change necessary. if there is any change left then it will return back.
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
