public class Main {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount();
        accountOne.setCustomerName("Charan");
        accountOne.setAccountNumber("111");
        accountOne.setEmail("chara@java.in");
        accountOne.setPhoneNumber("999999999");
        accountOne.setAccountBalance(1000.00);

        accountOne.depositAmount(200.00);
        accountOne.withdrawAmount(1200.00);
    }
}