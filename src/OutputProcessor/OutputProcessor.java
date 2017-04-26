package OutputProcessor;
import AbstractFactory.AbstractFactory;
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

//This class is the general output processor for the gas pump system.
// Each meta-action in this class calls the platform specific implementation of the action.
//This class acts as the "Client" class in the strategy design pattern.


public class OutputProcessor {

	
	private CancelMsg cancelmsg;
    private DisplayMenu displaymenu;
    private GasPumpedMsg gaspumpedmsg;
    private PayMsg paymsg;
    private PrintReceipt printreceipt;
    private PumpGasUnit pumpgasUnit;
    private ReadyMsg readymsg;
    private RejectMsg rejectmsg;
    private ReturnCash returncash;
    private SetInitialPrice setinitialprice;
    private SetPrice setprice;
    private StopMsg stopmsg;
    private StoreCash storecash;
    private StoreData storedata;

	public OutputProcessor(AbstractFactory af)
	{
		this.cancelmsg = af.getcancelmsg();
		this.displaymenu = af.getdisplaymenu();
		this.gaspumpedmsg = af.getgaspumpedmsg();
		this.paymsg = af.getpaymsg();
		this.printreceipt = af.getprintreceipt();
		this.pumpgasUnit = af.getpumpgasunit();
		this.readymsg = af.getreadymsg();
		this.rejectmsg = af.getrejectmsg();
		this.returncash = af.getreturncash();
		this.setinitialprice = af.getinitialprice();
		this.setprice = af.getPrice();
		this.stopmsg = af.getstopmsg();
		this.storecash = af.getstorecash();
		this.storedata = af.getstoredata();
		
		
	}
	
	public void CancelMsg()
	{
		this.cancelmsg.cancelmsg();
	}
	
	public void DisplayMenu()
	{
		this.displaymenu.displaymenu();
	}
	
	public void GasPumpedMsg()
	{
		this.gaspumpedmsg.gaspumpedmsg();
	}
	
	public void PayMsg()
	{
		this.paymsg.paymsg();
	}
	
    public void PrintReceipt()
    {
    	this.printreceipt.printreceipt();
    }
	
	

	public void PumpGasUnit()
	{
		this.pumpgasUnit.pumpgasunit();
	}
	
	public void ReadyMsg()
	{
		this.readymsg.readymsg();
	}
	
	public void RejectMsg()
	{
		this.rejectmsg.rejectmsg();
	}
	
	public void ReturnCash()
	{
		this.returncash.returncash();
	}
	
	public void SetInitialPrice()
	{
		this.setinitialprice.setinitialprice();
	}
	
	public void SetPrice(int g)
	{
		this.setprice.setprice(g);
	}
	
	public void StopMsg()
	{
		this.stopmsg.stopmsg();
	}
	
	public void StoreCash()
	{
		this.storecash.storecash();
	}
	
	public void StoreData()
	{
		this.storedata.storedata();
	}
}
