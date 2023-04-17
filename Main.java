/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.Scanner;
import logic.OneMonth;
import logic.OneYear;
import logic.SixMonths;
import logic.TeleDormitory;
import logic.ThreeMonths;

import java.lang.String;

/**
 *
 * @author Aryap
 */
public class Main 
{   
    
    public static void acceptInfo()
    {
                   Scanner obj1=new Scanner(System.in);
	            System.out.print("-Enter Name : ");
	            String name=obj1.next();
	            System.out.print("-Enter Address :");
	            String address=obj1.next();
	            System.out.print("-Enter Flat no : ");
	            int flatNo=obj1.nextInt();
	            System.out.print("-Enter Phone no : ");
	            long phoneNo=obj1.nextLong();
	            System.out.print("-Enter Adhar no : ");
	            long adharNo=obj1.nextLong();
	   	     
    }
   
    
           public static void main(String[] args) 
           {
	
               TeleDormitory t1 = new TeleDormitory();
		System.out.println("******* WELCOME TELEDORMITORY MANAGEMENT SYSTEM *******");
		System.out.println();
		Scanner obj1=new Scanner(System.in);
		int flag=0;
		while(flag==0){

		System.out.println("Menu:");
		System.out.println("1)Read Information TELEDORMITORY MANAGEMENT SYSTEM");
		System.out.println("2)Create List of User");
		System.out.println("3)Print List");
		System.out.println("4)Add User(At end)");
                System.out.println("5)Add User( In between)");
		System.out.println("6)Delete User");
		System.out.println("7)Upgrade PhoneNo");
		System.out.println("8)Exit");
		
		System.out.println();
		System.out.print("Enter your Choice:");
		int choice1=obj1.nextInt();
		
		switch(choice1) 
                {
		
		case 1:
			System.out.println("Read the following Information");
			System.out.println("-----------------------------------------------------------------------------------------------");
			System.out.println("1]The tele dormitory system is system which will manage all the information of the user ");
			System.out.println("2]It will provide an easy way through which a user can access the details regarding the connection. ...");
			System.out.println("3]The Tele Dormitory System will provide a function through which user can apply for connection, upgrade the plane, stop the connection");
			
			
			System.out.println("");
			System.out.println("______________________________________");
			System.out.println("                  THANK YOU SO MUCH FOR READING....!!!!!!");
			System.out.println("______________________________________");
			System.out.println("");
			System.out.println("                             SO ARE YOU READY ????");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	        System.out.println();
	        System.out.println("");
			System.out.println("Enter (1)to Continue\n2)Enter (2) to Leave");
			int choice2 = obj1.nextInt();
			if(choice2==2) {
				System.out.println("Thank-you...");
				flag=1;
			}
			break;
			
		case 2:
                       int choice3;  
                       int planChoice;
                       
                     
                       
                      
	        do {
                       
	                 acceptInfo();
                         t1.createSLL(t1);
                        
                        System.out.println("Plan Menu:\n1)One Month\n2)Three Months\n3)Six Months\n4)One Year");
		     System.out.print("Enter your Choice :");
			      planChoice=obj1.nextInt();

				switch(planChoice) 
                                {
				case 1:
				    OneMonth ob1=new OneMonth();
				    ob1.ChoosePlan();
				    ob1.test();
				    ob1.expire();
                                    System.out.println("Thank You for choosing this plan !");
					break;
					
				case 2:
					ThreeMonths ob2=new ThreeMonths();
					ob2.ChoosePlan();
					ob2.test();
				        ob2.expire();
					System.out.println("Thank You for choosing this plan !");
					break;
					
				case 3:
					SixMonths ob3=new SixMonths();
					ob3.ChoosePlan();
					ob3.test();
				        ob3.expire();
                                        System.out.println("Thank You for choosing this plan !");
					break;	
					
				case 4:
					OneYear ob4= new OneYear();
					ob4.ChoosePlan();
					ob4.test();
				        ob4.expire();
                                    System.out.println("Thank You for choosing this plan !");
					break;	
					
                                }	
                
                        			        
                
		               System.out.println("Do you want to add another user? ");
                               System.out.println("press 1 if yes");
                               System.out.println("Press 2 if No");
                               choice3 = obj1.nextInt();
                }
                
                while(choice3 == 1);
		break;
		case 3:
			t1.printList(t1);
			break;
			
		case 4:
                        acceptInfo();
			t1.insertAtEND(t1);
			break;
			
               // case 5:
                 //   t1.insertInBetween(t1,nameOfUSer,);
                   // break;
                    
		case 6:
                        int flatNo = 0;
			t1.deleteInBetween(t1,flatNo);
			break;
			
		case 7:
			t1.updateVlaue(t1);
			
		case 8:
			flag=1;
			break;
                }
                }
               
		System.out.println();
		System.out.println("********* END OF CODE*********** ");
                }
           }

