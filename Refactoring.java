/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shad Munir
 */
import java.util.Enumeration;

public class Refactoring {
	private MyCollection orders = new MyCollection();
	private String name = "Customer name";
	
	void printOwing()
	{
		Enumeration<E> e = orders.elements();
		double outstanding = 0.0;
		
		//print banner
		print_banner();
		
		// calculate outstanding
		while(e.hasMoreElements())
		{
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
			
		}
		
		// print details 
		
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);

	}

	private void print_banner() {
		System.out.println("*****************************");
		System.out.println("****** Customer Owes ********");
		System.out.println("*****************************");
	}
	

}
