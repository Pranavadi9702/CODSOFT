import java.util.Scanner;
public class ATMInterface
{
    static double balance=0;
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String args[])
    {
        boolean quit = false;
        printmenu();

        while(!quit)
        {
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                checkBalance();
                break;

                case 2:
                deposit();
                break;

                case 3:
                withdraw();
                break;

                case 4:
                quit=true;
                System.out.println("=======================================================");
                System.out.println("                  THANKS FOR USING ATM                 ");
                System.out.println("=======================================================");
                break;

                default:
                System.out.println("Invalid option select , Please select a valid option");
                System.out.println(" ");
            }
        }
    }

    public static void printmenu()
    {
        System.out.println(" ");
        System.out.println("=================================================================");
        System.out.println("                             WELCOME TO ATM                      ");
        System.out.println("=================================================================");
        System.out.println(" ");
        System.out.println("1. Check Your Bank Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public static void checkBalance()
    {
        System.out.println("Your Bank Balance is $" + balance );
        System.out.println(" ");
    }
    
    public static void deposit()
    {
        System.out.println(" ");
        System.out.println("Enter the amount you want to Deposit: ");
        double amount=sc.nextDouble();

        if(amount<0)
        {
            System.out.println("Please enter a valid amount");
            System.out.println(" ");
        }
        else
        {
            balance=balance+amount;
            System.out.println("You have deposited $" + amount);
            System.out.println(" ");
        }
    }

    public static void withdraw()
    {
        System.out.println(" ");
        System.out.println("Enter the amount you want to Withdraw: ");
        double amount=sc.nextDouble();

        if(balance<amount)
        {
            System.out.println("Insufficient account balance , Cannot Withdraw Money");
            System.out.println(" ");
        }
        else
        {
            balance=balance-amount;
            System.out.println("You have Withdrawed $" + amount);
            System.out.println(" ");
        }
    }
}