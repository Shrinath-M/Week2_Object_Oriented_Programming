public class BankAccount {
    public int AccNum;
    protected String AccHolder;
    private int bal;

    public BankAccount(int AccNum, String AccHolder, int bal){
        this.AccHolder = AccHolder;
        this.AccNum = AccNum;
        this.bal = bal;
    }

    public int getBal(){
        return bal;
    }

    public int setBal(int newBal){
        this.bal = newBal;
        return newBal;
    }
}
