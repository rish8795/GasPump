package AbstractFactory;

import DataStore.Data;
import Output.CancelMsg.CancelMsg;
import Output.DisplayMenu.DisplayMenu;
import Output.GasPumpedMsg.GasPumpedMsg;
import Output.PayMsg.PayMsg;
import Output.PrintReceipt.PrintReceipt;
import Output.PumpGasUnit.PumpGasUnit;
import Output.ReadyMsg.ReadyMsg;
import Output.RejectMsg.RejectMsg;
import Output.ReturnCash.ReturnCash;
import Output.SetInitialPrices.SetInitialPrice;
import Output.SetPrice.SetPrice;
import Output.StopMsg.StopMsg;
import Output.StoreCash.StoreCash;
import Output.StoreData.StoreData;

/* 
 * this class groups all classes under one single classes and It defines methods
 * which return the GasPump specific action components which all Abstract_gp's need to implement
 * 
 * */
public abstract class AbstractFactory {

	public abstract Data getObject();
	
	public abstract CancelMsg getcancelmsg();
	
	public abstract DisplayMenu getdisplaymenu();
	
	public abstract GasPumpedMsg getgaspumpedmsg();
	
	public abstract PayMsg getpaymsg();
	
	public abstract PrintReceipt getprintreceipt();
	
	public abstract PumpGasUnit getpumpgasunit();
	
	public abstract ReadyMsg getreadymsg();
	
	public abstract RejectMsg getrejectmsg();
	
	public abstract ReturnCash getreturncash();
	
	public abstract SetInitialPrice getinitialprice();
	
	public abstract SetPrice getPrice();
	
	public abstract StopMsg getstopmsg();
	
	public abstract StoreCash getstorecash();
	
	public abstract StoreData getstoredata();
	
}
