package AbstractFactory;

import DataStore.Data;
import DataStore.DataStore2;
import GasPumps.GasPump2;
import Output.CancelMsg.CancelMsg;
import Output.CancelMsg.CancelMsg2;
import Output.DisplayMenu.DisplayMenu;
import Output.DisplayMenu.DisplayMenu2;
import Output.GasPumpedMsg.GasPumpedMsg;
import Output.GasPumpedMsg.GasPumpedMsg2;
import Output.PayMsg.PayMsg;
import Output.PayMsg.PayMsg2;
import Output.PrintReceipt.PrintReceipt;
import Output.PrintReceipt.PrintReceipt2;
import Output.PumpGasUnit.PumpGasUnit;
import Output.PumpGasUnit.PumpGasUnit2;
import Output.ReadyMsg.ReadyMsg;
import Output.ReadyMsg.ReadyMsg2;
import Output.RejectMsg.RejectMsg;
import Output.RejectMsg.RejectMsg2;
import Output.ReturnCash.ReturnCash;
import Output.ReturnCash.ReturnCash2;
import Output.SetInitialPrices.SetInitialPrice;
import Output.SetInitialPrices.SetInitialPrice2;
import Output.SetPrice.SetPrice;
import Output.SetPrice.SetPrice2;
import Output.StopMsg.StopMsg;
import Output.StopMsg.StopMsg2;
import Output.StoreCash.StoreCash;
import Output.StoreCash.StoreCash2;
import Output.StoreData.StoreData;
import Output.StoreData.StoreData2;
import Output.*;


/*
 * This class serves as a factory which provides the driver objects for GasPump2.
 *  Object of the Outputprocessor will be instantiated with the object of this class to produce the output for GasPump2.
 *  
 *  */



public class Abstractgp2 extends AbstractFactory {
	
	
	private Data data;
	 public Abstractgp2() {
		// TODO Auto-generated constructor stub
		// creates constructor whose reference is passed to all class who needs it.
		this.data = new DataStore2();
	}

	@Override
	public Data getObject() {
		// TODO Auto-generated method stub
		// returns data structure that has been instantiated in constructor.
		return this.data;
	}

	@Override
	public CancelMsg getcancelmsg() {
		// TODO Auto-generated method stub
		// returns the cancelmsg class which describes the cancel message for gaspump 2.
		return new CancelMsg2();
	}

	@Override
	public DisplayMenu getdisplaymenu() {
		// TODO Auto-generated method stub
		// returns displaymenu class which displays menu for gaspump 2.
		return new DisplayMenu2(this.data);
	}

	@Override
	public GasPumpedMsg getgaspumpedmsg() {
		// TODO Auto-generated method stub
		/*
		 * Returns the GasPumpedMsg class that performs action for displaying the message that informs
		 * the user that a unit of gas has been pumped using GasPump2
		 *  */
		return new GasPumpedMsg2(this.data);
	}

	@Override
	public PayMsg getpaymsg() {
		// TODO Auto-generated method stub
		// returns payment message which is appropriate for gaspump 2.
		return new PayMsg2();
	}

	@Override
	public PrintReceipt getprintreceipt() {
		// TODO Auto-generated method stub
		// returns PrintReceipt class which is responsible for printing receipt specific for GasPump  2.
		return new PrintReceipt2(this.data);
	}

	@Override
	public PumpGasUnit getpumpgasunit() {
		// TODO Auto-generated method stub
	  /*
	   * 
	   * Returns the ReadyMsg class which is responsible for prompting the user to start pumping gas on GasPump2.
	   * The returned ReadyMsg class is already instantiated with the shared data structure it needs.
     */
		return new PumpGasUnit2(this.data);
	}

	@Override
	public ReadyMsg getreadymsg() {
		// TODO Auto-generated method stub
		// returns ReadyMsg which is used to notify user that they can start pumping gas.
		return new ReadyMsg2(this.data);
	}

	@Override
	public RejectMsg getrejectmsg() {
		// TODO Auto-generated method stub
		// returns RejectMsg which notifies user that due to some error they cannot pursue further.
		return new RejectMsg2();
	}

	@Override
	public ReturnCash getreturncash() {
		// TODO Auto-generated method stub
		// returns the ReturnCash object appropriate for GasPump 2 which is used to return the remaining cash.
		return new ReturnCash2(this.data);
	}

	@Override
	public SetInitialPrice getinitialprice() {
		// TODO Auto-generated method stub
		// returns SetInitialPrice class which is used to set the initial values before the starting of puming of gas.
		return new SetInitialPrice2(this.data);
	}

	@Override
	public SetPrice getPrice() {
		// TODO Auto-generated method stub
		// returns SetPrice class which is used to set the value of gas according to the requirements of the gaspump 2.
		return new SetPrice2(this.data);
	}

	@Override
	public StopMsg getstopmsg() {
		// TODO Auto-generated method stub
		// returns StopMsg class which notifies users that pumping of gas has been stopped.
		return new StopMsg2();
	}

	@Override
	public StoreCash getstorecash() {
		// TODO Auto-generated method stub
		// returns StoreCash object appropriate for GasPump 2 which is used to store price of each gas type.
		return new StoreCash2(this.data);
	}

	@Override
	public StoreData getstoredata() {
		// TODO Auto-generated method stub
		// returns the StoreData action strategy class appropriate for storing needed input data
		return new StoreData2(this.data);
	}

}
