package GasPumps;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore1;


// This Class serves as a inputProcessor for Gaspump 1


public class GasPump1 extends Gaspumps {

	public GasPump1(AbstractFactory af) {
		super(af);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DisplayOps() {
		// TODO Auto-generated method stub
		
		// Print a menu of supported operations by Gaspump 1.
		
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
	
	//Check the input parameters for correctness, and call the  activate() meta-event of the MDA.EFSM.
	
   

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
		
		// call meta-event start() of MDA.EFSM 
		
		public void start()
		{
			sm.start();
		}
		
		// Call the payType() meta-event of the MDA.EFSM, passing in "1" as the payment type.
		
		public void PayCredit()
		{
			sm.payType(1);
			// printing credit card authentication message.
			System.out.println("Authenticating Credit Card...");
		}
		
		// call the meta-event Approve() of MDA.EFSM
		public void Approve()
		{
			sm.approve();
		}
		
		//call the meta-event Reject() of MDA.EFSM
		
		public void Reject()
		{
			sm.reject();
		}
		
		
		// call the meta-event Cancel() of MDA.EFSM
		public void Cancel()
		{
			sm.cancel();
		}
		
		//call the SelectGas() meta-event of MDA.EFSM where passing 1 as gas type. 
		public void regular()
		{
			sm.selectgas(1);
		}

		//call the SelectGas() meta-event of MDA.EFSM where passing 2 as gas type.
		public void Super()
		{
			sm.selectgas(2);
		}
		
		// call StartPump() meta-event of MDA.EFSM 
		public void StartPump()
		{
			sm.startpump();
		}

		// call PumpGallon() meta-event of MDA.EFSM
		public void PumpGallon()
		{
			sm.pump();
		}
		
		// call StopPump() meta-event of MDA.EFSM
		public void StopPump()
		{
			sm.stoppump();
			sm.receipt();
		}
}