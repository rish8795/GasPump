package GasPumps;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore1;
import DataStore.DataStore2;

public class GasPump2 extends Gaspumps{

	public GasPump2(AbstractFactory af) {
		super(af);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DisplayOps() {
		// TODO Auto-generated method stub
		
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
	
	public void start()
	{
		sm.start();
	}
	
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
	}
	
	public void regular()
	{
		sm.selectgas(1);
	}

	public void Super()
	{
		sm.selectgas(2);
	}
	
	public void Premium()
	{
		sm.selectgas(3);
	}
	
	public void StartPump()
	{
		sm.startpump();
	}

	public void PumpLiter()
	{
		DataStore2 d = (DataStore2) data;
		
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
		
	}

	public void Receipt()
	{
		sm.receipt();
	}
	
	public void NoReceipt()
	{
		sm.noreceipt();
	}
}
