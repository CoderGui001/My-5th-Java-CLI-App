import java.util.*;
import java.text.DecimalFormat;

class Details{
	
	private String OrderId;
	private String PhoneNumber;
	private String SizeArr;
	private int QTYarr;
	private int status;
	private String Amount;
	
	
	public void setOrderId(String OrderId){
		this.OrderId=OrderId;
		
	}
	
	public String getOrderId(){
		return OrderId;
		
	}
	public void setPhoneNumber(String Number){
		this.PhoneNumber=Number;
		
	}
	
	public String getPhoneNumber(){
		return PhoneNumber;
		
	}
	public void setSizeArr(String Size){
		this.SizeArr=Size;
		
	}
	
	public String getSizeArr(){
		return SizeArr;
		
	}
	public void setQTYarr(int Q){
		this.QTYarr=Q;
		
	}
	
	public int getQTYarr(){
		return QTYarr;
		
	}
	
	public void setAmount(String A){
		this.Amount=A;
		
	}
	
	public String getAmount(){
		return Amount;
		
	}
	
	public void setstatus(int status){
		this.status=status;
		
	}


	public int getstatus(){
		
		return status;
		
	}
	
	
	
	
	
	
}

class OOP_Coursework_1A{
	
	private static DecimalFormat df = new DecimalFormat("0.00");
	private static Scanner input=new Scanner(System.in);
	
	public static final String[] Sizz={"XS","S","M","L","XL","XXL"};
	
		
		
	private static final int PROCESSING = 0;
	private static final int DELIVERING = 1;
	private static final int DELIVERED = 2;
	
	
	
	public static final double XS = 600.00;
	public static final double S = 800.00;
	public static final double M = 900.00;
	public static final double L = 1000.00;
	public static final double XL = 1100.00;
	public static final double XXL = 1200.00;
	
	public static Details[] d = new Details[0]; 
	
	public final static void clearConsole() {
		try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		  }
		} catch (final Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
	
	
	public static void ChangeOrderStatus(){
		OrderStatus();
			
		
	}
	
	

	public static void OrderStatus(){
			
		System.out.println("\r\n\t   ____          _              _____ _        _             \r\n\t  / __ \\        | |            / ____| |      | |            \r\n\t | |  | |_ __ __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___ \r\n\t | |  | | \'__/ _` |/ _ \\ \'__|  \\___ \\| __/ _` | __| | | / __|\r\n\t | |__| | | | (_| |  __/ |     ____) | || (_| | |_| |_| \\__ \\\r\n\t  \\____/|_|  \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/");
		System.out.println(" \t\b\b____________________________________________________________________");
		System.out.println();
		
		System.out.print("\tEnter Order ID : ");
		String ID=input.next();
		System.out.println();
		
		
			for(int i=0;i<d.length;i++){
				
				if(ID.equals(d[i].getOrderId())){
					
							System.out.println("\tPhone Number : "+d[i].getPhoneNumber());
							System.out.println("\tSize         : "+d[i].getSizeArr());	
							System.out.println("\tQTY          : "+d[i].getQTYarr());	
							System.out.println("\tAmount       : "+d[i].getAmount());
							System.out.println("\tStatus       : "+(d[i].getstatus()==0?"Processing":d[i].getstatus()==1?"Delivering":d[i].getstatus()==2?"Deliverded":""));
							
							
								
							
								
									if((d[i].getstatus())==0){
													
													System.out.print("\n\tDo you want to Change this order Status? (y/n):");
													String Ans3=input.next().toLowerCase();
										
													
													if(Ans3.equals("y")){
										
														System.out.printf("\t\t\t\b%-23s","[1] Order Delivering");
														System.out.println();
														System.out.printf("\t\t\t\b%-23s","[2] Order Delivered");
														System.out.println();	
										
														System.out.print("\tEnter option :");
														int option=input.nextInt();
														//clearConsole();	
														switch(option){
															
																case 1:	System.out.println("\n\t\tStatus Updated..!"); 
															
																		d[i].setstatus(1);
														
																		System.out.print("\tDo you want to Change another order Status? (y/n):");
																		String Ans6=input.next().toLowerCase();
																		clearConsole();
																							
																		if(Ans6.equals("y")){
																			OrderStatus();
																		}
																		
																		else if(Ans6.equals("n")){
																			MainMenu();
																		}
																		
																		;break;
																		
																case 2:	System.out.println("\n\t\tStatus Updated..!"); 
															
																		d[i].setstatus(2);
														
																		System.out.print("\tDo you want to Change another order Status? (y/n):");
																		String Ans7=input.next().toLowerCase();
																		clearConsole();
																							
																		if(Ans7.equals("y")){
																			OrderStatus();
																		}
																		
																		else if(Ans7.equals("n")){
																			MainMenu();
																		}
																		
																		;break;	
																		
																	
														}			
												  	
														 
													}		
															
															
									}						
															
												    
										if(d[i].getstatus()==1){	
														
														System.out.print("\tDo you want to Change this order Status? (y/n):");
														String Ans5=input.next().toLowerCase();
															
															if(Ans5.equals("y")){
																
																System.out.printf("\t\t\t\b%-23s","[1] Order Delivered");
																System.out.println();
																
																										
																	
																System.out.print("\tEnter option :");
																int option2=input.nextInt();
																	
																	if(option2==1){
																		
																		System.out.println("\n\t\tStatus Updated..!"); 
																		
																		d[i].setstatus(2);
																		
																		System.out.print("\tDo you want to Change another order Status? (y/n):");
																		String Ans3=input.next().toLowerCase();
																		clearConsole();
																							
																				if(Ans3.equals("y")){
																					OrderStatus();
																				}
																				
																				else if(Ans3.equals("n")){    
																					MainMenu();
																				}
																			
																	}
																		
																	if(option2!=1){
																			
																		System.out.println("Invalid Input..!");	
																			
																			
																	}	
																			
																			
															}
															
																			
															else if(Ans5.equals("n")){
										
																System.out.print("\tDo you want to Change this order Status? (y/n):");
																String Ans4=input.next().toLowerCase();
																clearConsole();
																
																	if(Ans4.equals("y")){
																		
																		ChangeOrderStatus();
																	}
																	
																	else if(Ans4.equals("n")){
																		 
																		MainMenu();
																	}
										
										
											
																			
																			
																			
																			
																	
															}
															
										}
															
										if(d[i].getstatus()==2){	
															
									    	System.out.println("\n\t\tCan't Change, Already Deliverded!");	
									    	
									    	System.out.print("\n\tDo you want to Change another order Status? (y/n):");
														String Ans7=input.next().toLowerCase();
														clearConsole();
																					
															if(Ans7.equals("y")){
																OrderStatus();
															}
																
															else if(Ans7.equals("n")){
																MainMenu();
															}	
									    	
									    	
									    	
									    	
										}			
												
								}			
										
										
									
									
								
					
					  			
							
					
				}
				
			for(int i=0;i<d.length;i++){
								
				if(!((d[i].getOrderId()).equals(ID))){
							
					System.out.println();			
					System.out.println("\t\tINnvalid ID..\n");	
					System.out.print("\tDo you want to Change another order Status? (y/n):");
					String Ans3=input.next().toLowerCase();
					clearConsole();
															
							if(Ans3.equals("y")){
									OrderStatus();
							}
										
							else if(Ans3.equals("n")){    
								MainMenu();
							}
								
				}
									
					

			}   
				
					
	}	
		
				
	
	

	
	public static Details[] DelelteArrayElement(Details[] br,String IDs){
		
		Details[] temp=new Details[br.length-1];
		
		int  newindex=0;
		
		for(int i=0;i<br.length;i++){
			
			if(!(IDs.equals(br[i].getOrderId()))){
			
				temp[newindex]=br[i];
				newindex++;
			}
			
		}
		
		return temp;
	} 
	public static void DeleteOrder(){
		System.out.println("\r\n\t  _____       _      _          ____          _           \r\n\t |  __ \\     | |    | |        / __ \\        | |          \r\n\t | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ \r\n\t | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | \'__/ _` |/ _ \\ \'__|\r\n\t | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   \r\n\t |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|");
		System.out.println(" \t\b\b____________________________________________________________________");
		System.out.println();	
		
		System.out.print("\tEnter Order ID : ");
		String ID=input.next();
		
		
		
			for(int i=0;i<d.length;i++){
				
				if(ID.equals(d[i].getOrderId())){
					
							System.out.println("\tPhone Number : "+d[i].getPhoneNumber());
							System.out.println("\tSize         : "+d[i].getSizeArr());	
							System.out.println("\tQTY          : "+d[i].getQTYarr());	
							System.out.println("\tAmount       : "+d[i].getAmount());
							System.out.println("\tStatus       : "+d[i].getstatus());
							
								
							System.out.print("\tDo you want to delete this order? (y/n):");
							String Ans3=input.next().toLowerCase();
							//clearConsole();
										
							if(Ans3.equals("y")){
										
								d=DelelteArrayElement(d,ID);
										
								System.out.println("\n\t\tOrder Deleted..!");
								
								
										
								System.out.print("\n\tDo you want to delete another order? (y/n):");
								String Ans4=input.next().toLowerCase();
								clearConsole();
										
											if(Ans4.equals("y")){
												
												DeleteOrder();
											}
											
											else if(Ans4.equals("n")){
												
												MainMenu();
												
											}
										
									}
					
								
							
					
				}	
			}	
	
	
	}
	
	
	public static void AllCustomerReport(){
		System.out.println("\r\n\t           _ _    _____          _                              _____                       _       \r\n\t     /\\   | | |  / ____|        | |                            |  __ \\                     | |      \r\n\t    /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ \r\n\t   / /\\ \\ | | | | |   | | | / __| __/ _ \\| \'_ ` _ \\ / _ \\ \'__| |  _  // _ \\ \'_ \\ / _ \\| \'__| __/ __|\r\n\t  / ____ \\| | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\r\n\t /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\r\n\t                                                                          | |                       \r\n\t                                                                          |_|");
		System.out.println(" \t\b\b_________________________________________________________________________________________________________");
		System.out.println();
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		System.out.printf("\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%-15s|%n"," Phone Number","  XS","   S","   M","   L","  XL","  XXL"," Total Amount");
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		
		String[] PNnew= new String[0];
		
		if (d.length>0){
			L1:for (int i = 0; i < d.length; i++){
				
				for (int j = 0; j < PNnew.length; j++){
					if ((d[i].getPhoneNumber()).equals(PNnew[j])){
					
						continue L1;
					}
				}
				
				
				PNnew = extendArray(PNnew); 
				PNnew[PNnew.length-1] = d[i].getPhoneNumber();
			}
			
		}
	
		for (int i = 0; i < PNnew.length; i++){
				int[] tempQTY = new int[6];
				
				for (int j = 0; j < d.length; j++){
					if (PNnew[i].equals(d[j].getPhoneNumber())){
							switch (d[j].getSizeArr()){
								
								 case "XS": tempQTY[0] += d[j].getQTYarr();break; 
								 case "S": tempQTY[1] +=d[j].getQTYarr();break;
								 case "M": tempQTY[2] +=d[j].getQTYarr();break;
								 case "L": tempQTY[3] +=d[j].getQTYarr();break;
								 case "XL": tempQTY[4] += d[j].getQTYarr();break;
								 case "XXL": tempQTY[5] += d[j].getQTYarr();break; 
							}
						 
					}
				}
				
			//System.out.println(Arrays.toString(tempQTY));	
			 
			 double total = 0;
			 
			 total += tempQTY[0] * XS;
			 total += tempQTY[1] * S;
			 total += tempQTY[2] * M;
			 total += tempQTY[3] * L;
			 total += tempQTY[4] * XL;
			 total += tempQTY[5] * XXL;
			 
			 
			 System.out.printf("\t\t|%15s|%7s|%7s|%7s|%7s|%7s|%7s|%15s|%n","","","","","","","","");
			 System.out.printf("\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%13s  |%n"," "+PNnew[i]+"    ","  "+tempQTY[0],"  "+tempQTY[1],"  "+tempQTY[2],"  "+tempQTY[3],"  "+tempQTY[4],"  "+tempQTY[5],df.format(total));
			 
		}
		
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		
		
		
		System.out.print("\n\tTo access the Main Menu, please enter 0: ");
		int enterZero=input.nextInt();
		clearConsole();
		
		if(enterZero==0){
			MainMenu();	
		}
	
	}
	public static void ViewCustomers(){
		System.out.println("\r\n\t __      ___                  _____          _                                \r\n\t \\ \\    / (_)                / ____|        | |                               \r\n\t  \\ \\  / / _  _____      __ | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ \r\n\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |   | | | / __| __/ _ \\| \'_ ` _ \\ / _ \\ \'__/ __|\r\n\t    \\  /  | |  __/\\ V  V /  | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\\r\n\t     \\/   |_|\\___| \\_/\\_/    \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/");
		System.out.println(" \t\b\b_______________________________________________________________________________________");
		System.out.println("\n");	
		System.out.println("\t\t+-----------------+---------+-----------------+");
		System.out.printf("\t\t|%17s|%9s|%17s|%n","   Customer ID   "," All QTY ","   Total Amount  ");
		System.out.println("\t\t+-----------------+---------+-----------------+");	
		
		String[] CustomerID = new String[0];
		
		if (d.length>0){
			L1:for (int i = 0; i < d.length; i++){
				
				for (int j = 0; j < CustomerID.length; j++){
					if ((d[i].getPhoneNumber()).equals(CustomerID[j])){
						
						continue L1;
					}
				}
				
				CustomerID=extendArray(CustomerID);
				CustomerID[CustomerID.length-1]=d[i].getPhoneNumber();
			}	
		}		

		for(int i=0;i<CustomerID.length;i++){
			int[] QTYtemp=new int[6];
			int Sum=0;
			for(int j=0;j<d.length;j++){
				
				if(CustomerID[i].equals(d[j].getPhoneNumber())){
					
					switch(d[j].getSizeArr()){
						case "XS":QTYtemp[0]+=d[j].getQTYarr();
									if(QTYtemp[0]>0){
										Sum+=QTYtemp[0];
									}
							
								  break;
						case "S":QTYtemp[1]+=d[j].getQTYarr();
									if(QTYtemp[1]>0){
										Sum+=QTYtemp[1];
									}
							
								  break;
						case "M":QTYtemp[2]+=d[j].getQTYarr();
									if(QTYtemp[2]>0){
										Sum+=QTYtemp[2];
									}
							
								  break;
						case "L":QTYtemp[3]+=d[j].getQTYarr();
									if(QTYtemp[3]>0){
										Sum+=QTYtemp[3];
									}
								 
								  break;
						case "XL":QTYtemp[4]+=d[j].getQTYarr();
									if(QTYtemp[4]>0){
										Sum+=QTYtemp[4];
									}
								
								  break;
						case "XXL":QTYtemp[5]+=d[j].getQTYarr();
									if(QTYtemp[5]>0){
										Sum+=QTYtemp[5];
									}
								 
								  break;
		
					}	
					

					
					
				
				}	
				
				
			
			}	
			
			
			
			
				double total=0;
				total+=QTYtemp[0]*XS;
				total+=QTYtemp[1]*S;
				total+=QTYtemp[2]*M;
				total+=QTYtemp[3]*L;
				total+=QTYtemp[4]*XL;
				total+=QTYtemp[5]*XXL;
				
				
				
			
				
				
				
				System.out.printf("\t\t|%17s|%9s|%17s|%n","   "+CustomerID[i]+"   ","    "+Sum+"   ","   "+df.format(total)+"  ");
				System.out.printf("\t\t|%17s|%9s|%17s|%n","","","");
		}
		
		
		System.out.println("\t\t+-----------------+---------+-----------------+");	
		
		System.out.println();
		System.out.print("\tTo access the Main Menu, please enter 0: ");
		int enterZero=input.nextInt();
		clearConsole();
		
			if(enterZero==0){
				MainMenu();	
			}
	
	}
	public static double[] extendArrayDouble(double[] br){
	
		double[] temp=new double[br.length+1];
		
		for(int i=0;i<br.length;i++){
			
			temp[i]=br[i];
			
		}
		
		return temp;
		
	}
	public static String[] extendArray(String[] br){
	
		String[] temp=new String[br.length+1];
		
		for(int i=0;i<br.length;i++){
			
			temp[i]=br[i];
			
		}
		
		return temp;
		
	}
	public static void BestInCustomers(){
		System.out.println("\r\n\t  ____            _     _____          _____          _                                \r\n\t |  _ \\          | |   |_   _|        / ____|        | |                               \r\n\t | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ \r\n\t |  _ < / _ \\/ __| __|   | | | \'_ \\  | |   | | | / __| __/ _ \\| \'_ ` _ \\ / _ \\ \'__/ __|\r\n\t | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\\r\n\t |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/");
		System.out.println(" \t\b\b___________________________________________________________________________________________");
		System.out.println();
		
		System.out.println("\t\t+-----------------+---------+-----------------+");
		System.out.printf("\t\t|%17s|%9s|%17s|%n","   Customer ID   "," All QTY ","   Total Amount  ");
		System.out.println("\t\t+-----------------+---------+-----------------+");
		
		String[] CustomerID = new String[0];
		double[] totalA=new double[0];
		int[] Sum1=new int[0];
		
		if (d.length>0){
			
			L1:for (int i = 0; i < d.length; i++){
				
				for (int j = 0; j < CustomerID.length; j++){
					if ((d[i].getPhoneNumber()).equals(CustomerID[j])){
						
						continue L1;
					}
				}
				
				CustomerID=extendArray(CustomerID);
				CustomerID[CustomerID.length-1]=d[i].getPhoneNumber();
			}	
		}		
		
		
		for(int i=0;i<CustomerID.length;i++){
				int[] QTYtemp=new int[6];
				int Sum=0;
				
				for(int j=0;j<d.length;j++){
					if(CustomerID[i].equals(d[j].getPhoneNumber())){
							
							switch(d[j].getSizeArr()){
								case "XS":QTYtemp[0]+=d[j].getQTYarr();
											if(QTYtemp[0]>0){
												Sum+=QTYtemp[0];
											}
										
										  break;
								case "S":QTYtemp[1]+=d[j].getQTYarr();
											if(QTYtemp[1]>0){
												Sum+=QTYtemp[1];
											}
										
										  break;
								case "M":QTYtemp[2]+=d[j].getQTYarr();
											if(QTYtemp[2]>0){
												Sum+=QTYtemp[2];
											}
										
										  break;
								case "L":QTYtemp[3]+=d[j].getQTYarr();
											if(QTYtemp[3]>0){
												Sum+=QTYtemp[3];
											}
										  
										  break;
								case "XL":QTYtemp[4]+=d[j].getQTYarr();
											if(QTYtemp[4]>0){
												Sum+=QTYtemp[4];
											}
										
										  break;
								case "XXL":QTYtemp[5]+=d[j].getQTYarr();
											if(QTYtemp[5]>0){
												Sum+=QTYtemp[5];
											}
										  break;
				
							}	
							

							
							
					
					
					}	
					
				}
				
				
				double total=0;
				total+=QTYtemp[0]*XS;
				total+=QTYtemp[1]*S;
				total+=QTYtemp[2]*M;
				total+=QTYtemp[3]*L;
				total+=QTYtemp[4]*XL;
				total+=QTYtemp[5]*XXL;
				
				totalA=extendArrayDouble(totalA);
				totalA[totalA.length-1]=total;
				
				Sum1=extendArrayInteger(Sum1);
				Sum1[Sum1.length-1]=Sum;
				
		
		
		}
		
			//	System.out.println(Arrays.toString(Sum1));
			//	System.out.println(Arrays.toString(totalA));
			//	System.out.println(Arrays.toString(CustomerID));
				
		
		
		for(int k=0;k<CustomerID.length;k++){
					
					for(int l=0;l<k;l++){
						if(totalA[k]>totalA[l]){
							
							double t=totalA[k];
							totalA[k]=totalA[l];
							totalA[l]=t;
							
							int t1=Sum1[k];
							Sum1[k]=Sum1[l];
							Sum1[l]=t1;
							
							String t2=CustomerID[k];
							CustomerID[k]=CustomerID[l];
							CustomerID[l]=t2;
							
						}
						
						
					}	
					
					
				}
				
				//System.out.println(Arrays.toString(Sum1));
				//System.out.println(Arrays.toString(totalA));
				//System.out.println(Arrays.toString(CustomerID));
				
		for(int i=0;i<CustomerID.length;i++){
			
			System.out.printf("\t\t|%17s|%9s|%17s|%n","   "+CustomerID[i]+"   ","    "+Sum1[i]+"   ","   "+df.format(totalA[i])+"  ");
			System.out.printf("\t\t|%17s|%9s|%17s|%n","","","");
			
		}		
				
		
		System.out.println("\t\t+-----------------+---------+-----------------+");
		System.out.println();
		System.out.print("\tTo access the Main Menu, please enter 0: ");
		int enterZero=input.nextInt();
		clearConsole();
		
		if(enterZero==0){
			MainMenu();	
		}
		
	
	}
	public static void CustomerReports(){
		System.out.println("\r\n\t   _____          _                              _____                       _       \r\n\t  / ____|        | |                            |  __ \\                     | |      \r\n\t | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ \r\n\t | |   | | | / __| __/ _ \\| \'_ ` _ \\ / _ \\ \'__| |  _  // _ \\ \'_ \\ / _ \\| \'__| __/ __|\r\n\t | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\r\n\t  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\r\n\t                                                           | |                       \r\n\t                                                           |_|");
		System.out.println(" \t\b\b___________________________________________________________________________________________");
		System.out.println();
		
		System.out.printf("\t\t\t\b%-23s","[1] Best in Customers");
		System.out.println();
		System.out.printf("\t\t\t\b%-23s","[2] View Customers");
		System.out.println();
		System.out.printf("\t\t\t\b%-23s","[3] All Customer Report");
		System.out.println();
		
		System.out.print("\tEnter option :");
		int option=input.nextInt();
		clearConsole();
		
				switch(option){
					
					case 1:BestInCustomers();break;
					case 2:ViewCustomers();break;
					case 3:AllCustomerReport();break;
					default:
				}
		
		
		
	}
	
	
	public static void SortedByAmount(){
		System.out.println("\r\n\t   _____            _           _   ____                                               _   \r\n\t  / ____|          | |         | | |  _ \\            /\\                               | |  \r\n\t | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ \r\n\t  \\___ \\ / _ \\| \'__| __/ _ \\/ _` | |  _ <| | | |   / /\\ \\ | \'_ ` _ \\ / _ \\| | | | \'_ \\| __|\r\n\t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ \r\n\t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|\r\n\t                                           __/ |                                           \r\n\t                                          |___/");
		System.out.println(" \t\b\b___________________________________________________________________________________________");
		System.out.println();
		
			int[] QTYtemp=new int[6];
			double TOT[]=new double[6];
			String Sz[]=new String[6];
			
			for(int i=0;i<d.length;i++){
					
				int tot1=0;
				switch(d[i].getSizeArr()){
					
					case "XS":QTYtemp[0]+=d[i].getQTYarr();break; //3,0,0,0,0,0,0,0
					case "S": QTYtemp[1]+=d[i].getQTYarr();break; //0,0,0,0,0,2,0,0
					case "M": QTYtemp[2]+=d[i].getQTYarr();break; //0,0,0,3,6,0,0,3
					case "L": QTYtemp[3]+=d[i].getQTYarr();break; //0,0,0,0,0,0,0,0
					case "XL": QTYtemp[4]+=d[i].getQTYarr();break;//0,4,0,0,0,0,0,0
					case "XXL":QTYtemp[5]+=d[i].getQTYarr();break;//0,0,1,0,0,0,1,0
					
					
				}
	
		
			}
			
			for(int i=0;i<d.length;i++){
			
				switch(d[i].getSizeArr()){
						
						case "XS":Sz[0]="XS";break; 
						case "S":Sz[1]="S";break; 
						case "M":Sz[2]="M";break;
						case "L":Sz[3]="L";break; 
						case "XL":Sz[4]="XL";break;
						case "XXL":Sz[5]="XXL";break;
			
				}

			}
			
			
			if(Sz[0]==null){Sz[0]="XS";}
			if(Sz[1]==null){Sz[1]="S";}
			if(Sz[2]==null){Sz[2]="M";}
			if(Sz[3]==null){Sz[3]="L";}
			if(Sz[4]==null){Sz[4]="XL";}
			if(Sz[5]==null){Sz[5]="XXL";}
			
			
			
			
				
			
			for(int i=0;i<d.length;i++){
			
				switch(d[i].getSizeArr()){
						
						case "XS":TOT[0]=(QTYtemp[0]*XS);break; 
						case "S":TOT[1]=(QTYtemp[1]*S);break; 
						case "M":TOT[2]=(QTYtemp[2]*M);break;
						case "L":TOT[3]=(QTYtemp[3]*L);break; 
						case "XL":TOT[4]=(QTYtemp[4]*XL);break;
						case "XXL":TOT[5]=(QTYtemp[5]*XXL);break;
			
				}
			
			}
			
			
			
			
			for(int i=1;i<QTYtemp.length;i++){
				for(int j=0;j<i;j++){
					if(TOT[i]>TOT[j]){
						
						double t2=	TOT[i];
						TOT[i]=TOT[j];
						TOT[j]=t2;
						
						int t1=	QTYtemp[i];
						QTYtemp[i]=QTYtemp[j];
						QTYtemp[j]=t1;
						
						
						
						String t3=	Sz[i];
						Sz[i]=Sz[j];
						Sz[j]=t3;
						
					}
					
					
				}	
				
				
				
			}
			
			
			
		System.out.println();				
		System.out.println("\t\t+----------+----------+---------------+");
		System.out.printf("\t\t|%-10s|%-10s|%-15s|%n","   Size","   QTY","     Amount ");
		System.out.println("\t\t+----------+----------+---------------+");
		
		
		for(int i=0;i<6;i++){
			
			System.out.printf("\t\t|%-10s|%-10s|%-15s|%n","   ","   ","      ");
			System.out.printf("\t\t|%-10s|%10s|%15s|%n","   "+Sz[i],"    "+QTYtemp[i]+"    ","    "+df.format(TOT[i])+"  ");
			
		}	
		
		System.out.println("\t\t+----------+----------+---------------+");	
		
		System.out.println();
		System.out.print("\n\tTo access the Main Menu, please enter 0: ");
		int enterZero=input.nextInt();
		clearConsole();
		
		if(enterZero==0){
			MainMenu();	
		}
		
		
	}
	public static void SortedByQTY(){
		System.out.println("\r\n\t   _____            _           _   ____           ____ _________     __\r\n\t  / ____|          | |         | | |  _ \\         / __ \\__   __\\ \\   / /\r\n\t | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ / \r\n\t  \\___ \\ / _ \\| \'__| __/ _ \\/ _` | |  _ <| | | | | |  | | | |    \\   /  \r\n\t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| | | |__| | | |     | |   \r\n\t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|   \r\n\t                                           __/ |                        \r\n\t                                          |___/");
		System.out.println(" \t\b\b______________________________________________________________________________");
		System.out.println();
		
			int[] QTYtemp=new int[6];
			double TOT[]=new double[6];
			String Sz[]=new String[6];
			
			for(int i=0;i<d.length;i++){
					
				int tot1=0;
				switch(d[i].getSizeArr()){
					
					case "XS":QTYtemp[0]+=d[i].getQTYarr();break; //3,0,0,0,0,0,0,0
					case "S": QTYtemp[1]+=d[i].getQTYarr();break; //0,0,0,0,0,2,0,0
					case "M": QTYtemp[2]+=d[i].getQTYarr();break; //0,0,0,3,6,0,0,3
					case "L": QTYtemp[3]+=d[i].getQTYarr();break; //0,0,0,0,0,0,0,0
					case "XL": QTYtemp[4]+=d[i].getQTYarr();break;//0,4,0,0,0,0,0,0
					case "XXL":QTYtemp[5]+=d[i].getQTYarr();break;//0,0,1,0,0,0,1,0
					
					
				}
	
		
			}
			
			for(int i=0;i<d.length;i++){
			
				switch(d[i].getSizeArr()){
						
						case "XS":Sz[0]="XS";break; 
						case "S":Sz[1]="S";break; 
						case "M":Sz[2]="M";break;
						case "L":Sz[3]="L";break; 
						case "XL":Sz[4]="XL";break;
						case "XXL":Sz[5]="XXL";break;
			
				}
				

			}
			
			
				if(Sz[0]==null){Sz[0]="XS";}
				if(Sz[1]==null){Sz[1]="S";}
				if(Sz[2]==null){Sz[2]="M";}
				if(Sz[3]==null){Sz[3]="L";}
				if(Sz[4]==null){Sz[4]="XL";}
				if(Sz[5]==null){Sz[5]="XXL";}
			
	
			
			for(int i=0;i<d.length;i++){
			
				switch(d[i].getSizeArr()){
						
						case "XS":TOT[0]=(QTYtemp[0]*XS);break; 
						case "S":TOT[1]=(QTYtemp[1]*S);break; 
						case "M":TOT[2]=(QTYtemp[2]*M);break;
						case "L":TOT[3]=(QTYtemp[3]*L);break; 
						case "XL":TOT[4]=(QTYtemp[4]*XL);break;
						case "XXL":TOT[5]=(QTYtemp[5]*XXL);break;
			
				}
			
			}
			
			
			
			
			for(int i=1;i<QTYtemp.length;i++){
				for(int j=0;j<i;j++){
					if(QTYtemp[i]>QTYtemp[j]){
						
						int t1=	QTYtemp[i];
						QTYtemp[i]=QTYtemp[j];
						QTYtemp[j]=t1;
						
						double t2=	TOT[i];
						TOT[i]=TOT[j];
						TOT[j]=t2;
						
						String t3=	Sz[i];
						Sz[i]=Sz[j];
						Sz[j]=t3;
						
					}
					
					
				}	
				
				
				
			}
			
	
			
		System.out.println();				
		System.out.println("\t\t+----------+----------+---------------+");
		System.out.printf("\t\t|%-10s|%-10s|%-15s|%n","   Size","   QTY","     Amount ");
		System.out.println("\t\t+----------+----------+---------------+");
		
		
		for(int i=0;i<6;i++){
			
			System.out.printf("\t\t|%-10s|%-10s|%-15s|%n","   ","   ","      ");
			System.out.printf("\t\t|%-10s|%10s|%15s|%n","   "+Sz[i],"    "+QTYtemp[i]+"    ","    "+df.format(TOT[i])+"  ");
			
		}	
		
		System.out.println("\t\t+----------+----------+---------------+");	
		
		System.out.println();
		System.out.print("\n\tTo access the Main Menu, please enter 0: ");
		int enterZero=input.nextInt();
		clearConsole();
		
		if(enterZero==0){
			MainMenu();	
		}
			
	}
	public static void ItemReports(){
		System.out.println("\r\n\t  _____ _                   _____                       _       \r\n\t |_   _| |                 |  __ \\                     | |      \r\n\t   | | | |_ ___ _ __ ___   | |__) |___ _ __   ___  _ __| |_ ___ \r\n\t   | | | __/ _ \\ \'_ ` _ \\  |  _  // _ \\ \'_ \\ / _ \\| \'__| __/ __|\r\n\t  _| |_| ||  __/ | | | | | | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\r\n\t |_____|\\__\\___|_| |_| |_| |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\r\n\t                                      | |                       \r\n\t                                      |_|");
		System.out.println(" \t\b\b__________________________________________________________________________");

		System.out.println();

		System.out.printf("\n\t\t\t\b%-23s","[1] Best Selling Categories Sorted by QTY");
		System.out.println();
		System.out.printf("\n\t\t\t\b%-23s","[2] Best Selling Categories Sorted by Amount");
		System.out.println("\n");

		System.out.print("\n\tEnter oprion :");
		int option=input.nextInt();
		clearConsole();
		
			switch(option){
				case 1: SortedByQTY();break;
				case 2: SortedByAmount();break;	
				default:
				
			}
		
	
	}
	
	
	
	
	
	public static void OrdersByAmount(){
		System.out.println("\r\n\t   ____          _                 ____                                               _   \r\n\t  / __ \\        | |               |  _ \\            /\\                               | |  \r\n\t | |  | |_ __ __| | ___ _ __ ___  | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ \r\n\t | |  | | \'__/ _` |/ _ \\ \'__/ __| |  _ <| | | |   / /\\ \\ | \'_ ` _ \\ / _ \\| | | | \'_ \\| __|\r\n\t | |__| | | | (_| |  __/ |  \\__ \\ | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ \r\n\t  \\____/|_|  \\__,_|\\___|_|  |___/ |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|\r\n\t                                          __/ |                                           \r\n\t                                         |___/");
		System.out.println(" \t\b\b____________________________________________________________________________________________");
		System.out.println();
		
		System.out.println("\t\t+----------+----------------+--------+----------+---------------+-----------------+");
		System.out.printf("\t\t|%-10s|%-16s|%-8s|%-10s|%-15s|%-17s|%n"," Order ID ","  Customer ID  ","  Size  ","   QTY    ","    Amount     ","     Status    ");
		System.out.println("\t\t+----------+----------------+--------+----------+---------------+-----------------+");
		
		
		double[] Amounttemp=new double[d.length];
		
		for(int i=0;i<d.length;i++){
			
			Amounttemp[i]=Double.parseDouble(d[i].getAmount());
			
		}
		
		
		    for(int i=0;i<d.length;i++){
				
			    for(int j=0;j<i;j++){
					
					if( Amounttemp[i]> Amounttemp[j]){
						
						double t1=Amounttemp[i];
						Amounttemp[i]=Amounttemp[j];
						Amounttemp[j]=t1;
							
						int t8=d[i].getQTYarr();
						d[i].setQTYarr(d[j].getQTYarr());
						d[j].setQTYarr(t8);
						
						String t3=d[i].getOrderId();
						d[i].setOrderId(d[j].getOrderId());
						d[j].setOrderId(t3);
						
						String t4=d[i].getPhoneNumber();
						d[i].setPhoneNumber(d[j].getPhoneNumber());
						d[j].setPhoneNumber(t4);
						
						String t5=d[i].getSizeArr();
						d[i].setSizeArr(d[j].getSizeArr());
						d[j].setSizeArr(t5);
						
						int t6=d[i].getstatus();
						d[i].setstatus(d[j].getstatus());
						d[j].setstatus(t6);
						
	
						
					}
					
					
					
				}
					
				
				
			}
	
		for(int i=0;i<d.length;i++){	
			
			System.out.printf("\t\t|%-10s|%-16s|%-8s|%-10s|%-15s|%-17s|%n"," "+d[i].getOrderId()+""," "+d[i].getPhoneNumber()+"   ","  "+d[i].getSizeArr()+"   ","    "+d[i].getQTYarr()+"    ","      "+df.format(Amounttemp[i])+"  ","  "+d[i].getstatus()+"    ");
		}
		
	
		System.out.println("\t\t+----------+----------------+--------+----------+---------------+-----------------+");
		
		
		System.out.print("\n\tTo access the Main Menu, please enter 0: ");
		int enterZero=input.nextInt();
		clearConsole();
		
		if(enterZero==0){
			MainMenu();	
		}
		
	}
	public static void AllOrders(){
		System.out.println("\r\n\t __      ___                  ____          _               \r\n\t \\ \\    / (_)                / __ \\        | |              \r\n\t  \\ \\  / / _  _____      __ | |  | |_ __ __| | ___ _ __ ___ \r\n\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |  | | \'__/ _` |/ _ \\ \'__/ __|\r\n\t    \\  /  | |  __/\\ V  V /  | |__| | | | (_| |  __/ |  \\__ \\\r\n\t     \\/   |_|\\___| \\_/\\_/    \\____/|_|  \\__,_|\\___|_|  |___/");
		System.out.println(" \t\b\b__________________________________________________________________________");
		System.out.println();
		
		System.out.println("\t+----------+----------------+--------+----------+---------------+-----------------+");
		System.out.printf("\t|%-10s|%-16s|%-8s|%-10s|%-15s|%-17s|%n"," Order ID ","  Customer ID  ","  Size  ","   QTY    ","    Amount     ","     Status    ");
		System.out.println("\t+----------+----------------+--------+----------+---------------+-----------------+");
		

		
			Details[] t1=new Details[d.length];
	
			
			for(int i=d.length-1;i>=0;i--){
				
				t1[d.length-1-i]=d[i];
				

			}
			
		for(int i=0;i<d.length;i++){	
			
			System.out.printf("\t|%-10s|%-16s|%-8s|%-10s|%-15s|%-17s|%n"," "+t1[i].getOrderId()+""," "+t1[i].getPhoneNumber()+"   ","  "+t1[i].getSizeArr()+"   ","    "+t1[i].getQTYarr()+"    ","      "+t1[i].getAmount()+"  ","  "+t1[i].getstatus() +"    ");
		}
		
		System.out.println("\t+----------+----------------+--------+----------+---------------+-----------------+");
		
		System.out.print("\n\tTo access the Main Menu, please enter 0: ");
		int enterZero=input.nextInt();
		clearConsole();
		
		if(enterZero==0){
			MainMenu();	
		}
	}
	public static void OrdersReports(){
		
		System.out.println("\r\n\t   ____          _             _____                       _       \r\n\t  / __ \\        | |           |  __ \\                     | |      \r\n\t | |  | |_ __ __| | ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ \r\n\t | |  | | \'__/ _` |/ _ \\ \'__| |  _  // _ \\ \'_ \\ / _ \\| \'__| __/ __|\r\n\t | |__| | | | (_| |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\r\n\t  \\____/|_|  \\__,_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\r\n\t                                         | |                       \r\n\t                                         |_|");
		System.out.println(" \t\b\b__________________________________________________________________________");
		
		System.out.println();
		System.out.printf("\t\t\t\b%-23s","[1] All orders");
		System.out.println("\n");
		System.out.printf("\t\t\t\b%-23s","[2] Orders By Amount");
		System.out.println();

		System.out.print("\tEnter oprion :");
		int option=input.nextInt();
		clearConsole();
		
			switch(option){
				case 1: AllOrders();break;
				case 2: OrdersByAmount();break;	
				default:
				
			}
		
	}
	
	
	
	
	
	public static void ViewReports(){
		System.out.println("\r\n\t  _____                       _       \r\n\t |  __ \\                     | |      \r\n\t | |__) |___ _ __   ___  _ __| |_ ___ \r\n\t |  _  // _ \\ \'_ \\ / _ \\| \'__| __/ __|\r\n\t | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\r\n\t |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\r\n\t            | |                       \r\n\t            |_|");
		System.out.println(" \t\b\b_________________________________________");
		System.out.println();
		
		System.out.printf("\t\t\b%-23s","[1] Customer Reports");
		System.out.println();
		System.out.printf("\t\t\b%-23s","[2] Item Reports");
		System.out.println();
		System.out.printf("\t\t\b%-23s","[3] Orders Reports");
		System.out.println();
		
		System.out.print("\n\tEnter option :");
		int option=input.nextInt();
		clearConsole();
		
				switch(option){
					
					case 1:CustomerReports();break;
					case 2:ItemReports();break;
					case 3:OrdersReports();break;
					default:
				}
		
		
	}
	public static void SearchOrder(){
			
		System.out.println("\r\n\t   _____                     _        ____          _           \r\n\t  / ____|                   | |      / __ \\        | |          \r\n\t | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __ \r\n\t  \\___ \\ / _ \\/ _` | \'__/ __| \'_ \\  | |  | | \'__/ _` |/ _ \\ \'__|\r\n\t  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |   \r\n\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_| ");
		System.out.println(" \t\b\b____________________________________________________________________");
		System.out.println();
		
		System.out.print("\tEnter Order ID : ");
		String ID=input.next();
		
		
		
		for(int i=0;i<d.length;i++){
				
		
			
				if(ID.equals(d[i].getOrderId())){
					
							System.out.println("\tPhone Number : "+d[i].getPhoneNumber());
							System.out.println("\tSize         : "+d[i].getSizeArr());	
							System.out.println("\tQTY          : "+d[i].getQTYarr());	
							System.out.println("\tAmount       : "+d[i].getAmount());
							System.out.println("\tStatus       : "+(d[i].getstatus()==0?"Processing":d[i].getstatus()==1?"Delivering":d[i].getstatus()==2?"Deliverded":""));

							
							
					
								
							System.out.print("\n\tDo you want to Search another order? (y/n):");
							String Ans3=input.next().toLowerCase();
							clearConsole();
											
										if(Ans3.equals("y")){
											SearchOrder();
										}
						
										else if(Ans3.equals("n")){
											MainMenu();
										}
										
				}
		
		}	
		
		for(int i=0;i<d.length;i++){
					
				if(!((d[i].getOrderId()).equals(ID))){
					
							System.out.println("\n\t\tINnvalid ID..\n");	
							System.out.print("\tDo you want to Search another order? (y/n):");
							String Ans3=input.next().toLowerCase();
							clearConsole();
												
							if(Ans3.equals("y")){
								SearchOrder();
							}
							
							else if(Ans3.equals("n")){
								MainMenu();
							}
					
				}
			
		    }	
		
		
		
				
	}	
	
	
	
	
	public static boolean PhoneNumberSearch(String a){
		
			
		for(int i=0;i<d.length;i++){
			
				
			if(a.equals(d[i].getPhoneNumber())){
			
				return true;	
			}
		}
		return false;
	}
	public static void SearchCustomer(){
		
		
	
			String str = "\r\n\t" +
				   "   _____            " +
				   "         _        __" +
				   "___          _      " +
				   "                    " +
				   "  \r\n\t" +
				   "  / ____|           " +
				   "        | |      / _" +
				   "___|        | |     " +
				   "                    " +
				   "  \r\n\t" +
				   " | (___   ___  __ _ " +
				   "_ __ ___| |__   | | " +
				   "   _   _ ___| |_ ___" +
				   "  _ __ ___   ___ _ _" +
				   "_ \r\n\t" +
				   "  \\___ \\ / _ \\/ _" +
				   "` | \'__/ __| \'_ \\" +
				   "  | |   | | | / __| " +
				   "__/ _ \\| \'_ ` _ \\" +
				   " / _ \\ \'__|\r\n\t" +
				   "  ____) |  __/ (_| |" +
				   " | | (__| | | | | |_" +
				   "__| |_| \\__ \\ || (" +
				   "_) | | | | | |  __/ " +
				   "|   \r\n\t" +
				   " |_____/ \\___|\\__," +
				   "_|_|  \\___|_| |_|  " +
				   "\\_____\\__,_|___/\\" +
				   "__\\___/|_| |_| |_|" +
				   "\\___|_|   \r" +
				   " ";
		System.out.println(str);
		System.out.println(" \t______________________________________________________________________________");
		System.out.println();
		
		
		
			
	 L1:do{			
			System.out.print("\n\tEnter Customer Phone Number : ");
			String PN=input.next();
			
			
					if(isValid4nNumber(PN)==true&&PhoneNumberSearch(PN)==true){
								
							double[] doubleAmount=new double[6];
							int [] QTY=new int[6];
							int tot3=0;
							
							for(int i =0;i<d.length;i++){
									
								if(PN.equals(d[i].getPhoneNumber())){	
									
									switch(d[i].getSizeArr()){
										
										case "XS":doubleAmount[0]=d[i].getQTYarr()*XS;
												  tot3+=doubleAmount[0];
												  QTY[0]+=d[i].getQTYarr();
												  break;
												  
										case "S":doubleAmount[1]=d[i].getQTYarr()*S;
											     tot3+=doubleAmount[1];
											     QTY[1]+=d[i].getQTYarr();
												 break;
												
										case "M":doubleAmount[2]=d[i].getQTYarr()*M;
												 tot3+=doubleAmount[2];
												 QTY[2]+=d[i].getQTYarr();
												 break;
												 
										case "L":doubleAmount[3]=d[i].getQTYarr()*L;
												 tot3+=doubleAmount[3];
												 QTY[3]+=d[i].getQTYarr();
												 break;
										
										case "XL":doubleAmount[4]=d[i].getQTYarr()*XL;
												  tot3+=doubleAmount[4];
												  QTY[4]+=d[i].getQTYarr();
												  break;
										case "XXL":doubleAmount[5]=d[i].getQTYarr()*XXL;
												   tot3+=doubleAmount[5];
												   QTY[5]+=d[i].getQTYarr();
												   break;
										
										
									}
								}
								
								
						}
							
					
							System.out.println();				
							System.out.println("\t\t+----------+----------+---------------+");
							System.out.printf("\t\t|%-10s|%-10s|%-15s|%n","   Size","   QTY","     Amount ");
							System.out.println("\t\t+----------+----------+---------------+");
						
							
							for(int i=1;i<doubleAmount.length;i++){
								
								for(int j=0;j<i;j++){
									
									
										if(doubleAmount[i]>doubleAmount[j]){
											
											double temp=doubleAmount[i];
											doubleAmount[i]=doubleAmount[j];
											doubleAmount[j]=temp;
											
											int tem=QTY[i];
											QTY[i]=QTY[j];
											QTY[j]=tem;
											
											String t=Sizz[i];
											Sizz[i]=Sizz[j];
											Sizz[j]=t;
											
										}
										
								}	
								
							}	
							
				
							
							for(int i=0;i<doubleAmount.length;i++){
								
								System.out.printf("\t\t|%-10s|%-10s|%15s|%n","  "+Sizz[i],"      "+QTY[i],"   "+df.format(doubleAmount[i])+"  ");				
									
							}			
							
							
							
							
								
							System.out.println("\t\t+----------+----------+---------------+");
							System.out.printf("\t\t|%-21s|%15s|%n","  Total Amount","     "+df.format(tot3)+"  ");
							System.out.println("\t\t+---------------------+---------------+");
							
						
							
							System.out.print("\n\tDo you want to Search another customer report? (y/n):");
							String Ans1=input.next().toLowerCase();
							clearConsole();
							
							
							
							
								if(Ans1.equals("y")){
									
									SearchCustomer();
								}
								else if(Ans1.equals("n")){
									
									MainMenu();
								}
						
					}   
				
					
					
					
					
					
					else{
						
						System.out.println("\n\t\t Invalid Input...!");
						
						System.out.print("\n\tDo you want to Search another customer report? (y/n):");
						String Ans1=input.next().toLowerCase();
						clearConsole();
						
						
							if(Ans1.equals("y")){
								
								SearchCustomer();
							}
							else if(Ans1.equals("n")){
								clearConsole();
								MainMenu();
							}
						
					}                
					
		}while(true);
		
		
	}
	
	
	public static void Answere(){
		
		System.out.print("\n\tDo you want to place another order? (y/n):");
		String Ans3=input.next().toLowerCase();
		clearConsole();
							
		if(Ans3.equals("y")){
			PlaceOrder();
		}
		
		else if(Ans3.equals("n")){
			MainMenu();
		}
		
		
		
	}
	public static String Qty(String s,int a){
		
		double[] price={600,800,900,1000,1100,1200};
		double Qty=0;
		
		if(s.equals("XS")){
			Qty=price[0]*a;
		}
		else if(s.equals("S")){
			Qty=price[1]*a;	
		}
		
		else if(s.equals("M")){
			Qty=price[2]*a;	
		}
		
		else if(s.equals("L")){
			Qty=price[3]*a;	
		}
		
		else if(s.equals("XL")){
			Qty=price[4]*a;	
		}
		
		else if(s.equals("XXL")){
			Qty=price[5]*a;	
		}
		
		else{
			System.out.println("\t\tEnter Valid Size...");
		}
		
		String Qty2=df.format(Qty);
		
		return Qty2;
		
	}
	public static boolean isValid4nNumber(String Number){
			
			if((Number.charAt(0)!='0')||(Number.length()!=10)){
					return false;
			}
				return true;
		
	}
	public static int[] extendArrayInteger(int[] br){
	
		int[] temp=new int[br.length+1];
		
		for(int i=0;i<br.length;i++){
			
			temp[i]=br[i];
			
		}
		
		return temp;
		
	}
	public static Details[] extendArray(Details[] br){
	
		Details[] temp=new Details[br.length+1];
		
		for(int i=0;i<br.length;i++){
			
			temp[i]=br[i];
			
		}
		
		return temp;
		
	}
	public static String GeneratedId(){
		
		int num=0;
		
		if(d.length==0){
		
			return "ODR#00001";
		}
		
		
		else{
			
			String id=d[d.length-1].getOrderId();
			
			num = Integer.parseInt(id.split("[#]")[1]);
			num++;
				
			
		}
		
		return String.format("ODR#%05d",num);
		
		
	}
	
	public static void PlaceOrder(){
		
		System.out.println("\r\n\t  _____  _                   ____          _           \r\n\t |  __ \\| |                 / __ \\        | |          \r\n\t | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ \r\n\t |  ___/| |/ _` |/ __/ _ \\ | |  | | \'__/ _` |/ _ \\ \'__|\r\n\t | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   \r\n\t |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|   ");
		System.out.println("\t\b___________________________________________________________");
		System.out.println();
		
		
		
		Details temp=new Details();
		
		
		String id= GeneratedId();
		System.out.println("\n\tEnter Order ID : "+id);
		
		d=extendArray(d);
		d[d.length-1]=temp;
			
		temp.setOrderId(id);
		
		
		
		
		L1:do{
		
			temp.setstatus(0);
			
			System.out.print("\n\tEnter Customer Phone Number : ");
			String Number=input.next();
			
			
						
				if(isValid4nNumber(Number)==true){
					
					temp.setPhoneNumber(Number);
					
				}   
			
				else{
					
					System.out.println("\n\t\t Invalid Phone number.. Try again!");
					
					System.out.print
						("\n\tDo you want to enter phone number again? (y/n):");
					String Ans1=input.next().toLowerCase();
					System.out.print("\033[6A");
					System.out.print("\033[0J");
					
					
						if(Ans1.equals("y")){
							continue L1;
						}
						else if(Ans1.equals("n")){
							clearConsole();
							MainMenu();
						}
					
					
				}
				
				
				System.out.print("\n\tEnter T-Shirt Size(XS/S/M/L/XL/XXL) :");
				String Size=input.next().toUpperCase();
							
				if (!(Size.equals("XS") || Size.equals("S") || Size.equals("M") || Size.equals("L") || Size.equals("XL") || Size.equals("XXL"))){
					
					System.out.println("\n\t\tEnter Valid Size...");
					System.out.print("\n\tDo you want to place order again? (y/n):");
					String Ans4=input.next().toLowerCase();
					clearConsole();
					
										
					if(Ans4.equals("y")){
						
						PlaceOrder();
					}
					
					else if(Ans4.equals("n")){
						
						MainMenu();
					}
				}
				
				
				temp.setSizeArr(Size);
			
			System.out.print("\n\tEnter QTY :");
			int Q=input.nextInt();
			
			
			if(Q>0){
				
				temp.setQTYarr(Q);
				
				System.out.println("\n\tAmount :"+Qty(Size,Q));
				
				temp.setAmount(Qty(Size,Q));
				
			}
			
			else{
				System.out.println("\n\tEnter Valid QTY...");
				Answere();
			}
					
					
					
					System.out.print("\n\tDo you want to place this order? (y/n):");
					String Ans2=input.next().toLowerCase();
					
						if(Ans2.equals("y")){
							
							
							System.out.println("\n\t\tOrder Placed..!\n");
							
							temp.setstatus(1);
							
							Answere();
							
						}
						else if(Ans2.equals("n")){
							
							Answere();
						}
						
		
		} while (true);    
		
	}
	public static void MainMenu(){
		
	   do{
			System.out.println("\r\n\t /$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                          \r\n\t| $$_____/                | $$      |__/                           /$$__  $$| $$                          \r\n\t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ \r\n\t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$\r\n\t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$\r\n\t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$\r\n\t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/\r\n\t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ \r\n\t                                                                                                | $$      \r\n\t                                                                                                | $$      \r\n\t                                                                                                |__/      ");
			System.out.println("\n\n\t\b------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n");
			System.out.printf("\t\t\t\b%-23s","[1] Place Order");
			System.out.printf("\t\t\t\t\t\t%-19s","[2] Search Customer");
			System.out.println();
			System.out.println();
			System.out.printf("\t\t\t\b%-23s","[3] Search Order");
			System.out.printf("\t\t\t\t\t\t%-19s","[4] View Reports");
			System.out.println();
			System.out.println();
			System.out.printf("\t\t\t\b%-23s","[5] Change Order Status");
			System.out.printf("\t\t\t\t\t\t%-19s","[6] Delete Order");
		
			
			
			
				
					
					System.out.print("\n\n\n\t\t\t\bInput Option : ");
					int option=input.nextInt();
					clearConsole();
					
					
					switch (option){
						case 1:PlaceOrder();break;
						case 2:SearchCustomer();break;
						case 3:SearchOrder();break;
						case 4:ViewReports();break;
						case 5:ChangeOrderStatus();break;
						case 6:DeleteOrder();break;
						default:
					}
				
		}while(true);	
			
			
			
		
		
	}	
	public static void MyDetails(){
	
		System.out.println("\t\t\t\t\t\t    OOP Coursework 1");
		System.out.println("\t\t\t\t\t\tTharaka Gihan Dhananjaya");
		System.out.println("\t\t\t\t\t\t       iCM_104011\n\n");	
		
	}
	
	public static void main(String[] OOP1){
		
		MyDetails();
		MainMenu();
		
	}	
	
}
