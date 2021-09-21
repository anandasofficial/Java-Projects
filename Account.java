import java.util.Scanner;

public class Account {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    Account(String cname, String cid)
    {
        customerName = cname;
        customerID = cid;
    }
    void deposit(int amount)
    {
        if(amount != 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }

    }
    void withdraw(int amount)
    {
        if(amount != 0)
        {
            balance = balance - amount;
            previousTransaction = previousTransaction - amount;
        }

    }
    void getPreviousTransaction()
    {
        if(previousTransaction > 0)
        {
            System.out.println("Deposited:"+previousTransaction);
        }
        else if(previousTransaction < 0)
        {
            System.out.println("Withdrawn:"+Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No transaction occured!");
        }

    }
    void calculateInterest()
    {

    }
    void showMenu() {

        while(true) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome, " + customerName);
        System.out.println("Your ID is :" + customerID);
        System.out.println();
        System.out.println("Select Your Transaction TYpe :");
        System.out.println();
        System.out.println("1.Check Your Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.View Previous Transaction");
        System.out.println("5.Exit");
       
            System.out.println();
            System.out.println("Enter an option :");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.println("_______________________________");
                    System.out.println("Balance = " + balance);
                    System.out.println("_______________________________");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter an amount to deposit :");
                    int amount = s.nextInt();
                    deposit(amount);
                    showMenu();
                    break;
                case 3:
                    System.out.println("Enter an amount to withdraw :");
                    int amount2 = s.nextInt();
                    withdraw(amount2);
                    showMenu();
                    break;
                case 4:
                    System.out.println("_______________________________");
                    getPreviousTransaction();
                    System.out.println("_______________________________");
                    System.out.println();
                    break;


            }


        }
        
    }

    public static void main(String[] args)
    {
        Account obj = new Account("Anand","A009");
        obj.showMenu();


    }
}
