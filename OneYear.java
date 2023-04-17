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
public class OneYear
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
		LocalDate nextyear = today.plus(1,ChronoUnit.YEARS);
		System.out.println("your plan will expire on "+ nextyear);
		}
	
	public void ChoosePlan() {
		Scanner sc = new Scanner(System.in);
        OneYear o1 = new OneYear(); 
		int choice;
	
    System.out.println("Enter your choice for One Year : 1. 4788 Rs\n 2. 8388 Rs\n 3. 11988 Rs\n 4. 29988 Rs\n 5. 47988 Rs\n 6. 101988 Rs");
        choice = sc.nextInt();
		switch(choice)
			{
			case 1 :
             o1.getPlanInfo(4788,4788,390,"Unlimited");
			break;
	
			case 2:
            o1.getPlanInfo(8388,8388,390,"Unlimited");
			break;
	
			case 3 :
              o1.getPlanInfo(11988,11988,390,"Unlimited");
			break;
	
            case 5:
			o1.getPlanInfo(29988,29988,390,"Unlimited");
			break;

            case 4 :
			o1.getPlanInfo(47988,47988,390,"Unlimited");
			break;
	
			case 6 :
			o1.getPlanInfo(101988,101988,390,"6600 GB");
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
        System.out.println("Plan validity :"+price);
        System.out.println("Price of plan :"+validity);
		System.out.println("Data :"+data);
    }
}	
