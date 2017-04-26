package Output.PrintReceipt;

import DataStore.Data;
import DataStore.DataStore2;

//GasPump2 method use for printing a receipt.
public class PrintReceipt2 extends PrintReceipt {

	public PrintReceipt2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printreceipt() {
		// TODO Auto-generated method stub
		// print receipt by reading appropriate values.
		DataStore2 d = (DataStore2) data;
		
		System.out.println("Printing Receipt...");
		System.out.println("\n");
		
		System.out.println(d.l + "Liters of " + d.gastype + "at price of $" + d.price + "per liter");
		System.out.println("\n Total Amount :$" + d.total);
		System.out.println(" Cash Given: $" +d.cash);
		
	//	int daa = (int) d.cash;
		//int paa = (int) d.total;
		//int change = paa - daa;
	//	System.out.println(" Your change is: $" +change);
		System.out.println(" Transaction Finalized..!!");
		
	}

}
