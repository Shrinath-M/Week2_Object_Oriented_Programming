public class BankAccount {
    private final int AccNum;
    private String AccName;
    private static int Acc_Count = 0;
    public static String bankName = "Union Bank of India";
    public BankAccount(int AccNum, String AccName){
        this.AccName = AccName;
        this.AccNum = AccNum;
        Acc_Count++;
    }
    public static void getTotalAccounts(){
        System.out.println("Total number of accounts: "+Acc_Count);
    }
    public void display(){
        if (this instanceof BankAccount){
            System.out.println("Name of the bank: "+bankName);
            System.out.println("Account holder name: "+AccName);
            System.out.println("Account number: "+AccNum);
        }
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(1234, "Shrinath");
        BankAccount ba2 = new BankAccount(2345, "Ritthi");

        ba1.display();
        ba2.display();
        getTotalAccounts();
    }
}
