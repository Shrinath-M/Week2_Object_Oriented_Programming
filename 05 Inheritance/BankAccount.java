public class BankAccount {
    private int accNum;
    private int bal;
    public BankAccount(int accNum, int bal){
        this.accNum = accNum;
        this.bal = bal;
    }
    public void display(){
        System.out.println("Account number: "+accNum);
        System.out.println("Balance: "+bal);
    }
}
