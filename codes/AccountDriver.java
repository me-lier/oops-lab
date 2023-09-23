class Account {
    private String acc_hol_name; 
    private int acc_no;
    private double balance;
    
    Account(String accname, int accno, double bal) { 
        this.acc_hol_name = accname;
        this.acc_no = accno;
        this.balance = bal;
    }
    public String getName() {
        return acc_hol_name; 
    }
    public void setName(String newname, int old_acc_no) { 
        if (this.acc_no == old_acc_no) {
            this.acc_hol_name = newname; 
            System.out.println("Account holder name change Successfully");
        } else {
            System.out.println("Invalid Account Number"); 
        }
    }
public int getAccno() {
return acc_no; }
public double getBalance() {
return balance; }
public void setBalance(double newbal, int old_acc_no) { if (this.acc_no == old_acc_no) {
this.balance = this.balance + newbal;
System.out.println("Amount is deposite Successfully"); }
else {
System.out.println("Invalid Account Number"); }
}
public void withdrawl(double newamount, int old_acc_no) {
if (this.acc_no == old_acc_no) { 
    this.balance = this.balance - newamount;
System.out.println("Amount withdrawl Successfully"); 
} else {
System.out.println("Invalid Account Number"); }
}
public void getAttribute() {
System.out.println("Account Holder Name =" + acc_hol_name); 
System.out.println("Account Number =" + acc_no); 
System.out.println("Balance =" + balance);
} }
public class AccountDriver {
public static void main(String[] args) {
Account ac1 = new Account("Vishal", 100, 13000.00);
ac1.getAttribute(); ac1.setName("Bhushan", 100); ac1.getAttribute(); System.out.println(ac1.getBalance()); ac1.setBalance(1500, 100); System.out.println(ac1.getBalance()); ac1.withdrawl(10000, 100); System.out.println(ac1.getBalance()); ac1.getAttribute();
} }