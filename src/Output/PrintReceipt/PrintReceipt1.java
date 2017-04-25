package Output.PrintReceipt;

import DataStore.Data;
import DataStore.DataStore1;

public class PrintReceipt1 extends PrintReceipt {

	public PrintReceipt1(Data data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printreceipt() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		System.out.println("Printing Receipt...");
		System.out.println("\n");
		
		System.out.println(d.g + "Gallons of " + d.gastype + "at price of $" + d.price + "per gallon");
		System.out.println("\n Total Amount :$" + d.total);
		System.out.println(" Transaction Finalized..!!");
		
	}

}
