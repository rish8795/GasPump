package AbstractFactory;


/*
 * This class serves as a factory which provides the driver objects for GasPump1.
 *  Object of the Outputprocessor will be instantiated with the object of this class to produce the output for GasPump1.
 *  
 *  */
import DataStore.Data;
import DataStore.DataStore1;
import Output.CancelMsg.CancelMsg;
import Output.CancelMsg.CancelMsg1;
import Output.DisplayMenu.DisplayMenu;
import Output.DisplayMenu.DisplayMenu1;
import Output.GasPumpedMsg.GasPumpedMsg;
import Output.GasPumpedMsg.GasPumpedMsg1;
import Output.PayMsg.PayMsg;
import Output.PayMsg.PayMsg1;
import Output.PrintReceipt.PrintReceipt;
import Output.PrintReceipt.PrintReceipt1;
import Output.PumpGasUnit.PumpGasUnit;
import Output.PumpGasUnit.PumpGasUnit1;
import Output.ReadyMsg.ReadyMsg;
import Output.ReadyMsg.ReadyMsg1;
import Output.RejectMsg.RejectMsg;
import Output.RejectMsg.RejectMsg1;
import Output.ReturnCash.ReturnCash;
import Output.ReturnCash.ReturnCash1;
import Output.SetInitialPrices.SetInitialPrice;
import Output.SetInitialPrices.SetInitialPrice1;
import Output.SetPrice.SetPrice;
import Output.SetPrice.SetPrice1;
import Output.StopMsg.StopMsg;
import Output.StopMsg.StopMsg1;
import Output.StoreCash.StoreCash;
import Output.StoreCash.StoreCash1;
import Output.StoreData.StoreData;
import Output.StoreData.StoreData1;
import Output.*;

public class Abstract_gp1 extends AbstractFactory{
	
	private Data data;
	
	public Abstract_gp1() {
		// TODO Auto-generated constructor stub
		// creates constructor whose reference is passed to all class who needs it.
		this.data = new DataStore1();
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
		// returns the cancelmsg class which describes the cancel message for gaspump 1.
		return new CancelMsg1();
	}

	@Override
	public DisplayMenu getdisplaymenu() {
		// TODO Auto-generated method stub
		// returns displaymenu class which displays menu for gaspump 1.
		return new DisplayMenu1(this.data);
	}

	@Override
	public GasPumpedMsg getgaspumpedmsg() {
		// TODO Auto-generated method stub
		/*
		 * Returns the GasPumpedMsg class that performs action for displaying the message that informs
		 * the user that a unit of gas has been pumped using GasPump1
		 *  */
		return new GasPumpedMsg1(this.data);
	}

	@Override
	public PayMsg getpaymsg() {
		// TODO Auto-generated method stub
		// returns payment message which is appropriate for gaspump 1
		return new PayMsg1();
	}

	@Override
	public PrintReceipt getprintreceipt() {
		// TODO Auto-generated method stub
		//  returns printreceipt class which is responsible for printing message for gaspump 1. 
		return new PrintReceipt1(this.data);
	}

	@Override
	public PumpGasUnit getpumpgasunit() {
		// TODO Auto-generated method stub
		// returns a PumpUnitGas class which pumps 1 gallon of gas at a time.
		return new PumpGasUnit1(this.data);
	}

	@Override
	public ReadyMsg getreadymsg() {
		// TODO Auto-generated method stub
		// returns ReadyMsg which is used to notify user that they can start pumping gas.
		return new ReadyMsg1(this.data);
	}

	@Override
	public RejectMsg getrejectmsg() {
		// TODO Auto-generated method stub
		// returns RejectMsg which notifies user that due to some error they cannot pursue further.
		return new RejectMsg1();
	}

	@Override
	public ReturnCash getreturncash() {
		// TODO Auto-generated method stub
		// gaspump 1 doesnot support any cash payment so this method will return nothing.
		return new ReturnCash1();
	}

	@Override
	public SetInitialPrice getinitialprice() {
		// TODO Auto-generated method stub
		// returns SetInitialPrice class which is used to set the initial values before the starting of puming of gas.
		return new SetInitialPrice1(this.data);
	}

	@Override
	public SetPrice getPrice() {
		// TODO Auto-generated method stub
		// returns SetPrice class which is used to set the value of gas according to the requirements of the gaspump 1.
		return new SetPrice1(this.data);
	}

	@Override
	public StopMsg getstopmsg() {
		// TODO Auto-generated method stub
		// returns StopMsg class which notifies users that pumping of gas has been stopped.
		return new StopMsg1();
	}

	@Override
	public StoreCash getstorecash() {
		// TODO Auto-generated method stub
		// returns StoreCash object appropriate for GasPump 1
		return new StoreCash1();
	}

	@Override
	public StoreData getstoredata() {
		// TODO Auto-generated method stub
		// returns the StoreData action strategy class appropriate for storing needed input data
		return new StoreData1(this.data);
	}

}
