public class Main {
    public static void main(String[] args) {

        Account johnsAccount = new Account("0123456789", 300.00, "John Doe", "JohnDoe@gmail.com", "(512) 867-5309");
        Account billysAccount = new Account();

        johnsAccount.depositToAccount(1000.00);
        johnsAccount.withdrawFromAccount(230.00);
        johnsAccount.withdrawFromAccount(10000000.00);

        System.out.println("Billys account number is currently: " + billysAccount.getAccountNumber());

        /*
            Challenge
            Creat a new class VipCustomer
            it should have 3 fields nae, creditLimit, and email address.
            create 3 constructors
            1st constructor should be empty all the constructor with 3 param with default values.
            2nd should pass on the 2 values it receives and add a default value for the 3rd
            3rd should save all fields
            create only getters for this, no setters needed
         */

        VipCustomer vipCx = new VipCustomer("Jane Doe", "JaneDoe@gmail.com");
        System.out.println("VIP credit limit is: " + vipCx.getCreditLimit());
    }
}
