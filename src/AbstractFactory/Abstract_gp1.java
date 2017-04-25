package AbstractFactory;

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
		this.data = new DataStore1();
	}

	@Override
	public Data getObject() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public CancelMsg getcancelmsg() {
		// TODO Auto-generated method stub
		
		return new CancelMsg1();
	}

	@Override
	public DisplayMenu getdisplaymenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu1(this.data);
	}

	@Override
	public GasPumpedMsg getgaspumpedmsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg1(this.data);
	}

	@Override
	public PayMsg getpaymsg() {
		// TODO Auto-generated method stub
		return new PayMsg1();
	}

	@Override
	public PrintReceipt getprintreceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt1(this.data);
	}

	@Override
	public PumpGasUnit getpumpgasunit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit1(this.data);
	}

	@Override
	public ReadyMsg getreadymsg() {
		// TODO Auto-generated method stub
		return new ReadyMsg1(this.data);
	}

	@Override
	public RejectMsg getrejectmsg() {
		// TODO Auto-generated method stub
		return new RejectMsg1();
	}

	@Override
	public ReturnCash getreturncash() {
		// TODO Auto-generated method stub
		return new ReturnCash1();
	}

	@Override
	public SetInitialPrice getinitialprice() {
		// TODO Auto-generated method stub
		return new SetInitialPrice1(this.data);
	}

	@Override
	public SetPrice getPrice() {
		// TODO Auto-generated method stub
		return new SetPrice1(this.data);
	}

	@Override
	public StopMsg getstopmsg() {
		// TODO Auto-generated method stub
		return new StopMsg1();
	}

	@Override
	public StoreCash getstorecash() {
		// TODO Auto-generated method stub
		return new StoreCash1();
	}

	@Override
	public StoreData getstoredata() {
		// TODO Auto-generated method stub
		return new StoreData1(this.data);
	}

}
