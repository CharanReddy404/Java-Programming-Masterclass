public class Main {
    public static void main(String[] args) {
//        BankAccount accountOne = new BankAccount();
//        accountOne.setCustomerName("Charan");
//        accountOne.setAccountNumber("111");
//        accountOne.setEmail("chara@java.in");
//        accountOne.setPhoneNumber("999999999");
//        accountOne.setAccountBalance(1000.00);
//
//        accountOne.depositAmount(200.00);
//        accountOne.withdrawAmount(1200.00);

//

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}