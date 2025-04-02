public class SavingsAccount extends BankAccount {
    private String branch;

    public SavingsAccount(int AccNum, String AccHolder, int bal, String branch){
        super(AccNum, AccHolder, bal);
        this.branch = branch;
    }

    public void display(){
        System.out.println("Account number: "+AccNum);
        System.out.println("Account holder: "+AccHolder);
        System.out.println("Balance amount: "+getBal());
        System.out.println("Branch: "+branch);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1234, "Shrinath", 1500000, "Karur");
        sa.display();
        sa.setBal(2000000);
        System.out.println("Updated balance: "+sa.getBal());
    }
}
