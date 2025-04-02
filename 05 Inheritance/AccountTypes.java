class SavingsAcc extends BankAccount{
    private float intRate;
    public SavingsAcc(int accNum, int bal, float intRate){
        super(accNum, bal);
        this.intRate = intRate;
    }
    public void display(){
        super.display();
        System.out.println("Interest rate: "+intRate);
    }
}
class CheckingAcc extends BankAccount{
    private int withdrawalLimit;
    public CheckingAcc(int accNum, int bal, int withdrawalLimit){
        super(accNum, bal);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void display(){
        super.display();
        System.out.println("Withdrawal limit: "+withdrawalLimit);
    }
}
public class AccountTypes {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1234, 2772);
        SavingsAcc sa = new SavingsAcc(2345, 2772, 3.2f);
        CheckingAcc ca = new CheckingAcc(3455, 5000, 1000);
        ba.display();
        System.out.println("-----");
        sa.display();
        System.out.println("-----");
        ca.display();
    }
}
