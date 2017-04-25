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



public class Abstractgp2 extends AbstractFactory {
	
	
	private Data data;
	 public Abstractgp2() {
		// TODO Auto-generated constructor stub
		this.data = new DataStore2();
	}

	@Override
	public Data getObject() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public CancelMsg getcancelmsg() {
		// TODO Auto-generated method stub
		return new CancelMsg2();
	}

	@Override
	public DisplayMenu getdisplaymenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu2(this.data);
	}

	@Override
	public GasPumpedMsg getgaspumpedmsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg2(this.data);
	}

	@Override
	public PayMsg getpaymsg() {
		// TODO Auto-generated method stub
		return new PayMsg2();
	}

	@Override
	public PrintReceipt getprintreceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt2(this.data);
	}

	@Override
	public PumpGasUnit getpumpgasunit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit2(this.data);
	}

	@Override
	public ReadyMsg getreadymsg() {
		// TODO Auto-generated method stub
		return new ReadyMsg2(this.data);
	}

	@Override
	public RejectMsg getrejectmsg() {
		// TODO Auto-generated method stub
		return new RejectMsg2();
	}

	@Override
	public ReturnCash getreturncash() {
		// TODO Auto-generated method stub
		return new ReturnCash2(this.data);
	}

	@Override
	public SetInitialPrice getinitialprice() {
		// TODO Auto-generated method stub
		return new SetInitialPrice2(this.data);
	}

	@Override
	public SetPrice getPrice() {
		// TODO Auto-generated method stub
		return new SetPrice2(this.data);
	}

	@Override
	public StopMsg getstopmsg() {
		// TODO Auto-generated method stub
		return new StopMsg2();
	}

	@Override
	public StoreCash getstorecash() {
		// TODO Auto-generated method stub
		return new StoreCash2(this.data);
	}

	@Override
	public StoreData getstoredata() {
		// TODO Auto-generated method stub
		return new StoreData2(this.data);
	}

}
