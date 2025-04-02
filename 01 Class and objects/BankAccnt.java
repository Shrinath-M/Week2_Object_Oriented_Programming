public class BankAccnt {
    private String AccHolder;
    private int AccNum;
    private int bal;

    public BankAccnt(String AccHolder, int AccNum, int bal){
        this.AccHolder = AccHolder;
        this.AccNum = AccNum;
        this.bal = bal;
    }
    public void Deposit(int amt_d){
        bal += amt_d;
        System.out.println("Balance after deposition: "+bal);
    }
    public void Withdraw(int amt_w){
        if (bal > 1000){
            System.out.println("Balance after withdrawal: "+(bal - amt_w));
        }
        else{
            System.out.println("Insufficient balance in your account");
        }
    }
    public void display(){
        System.out.println("Account holder name: "+AccHolder);
        System.out.println("Account number: "+AccNum);
        System.out.println("Balance amount in account: "+bal);
    }
}
