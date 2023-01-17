public class BankAccount {
    private int accountNumber;
    private double accountBalance;

    private  String customerName;
    private String Email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositAmount(double amount){
        this.accountBalance+=amount;
    }

    public void withdrawAmount(double amount){
        if(this.accountBalance<amount){
            System.out.println("Low Balance! Your Balance is "+this.accountBalance);
            return;
        }
        this.accountBalance-=amount;
        System.out.println("Remaining Balance in your Account is "+this.accountBalance);
    }
}
