public class TipCalculator
{
    // Data members
    private double billAmount = 0;
    private int tipPercentage = 20;
    private double partySize= 1;

    // Setters and getters
    public setBillAmount(int billAmount)
    {
        this.billAmount = billAmount;
    }

    public getBillAmount()
    {
        return this.billAmount;
    }

    public setTipPercentage(int tipPercentage)
    {
        this.tipPercentage = tipPercentage;
    }

    public getTipPercentage()
    {
        return this.TipPercentage;
    }

    public setPartySize(int partySize)
    {
        this.partySize= partySize;
    }

    public getPartySize()
    {
        return this.partySize;
    }

    // Fancy methods
    public getTotalBill()
    {
        return this.billAmount * this.tipPercentage + this.billAmount;
    }

    public getIndividualShare()
    {
        this.getTotalBill() / this.getPartySize();
    }

}
