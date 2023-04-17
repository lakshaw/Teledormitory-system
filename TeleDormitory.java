/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import java.util.Scanner;
import static logic.TeleDormitory.Node.address;
import static logic.TeleDormitory.Node.adharNo;
import static logic.TeleDormitory.Node.flatNo;
import static logic.TeleDormitory.Node.nameOfUser;
import static logic.TeleDormitory.Node.phoneNo;

/**
 *
 * @author Aryap
 */
public class TeleDormitory 
{
            
	
	    Node head;

	    static class Node
            {
		
			static String nameOfUser;
	                static String address;
	                 static int flatNo;
	                 static long phoneNo;
	                 static long adharNo;
    
			Node next;
		
			Node(String nameOfUser,String address,int flatNo,long phoneNo,long adharNo)
                        {
			  this.nameOfUser = nameOfUser;
                          this.address = address;
                          this.flatNo = flatNo;
                          this.phoneNo = phoneNo;
                          this.adharNo = adharNo;
			  this.next = null;
			}
                        public static void displayUserInfo()
        {
                     System.out.println("User Name :"+nameOfUser);
		    System.out.println("User's address :"+address);
		    System.out.println("User's phone no :"+phoneNo);
		    System.out.println("User's adhar no :"+adharNo);
		    System.out.println("User's flat no :"+flatNo);
		    System.out.println();
        }
	    } 
	
	 
	 public static TeleDormitory createSLL( TeleDormitory list){

                 
		 Node currnode = null;
	     
		 Node new_node = new Node(nameOfUser,address, (int) phoneNo,adharNo,flatNo);
		 
		 if(list.head == null)
                 {
			 list.head = new_node;
		 }
		 else
                 {
			 currnode = list.head;
			 while(currnode.next != null){
					currnode = currnode.next;
		     }
			currnode.next = new_node;
		 }
                 

    
			return list;
         }
	 
	  public static void printList(TeleDormitory list)
               {
                   
		  Node currnode = list.head;
		  System.out.println("User Info List :");
		  while(currnode != null)
			{
			  currnode.displayUserInfo();
			  currnode = currnode.next;
			}
		}
         	
	   public static TeleDormitory insertAtEND(TeleDormitory list)  
		{
	        	
	        	
			Node newnode = new Node(nameOfUser,address, (int) phoneNo,adharNo,flatNo);
			Node currnode = list.head;
			if(list.head == null)
			{
				System.out.println("No User");
				list.head = newnode;
			}
			
			else
			{
				while(currnode.next != null)
				{
					currnode = currnode.next;
				}
				currnode.next = newnode;
			}
			return list;
		}
	        
	  public static TeleDormitory insertInBetween(TeleDormitory list,String nameOfUser,String address, long  phoneNo,long adharNo,int flatNo)
		{
		  Scanner sc = new Scanner(System.in);
		  Node newNode = new Node(nameOfUser,address, (int) phoneNo,adharNo,flatNo);
		  Node currNode = list.head;
		  if(list.head == null)
			{
			  System.out.println("No User !");
			  list.head = newNode;
			}
			else
			{
				System.out.println("Enter the position at which you want to insert the User :");
				int key = sc.nextInt();
				int cnt = 1;
				while(currNode.next != null && key != cnt)
				{
					currNode = currNode.next;
					cnt++;
				}
			    newNode.next = currNode.next;
				currNode.next = newNode;
			}
			return list;
		}

   
    public static TeleDormitory delete(TeleDormitory list)
		{
		  //Node temp = null;
		  Node currnode = list.head;
		  if(list.head == null)
			{
			  System.out.println("No User!! Can't perform Deletion operation ");
			}
			else
			{
				while(currnode.next.next != null)
				{
					currnode = currnode.next;
				}
				currnode.next = null;
			}
			return list;
		}
	  
	 public static TeleDormitory deleteInBetween(TeleDormitory list,int flatNo)
		{
		Scanner sc = new Scanner(System.in);
		Node currnode;
		Node temp = null;
		int key = 0;
		if(list.head == null)
			{
	          System.out.println("No User!!");
			}
			else
			{
				System.out.println("Enter the flat number of User that you want to delete");
				key = sc.nextInt();
                                
			if(key == list.head.flatNo && list.head.next == null) {
                            System.out.println("The list has only one User");
                            list  .head = null;
                    } else if (list.head.next != null && key == list.head.flatNo)
                    {
                        System.out.println("First member of system will be deleted !");
                        temp = list.head;
                        list.head = temp.next;
                        temp=null;
                    }
                    else
                    {
                        currnode = list.head;
                        while(currnode.next != null && key != currnode.next.flatNo)
                        {
                            currnode = currnode.next;
                        }
                        temp = currnode.next;
                        
                        if(temp.next == null)
                        {
                            currnode.next = null;
                        }
                        else
                        {
                            currnode.next = temp.next;
                            temp.next = null;
                            temp=null;
                        }
                    }
			}
				return list;
				}
	
	 public static TeleDormitory updateVlaue(TeleDormitory list) 
         {
	        long key=0;
	        Node Current_node;

	        Scanner in5=new Scanner(System.in);
	        System.out.print("-Enter Previous PhoneNo :");
	        key=in5.nextLong();

	        if(list.head==null) {
	            System.out.println("No User!!");
	        }

	        else {
	            Current_node=list.head;
	            while(Current_node.next!=null && Current_node.next.phoneNo!=key) {
	                Current_node=Current_node.next;
	            }

	            System.out.print("-Enter New PhoneNo for update:");
	            long updatevlaue=in5.nextLong();

	           
	            Current_node.next.phoneNo=updatevlaue;
	        }
	        return list;
	    }
	
	

}
