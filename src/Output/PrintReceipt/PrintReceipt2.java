package Output.PrintReceipt;

import DataStore.Data;
import DataStore.DataStore2;

public class PrintReceipt2 extends PrintReceipt {

	public PrintReceipt2(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printreceipt() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		
		System.out.println("Printing Receipt...");
		System.out.println("\n");
		
		System.out.println(d.l + "Gallons of " + d.gastype + "at price of $" + d.price + "per gallon");
		System.out.println("\n Total Amount :$" + d.total);
		System.out.println(" Cash Given: $" +d.cash);
		
		int daa = (int) d.cash;
		int paa = (int) d.total;
		int change = paa - daa;
		System.out.println(" Your change is: $" +change);
		System.out.println(" Transaction Finalized..!!");
		
	}

}
