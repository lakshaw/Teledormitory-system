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
public class SixMonths 
{
    double price;
    double planName;
    int validity ; 
    String data;
    
    public void test() {
		
		LocalDate today=LocalDate.now();
		System.out.println("recharge is successful for your phone number on" + today);
		System.out.println("thank you :)");
	}
		public void expire() {
		LocalDate today=LocalDate.now();
		LocalDate nextyear = today.plus(6,ChronoUnit.MONTHS);
		System.out.println("your plan will expire on "+ nextyear);
		}
		
		
		public void ChoosePlan() {
 
    
	    Scanner sc = new Scanner(System.in);
	    SixMonths sm = new SixMonths(); 
        
	int ch;
	
        System.out.println("Enter your choice for Six Months: \n1. 2394 Rs\n 2. 4194 Rs\n 3. 5994 Rs\n 4. 8994 Rs\n 5. 14994 Rs");
        ch = sc.nextInt();
        
	switch(ch)
        {
			case 1 :
             sm.getPlanInfo(2394,195,"Unlimited");
			break;
	
			case 2:
            sm.getPlanInfo(4194,195,"Unlimited");
			break;
	
			case 3 :
              sm.getPlanInfo(5994,195,"Unlimited");
			break;
	
            case 4:
            sm.getPlanInfo(8994,195,"Unlimited");
			break;

            case 5 :
            sm.getPlanInfo(14994,195,"Unlimited");
			break;
	    }
   		
}	
   
    public void getPlanInfo(double q, int n,String d){
        
		price = q;
		validity = n;
		data = d;
        System.out.println("Plan validity :"+validity);
        System.out.println("Price of plan :"+price);
		System.out.println("Data :"+data);
    
	
      
    }
}
    

