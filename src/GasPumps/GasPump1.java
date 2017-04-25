package GasPumps;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore1;

public class GasPump1 extends Gaspumps {

	public GasPump1(AbstractFactory af) {
		super(af);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DisplayOps() {
		// TODO Auto-generated method stub
		
		System.out.println(
                "*******************************" +
                "\nSelect operation: " +
                "\n(0) Activate(float a, float b) " +
                "\n(1) Start " +
                "\n(2) PayCredit " +
                "\n(3) Approve " +
                "\n(4) Reject" +
                "\n(5) Regular " +
                "\n(6) Super " +
                "\n(7) Cancel " +
                "\n(8) StartPump " +
                "\n(9) PumpGallon " +
                "\n(s) StopPump " +
                "\n{q} Quit the program " +
                "\n*********************************");
		
	}
	

		public void Activate(float a, float b)
		{
				if(a>0 && b>0)
				{
					DataStore1 d = (DataStore1) this.data;
					d.a = a;
					d.b = b;
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
		
		public void PayCredit()
		{
			sm.payType(1);
			System.out.println("Authenticating Credit Card...");
		}
		
		public void Approve()
		{
			sm.approve();
		}
		
		public void Reject()
		{
			sm.reject();
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
		
		public void StartPump()
		{
			sm.startpump();
		}

		public void PumpGallon()
		{
			sm.pump();
		}
		
		public void StopPump()
		{
			sm.stoppump();
			sm.receipt();
		}
}