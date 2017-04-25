package Main;

import AbstractFactory.*;
import DataStore.DataStore2;
import GasPumps.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Driver {
	
		public static void main(String[] args)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Please select type of GasPump: " +
									"\n 1. GasPump 1" + 
										"\n 2. GasPump 2");
			
			int p_type;
			
			String input = "initial";
			try{
					p_type = Integer.parseInt(br.readLine());
					
					switch(p_type)
					{
						case 1: {
									Abstract_gp1 af1 = new Abstract_gp1();
									GasPump1 gp1 = new GasPump1(af1);
									 System.out.println(
					                            "GasPump-1 " +
					                                    "\n Operations: " +
					                                    "\n*******************************" +
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
					                                    "\n(s) StopPump" +
					                                    "\n{q} Quit the program" +
					                                    "\n********************************"
					                    );
									 
									 while (!input.equals("q")) {
					                        gp1.DisplayOps();
					                        input = br.readLine();
					                        switch (input) {
					                        case "0":{
					                        	 System.out.println("***Activate***");
					                                float a, b;
					                                System.out.println("Enter the price parameter a: ");
					                                try {
					                                	 a = Float.parseFloat(br.readLine());
					                                	 System.out.println(" Enter the parameter b: ");
					                                	 b = Float.parseFloat(br.readLine());
					                                	 gp1.Activate(a, b);
					                                    }catch (Exception e){
					                                    	System.out.println(e.getMessage());
					                                    }
					                                  break;  	
					                                 }
					                        case "1":{
							                        	System.out.println("***Start***");
						                                gp1.start();
						                                break;
							                       	}
					                        
					                        case "2":{
					                        			System.out.println("PayCredit");
					                        			gp1.PayCredit();
					                        			break;
					                        		 }
					                        
					                        case "3":{
					                        			System.out.println("***Approved***");		
					                        			gp1.Approve();
					                        			break;
					                        		}
					                        
					                        case "4":{
					                        			System.out.println("Reject");
					                        			gp1.Reject();
					                        			break;
					                        }
					                                
					                        case "5":{
			                        			System.out.println("Regular");
			                        			gp1.regular();
			                        			break;
			                        }
					                        case "6":{
			                        			System.out.println("Super");
			                        			gp1.Super();
			                        			break;
			                        }
					                        case "7":{
			                        			System.out.println("Cancel");
			                        			gp1.Cancel();
			                        			break;
			                        }
					                        case "8":{
			                        			System.out.println("StartPump");
			                        			gp1.StartPump();
			                        			break;
			                        }
					                        case "9":{
			                        			System.out.println("Pump Gallon");
			                        			gp1.PumpGallon();
			                        			break;
			                        }
					                        case "s":{
			                        			System.out.println("Stop pump");
			                        			gp1.StopPump();
			                        			break;
			                        }
					                        case "q":{
			                        			//System.out.println("");
			                        			break;
			                        }default: {
		                                System.out.println("Unknown operation: " + input + "");
		                                System.out.println("Please select a valid operation");
		                                break;
		                            }
			                        
			                        
					             }// end of switch case
					                        
						}// end of while loop
					               System.out.println("Ending GasPump...");
					               break;
						}// end of case 1
						case 2: {  
									Abstractgp2 af2 = new Abstractgp2();
									GasPump2 gp2 = new GasPump2(af2);
									System.out.println(
				                            "GasPump-2 " +
				                                    "\n***********************" +
				                                    "\n Operations: " +
				                                    "\n(0) Activate (int a, int b, int c)" +
				                                    "\n(1) Start" +
				                                    "\n(2) PayCash" +
				                                    "\n(3) Regular " +
				                                    "\n(4) Super " +
				                                    "\n(5) Premium " +
				                                    "\n(6) Cancel" +
				                                    "\n(7) StartPump" +
				                                    "\n(8) PumpLiter" +
				                                    "\n(9) Stop " +
				                                    "\n(p) PrintReceipt" +
				                                    "\n(n) NoReceipt" +
				                                    "\n(q) Quit the program" +
				                                    "\n**************************"
				                    );
									
									while (!input.equals("q")) {
										gp2.DisplayOps();
										input = br.readLine();
										
										 switch (input) {
				                            case "0": {
				                            	System.out.println("Activate");
				                                int a, b, c;
				                                System.out.println("Enter the price parameter a: ");
				                                try {
				                                    a = Integer.parseInt(br.readLine());
				                                    System.out.println("Enter the price parameter b: ");
				                                    b = Integer.parseInt(br.readLine());
				                                    System.out.println("Enter the price parameter c: ");
				                                    c = Integer.parseInt(br.readLine());
				                                    gp2.Activate(a, b, c);
				                                }catch(Exception e)
				                                {
				                                	System.out.println(e.getMessage());
				                                }
				                                break;
				                            }
				                            case "1": {
				                            	System.out.println("Start");
				                            	gp2.start();
				                            	break;
				                            }
				                            
				                            case "2": {
				                            	System.out.println("PayCash");
				                            	System.out.println("Enter Cash Amount: $");
				                            	try{
				                            		float cash = Float.parseFloat(br.readLine());
				                            		gp2.PayCash(cash);
				                            	}catch(Exception e)
				                            	{
				                            		System.out.println(e.getMessage());
				                            	}
				                            	break;
				                            }
				                            

				                            case "3": {
				                            	System.out.println("Regular");
				                            	gp2.regular();
				                            	break;
				                            }
				                            

				                            case "4": {
				                            	System.out.println("Super");
				                            	gp2.Super();
				                            	break;
				                            }
				                            

				                            case "5": {
				                            	System.out.println("premium");
				                            	gp2.Premium();
				                            	break;
				                            }
				                            

				                            case "6": {
				                            	System.out.println("cancel");
				                            	gp2.Cancel();
				                            	break;
				                            }
				                            

				                            case "7": {
				                            	System.out.println("Start");
				                            	gp2.StartPump();
				                            	break;
				                            }
				                            

				                            case "8": {
				                            	System.out.println("PumpLiter");
				                            	gp2.PumpLiter();
				                            	break;
				                            }
				                            

				                            case "9": {
				                            	System.out.println("Stop pump");
				                            	gp2.StopPump();
				                            	break;
				                            }
				                            
				                            case "p": {
				                            	System.out.println("print receipt");
				                            	gp2.Receipt();
				                            	break;
				                            }
				                            

				                            case "n": {
				                            	System.out.println("No receipt");
				                            	gp2.NoReceipt();
				                            	break;
				                            }
				                            

				                            case "q": {
				                            //	System.out.println("");
				                            
				                            	break;
				                            }default: { // Anything else: unknown / unsupported operation
				                                System.out.println("Unknown operation: '" + input + "'");
				                                System.out.println("Please enter a valid operation");
				                                break;
				                            }
										 }
									}// end of while loop
									 System.out.println("Ending GasPump...");
						               break;
						}default: {
							System.out.println("Unknown selection...");
							System.exit(1);
						}
					}
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
}
						
				                            
				                            

				                           