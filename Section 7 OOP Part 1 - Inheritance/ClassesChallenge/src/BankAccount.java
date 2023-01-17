public class BankAccount {
    private String accountNumber;
    private double accountBalance;

    private  String customerName;
    private String Email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositAmount(double amount){
        this.accountBalance+=amount;
        System.out.println("Deposited Rs "+amount+". Your new balance is "+this.accountBalance);
    }

    public void withdrawAmount(double amount){
        if(this.accountBalance<amount){
            System.out.println("Insufficient Finds!! You only have Rs "+this.accountBalance+" in your account.");
            return;
        }
        this.accountBalance-=amount;
        System.out.println("Withdraw of Rs "+amount+" processed, Remaining balance = Rs "+ this.accountBalance);
    }
}
