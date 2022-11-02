package se.lexicon;

public class BankAccount {
    private String customerName;
    private int accountNumber;
    private  double balance;
    private String Email;
    private String phoneNumber;


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return  customerName;
    }
    public  void setAccountNumber(int accountNumber){
        this.accountNumber= accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double balance){
        this.balance= balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public BankAccount ( String customerName,int accountNumber,double balance,String email,String phoneNumber) {
      this .customerName= customerName;
      this.accountNumber= accountNumber;
      this.balance= balance;
      this.Email= email;
      this.phoneNumber= phoneNumber;
    }
    public void withdrawfunds (double amount) {
       balance = balance - amount;
    }

    public void deposit (double amount) {
        balance = balance + amount;
    }
}

