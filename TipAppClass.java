/************************************************************
 *                                                          *
 *  CSCI 470-1          In-Class Exercise 1    Spring 2019  *
 *                                                          *
 *  Programmer:  Samuel Piecz                               *  
 *               z1732715                                   *
 *                                                          * 
 *                                                          *   
 *                                                          *
 *  Date Due:    2/13/19                                    *
 *                                                          *
 ************************************************************/ 

import java.util.Scanner;

public class TipAppClass
{
	public TipCalculator tipCalculatorObject;

	// main prog resides inside app class?
    public static void main(String[] args)
    {

		TipAppClass myTipAppClass = new TipAppClass();

		myTipAppClass.calculateTips();
	}


	public void calculateTips()
	{

		// 1
		// Create a scanner
		Scanner billScan = new Scanner(System.in);

		// 2
		// Get input from user
		System.out.print("Please enter bill amount: ");

		// Instantiate TipCalculator object
        TipCalculator myTipCalculator = new TipCalculator();


		////
		// Check if data okay - could be seperate function
		if (billScan.hasNextInt())
		{
			// set bill amount if input okay 
			myTipCalculator.setBillAmount(billScan.nextInt());
		}
		else
		{
			// if input bad redo 
			System.out.print("Please enter a valid integer : ");

			myTipCalculator.setBillAmount(billScan.nextInt());
		}

		// close scanner
		billScan.close();

		
		// 3
		// Prompt for and read tip percentage
		Scanner tipScan = new Scanner(System.in);

		System.out.print("Please enter tip percentage: ");

		////
		// Check if data okay - could be seperate function
		if (tipScan.hasNextInt())
		{
			// set tip percentage if input okay 
			myTipCalculator.setTipPercentage(tipScan.nextInt());
		}
		else
		{
			// if input bad redo 
			System.out.print("Please enter a valid integer : ");
			myTipCalculator.setTipPercentage(tipScan.nextInt());
		}

		tipScan.close();

		// 4
		// Prompt for and read party size 
		Scanner partyScan = new Scanner(System.in);

		System.out.print("Please enter party size: ");

		partyScan.close();

		////
		// Check if data okay - could be seperate function
		if (partyScan.hasNextInt())
		{
			// set party size if input okay 
			myTipCalculator.setPartySize(partyScan.nextInt());
		}
		else
		{
			// if input bad redo 
			System.out.print("Please enter a valid integer : ");
			myTipCalculator.setPartySize(partyScan.nextInt());
		}


		// 5
		// Get all of the data members
        myTipCalculator.getBillAmount();
        myTipCalculator.getTipPercentage();
        myTipCalculator.getPartySize();

		// Close out our tab 
		myTipCalculator.getTotalBill();
		myTipCalculator.getIndividualShare();

		// 6
		// Continue? 
		//String onwards;

		//Scanner onwardScan = new Scanner(System.in);

		//System.out.print("Would you like to continue? (y/N): ");

		//onwards = onwardScan.nextLine();

		//onwardScan.close();

		


	}
}
