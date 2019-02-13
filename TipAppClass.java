import java.util.Scanner;

public class TipAppClass
{
	public TipCalculator tipCalculatorObject;

	// main prog resides inside app class?
    public static void main(String[] args)
    {

		// Create a scanner
		Scanner input = new Scanner(System.in);

		// Instantiate TipCalculator object
        TipCalculator myTipCalculator = new TipCalculator();

		// Test out those good ol setters
        myTipCalculator.setBillAmount(billAmount);
        myTipCalculator.setTipPercentage(tipPercentage);
        myTipCalculator.setPartySize(partySize);

		// Get all of the data members
        myTipCalculator.getBillAmount();
        myTipCalculator.getTipPercentage();
        myTipCalculator.getPartySize();

		// Close out our tab 
		myTipCalculator.getTotalBill();
		myTipCalculator.getIndividualShare();

	}

	public calculateTips()
	{
	}
}
