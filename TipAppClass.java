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

    public int getCleanInput(String message)
    {
		// Create a scanner
		Scanner inputScan = new Scanner(System.in);

		// Get input from user
		System.out.print(message);

        // If the input is an integer
        if (inputScan.hasNextInt())
        {
            // return the scanner obj
            return inputScan.nextInt();
        }
        else 
        {
            return getCleanInput("Please enter a valid number : ");
        }

    }


	public void calculateTips()
	{

		// Continue? 
        boolean again = true;
		Scanner againScan = new Scanner(System.in);

        // Primary header
        System.out.print("*** Tip Calculator ***\n\n");

        while (again)
        {

            // Instantiate TipCalculator object
            TipCalculator myTipCalculator = new TipCalculator();

            // set bill amount if input okay 
            myTipCalculator.setBillAmount(getCleanInput("Enter the bill amount: "));
            myTipCalculator.setTipPercentage(getCleanInput("Enter your desired tip percentage (20 equals 20%): "));
            myTipCalculator.setPartySize(getCleanInput("Enter the size of your party: "));

            // heading
            System.out.print("*** Your Bill ***\n\n");
            
            // Get all of the data members
            System.out.print("Bill Amount: $" + myTipCalculator.getBillAmount() + "\n");
            System.out.print("Tip Percentage: " + myTipCalculator.getTipPercentage() + "%\n");
            System.out.print("Party Size: " + myTipCalculator.getPartySize() + "\n\n");

            // Close out our tab 
            System.out.print("Total Bill (with Tip): $" + myTipCalculator.getTotalBill() + "\n");
            System.out.print("Share for Each Individual: $" + myTipCalculator.getIndividualShare() + "\n\n");


            // Ask if we should continue
            System.out.print("Another bill? (y/n): ");

            if (againScan.nextLine().equalsIgnoreCase("y"))
            {
                again = true;
            }
            else
            {
                // Goodbye!
                System.out.print("Goodbye!");
                
                // Stop loop
                again = false;
            }

        }

        // close scanner
		againScan.close();
	}
}
