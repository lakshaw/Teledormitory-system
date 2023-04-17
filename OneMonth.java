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
public class OneMonth
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
		LocalDate nextMonth = today.plus(1,ChronoUnit.MONTHS);
		System.out.println("your plan will expire on "+ nextMonth);
		}
		

 
	public void ChoosePlan() {
    
	    Scanner sc = new Scanner(System.in);
	    OneMonth om= new OneMonth(); 
        
	int ch;
	
	
        System.out.println("Enter your choice for One Month  : \n1.150 Rs\n 2. 200 Rs\n 3. 300 Rs\n 4. 500 Rs");
        ch = sc.nextInt();
        
	switch(ch){
			case 1 :
             om.getPlanInfo(150,28,"Unlimited");
			break;
	
			case 2:
            om.getPlanInfo(200,28,"Unlimited");
			break;
	
			case 3 :
              om.getPlanInfo(300,28,"Unlimited");
			break;
	
            case 4:
            om.getPlanInfo(500,28,"Unlimited");
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

