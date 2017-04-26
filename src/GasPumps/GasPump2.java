package GasPumps;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore1;
import DataStore.DataStore2;


//This Class serves as a inputProcessor for Gaspump 2
public class GasPump2 extends Gaspumps{

	public GasPump2(AbstractFactory af) {
		super(af);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DisplayOps() {
		// TODO Auto-generated method stub
		
		// Print a menu of supported operations by Gaspump 2.
		
		System.out.println(
                "*******************************" +
                "\nSelect operation: " +
                "\n(0) Activate(int a, int b, int c) " +
                "\n(1) Start " +
                "\n(2) PayCash " +
                "\n(3) Regular " +
                "\n(4) Super" +
                "\n(5) Premium " +
                "\n(6) Cancel " +
                "\n(7) StartPump " +
                "\n(8) PumpLiter " +
                "\n(9) Stop " +
                "\n(p) PrintReceipt " +
                "\n(n) NoReceipt " +
                "\n{q} Quit the program " +
                "\n*********************************");
		
	}
	
	
	//Check the input parameters for correctness, and call the  activate() meta-event of the MDA.EFSM.
	// a == Regular gas
	// b == Super Gas
	// c == Premium Gas
	
	public void Activate(int a, int b, int c)
	{
			if(a>0 && b>0 && c>0)
			{
				DataStore2 d = (DataStore2) this.data;
				d.a = a;
				d.b = b;
				d.c = c;
				sm.activate();
			}
			else
			{
				System.out.println("Activation Failed..!!");
			}
	}
	
	// call meta-event start() of MDA.EFSM 
	public void start()
	{
		sm.start();
	}
	
	// Call the payType() meta-event of the MDA.EFSM, passing in "2" as the payment type.
	public void PayCash(float cash)
	{
		if(cash> 0)
		{
			DataStore2 d = (DataStore2) data;
			d.temp_cash = cash;
			sm.payType(2);
		}
		else{
			
		
			System.out.println("Cash Amount must be greater than 0...");
		}
	}
	
	public void Cancel()
	{
		sm.cancel();
		//call the SelectGas() meta-event of MDA.EFSM where passing 1 as gas type. 
	}
	
	public void regular()
	{
		sm.selectgas(1);
		//call the SelectGas() meta-event of MDA.EFSM where passing 1 as gas type. 
	}

	public void Super()
	{
		sm.selectgas(2);
		//call the SelectGas() meta-event of MDA.EFSM where passing 2 as gas type
	}
	
	public void Premium()
	{
		sm.selectgas(3);
		//call the SelectGas() meta-event of MDA.EFSM where passing 3 as gas type
	}
	
	public void StartPump()
	{
		sm.startpump();
		// call StartPump() meta-event of MDA.EFSM 
	}

	public void PumpLiter()
	{
		DataStore2 d = (DataStore2) data;
		// firstly we will check if we have any sufficient balance to pump another liter of gas. if user doesn't have sufficient balance then call stoppump()
		// otherwise call meta-event pump() method.
			if(d.cash < d.price * (d.l + 1))
			{
				System.out.println(" Oops!! Sorry you don't Have enough cash left");
				sm.stoppump();
			}
			
			else
			{
				sm.pump();
			}
		
	}
	
	public void StopPump()
	{
		sm.stoppump();
		// call meta-event stoppump() of MDA.EFSM
		
	}

	public void Receipt()
	{
		sm.receipt();
		// call meta-event Receipt() of MDA.EFSM which will print the receipt of gaspump 2.
	}
	
	public void NoReceipt()
	{
		sm.noreceipt();
		// call the meta-event noreceipt() of MDA.EFSM
	}
}
