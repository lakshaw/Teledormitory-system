/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Aryap
 */
public class ThreeMonths 
{
    double price;
    double planName;
    int validity ; // in days
	String data;
    
	public void test() {
		
		LocalDate today=LocalDate.now();
		System.out.println("recharge is successful for your phone number on" + today);
		System.out.println("thank you :)");
	}
		public void expire() {
		LocalDate today=LocalDate.now();
		LocalDate nextMonth = today.plus(3,ChronoUnit.MONTHS);
		System.out.println("your plan will expire on "+ nextMonth);
		}
	
	
		public void ChoosePlan() {
			Scanner sc = new Scanner(System.in);
	        ThreeMonths tm = new ThreeMonths(); 
			int choice;
		
			System.out.println("Enter your choice for Three Month :\n 1. 1197 Rs\n 2. 2097 Rs\n 3. 2997 Rs\n 4. 7497 Rs\n 5. 11997 Rs\n 6. 25497 Rs");
			choice = sc.nextInt();
			
		switch(choice)
			{
			case 1 :
             tm.getPlanInfo(1197,1197,90,"Unlimited @ 30 mbps");
			break;
	
			case 2:
            tm.getPlanInfo(2097,2097,90,"Unlimited @ 100 mbps");
			break;
	
			case 3 :
              tm.getPlanInfo(2997,2997,90,"Unlimited @ 150 mbps");
			break;
	
            case 5:
			tm.getPlanInfo(7497,7497,90,"Unlimited @ 500 mbps");
			break;

            case 4 :
			tm.getPlanInfo(11997,11997,90,"Unlimited @ 1 Gbps");
			break;
	
			case 6 :
			tm.getPlanInfo(25497,25497,90,"6600 GB @ 1 Gbps");
			break;
		    
			
	    }
   
		
}
   
    public void getPlanInfo(double p, double q, int n,String d)
    {
        planName = p;
		price = q;
		validity = n;
		data = d;
        System.out.println("Plan :"+planName);
        System.out.println("Plan validity in days:"+validity);
        System.out.println("Price of plan :"+price);
		System.out.println("Data :"+data);
    }
	
}
    

