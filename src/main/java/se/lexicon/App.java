package se.lexicon;

/**
 * Hello world!
 *
 */
     public class App {


    public static void main(String[] args) {


        BankAccount num1 = new BankAccount("azadeh", 123456, 1000,
                "azadeh@yaho.com", "123456");
        System.out.println(num1.getEmail());
        double amount;
        num1.deposit( 45.5);
        System.out.println(num1.getBalance());
        num1.withdrawfunds(45.5);
        System.out.println(num1.getBalance());

        BankAccount num2 = new BankAccount("artina", 654321, 2000,
                "artina@yaho.com", "654321");
        System.out.println(num2.getEmail());

        num2.deposit( 45.5);
        System.out.println(num2.getBalance());
        num2.withdrawfunds(45.5);
        System.out.println(num2.getBalance());
    }

}


