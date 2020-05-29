public class Account {

    // class fields / variables
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    /*
        Constructors allow us to set the initial values of a object instance when a new instance is being created with
        the use of the 'new' keyword which calls the constructor for us.

        Constructors can also be overloaded
     */

    public Account(String accountNumber, double balance, String customerName, String email,  String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(){
        this.accountNumber = "0000000000";
        this.balance = 00.00;
        this.customerName = "Unknown";
        this.email = "Unknown";
        this.phoneNumber = "Unknown";
    }


    /*
        Getters and setters
     */
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void depositToAccount(double amount){
        this.balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("A new balance of " + this.balance + " is now available");

    }

    public void withdrawFromAccount(double amount){

        // only allow the transaction to happen if there are enough funds
        if(amount <= this.balance){
            this.balance -= amount;
            System.out.println("Withdraw of " + amount + " processed.");
            System.out.println("Remaining balance of: " + this.balance);
        } else {
            System.out.println("Insufficient funds, unable to process transaction");
        }
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}
