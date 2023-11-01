import java.util.Scanner;
public class Task1
{
    public static int guessNum()
    {
        Scanner sc=new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        int chances=5;
        int i;
        //boolean try=true;
        heree:
        
        System.out.println("===============================================");
        System.out.println("|       WELCOME TO NUMBER GUESSING GAME       |");
        System.out.println("===============================================");
        System.out.println(" ");
        System.out.println("            Let's Start The Game      ");

        System.out.println("\n");

        System.out.println("System has Generated a Number within 1 to 100");
        System.out.println("Guess the number within 5 trials");

        for(i=0;i<chances;i++)
        {
            System.out.println("Enter the number: ");
            int usernum=sc.nextInt();
            System.out.println(" ");

            if(number==usernum)
            {
                System.out.println("Great!! You Have Guessed the Number Correct");
                break;
            }
            else if(number>usernum && i!=chances-1)
            {
                System.out.println("Number is greater than "+usernum);
            }
            else if(number<usernum && i!=chances-1)
            {
                System.out.println("Number is smaller than "+usernum);
            }
            else
            {
                System.out.println("");
            }
        }
        if(i==chances)
        {
            System.out.println("You have Exhausted");
            System.out.println("The number was "+ number);
        }
        System.out.println("\n");
    
        System.out.println("Press 1 for Playing again");
        System.out.println("Press 2 for Exit");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("\n");

            System.out.println(Task1.guessNum());
            break;
            //System.out.println("\n");
        
            case 2:
            System.out.println("Exitted");
            System.out.println("===================================");
            System.out.println("|        THANKS FOR PLAYING       |");
            System.out.println("===================================");
            break;

            default:
            System.out.println("Invalid input");
            break;
            
        }
        return 0;
        
    }

    public static void main(String args[])
    {
        guessNum();
    }
}