package Output.SetInitialPrices;

//initializing the necessary attributes to begin a transaction calculation for GasPump1.
import DataStore.Data;
import DataStore.DataStore1;

public class SetInitialPrice1 extends SetInitialPrice{

	public SetInitialPrice1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setinitialprice() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		//Set the number of gallons pumped and payment balance initially to zero for this transaction
		d.g = 0;
		d.total = 0;
		
	}

}
