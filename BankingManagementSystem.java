import java.lang.System;
import java.util.Scanner;
class Account()
{
    void getdetails()
    {
        System.out.print("Enter Your Name : ");
        String name=scan.nextString();
        System.out.print("Enter Your Account Number : ");
        int accountnumber=scan.nextInt();
    }
    void displaydetails()
    {
        System.out.println("Name           : "+name);
        System.out.println("Account Number : "+accountnumber);
    }
}
class SavingAccount
{
    void deposit()
    {
        System.out.print("How Much you have to deposit");
        int deposit = scan.nextInt();
        balance +=deposit;
        System.out.print("Balance After Deposit "+balance);
    }
}
class CurrentAccount
{

}
class Practice
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        SavingAccount s = new SavingAccount();
        CurrentAccount c = new CurrentAccount();
        System.out.println("1.Saving Account ");
        System.out.println("2.Current Account ");
        System.out.println("Enter Account type ");
        int type = scan.nextInt();
        if(type==1)
        {
            boolean run =true;
            while(run)
            {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Display Details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                int choice=scan.nextInt();
                switch(choice)
                {
                    case 1:
                        
                }
            }
            
            
            //Savings account
        }
        else if(type==2)
        {
            //current account
        }
        else
        {
            System.out.print("Invalid  Account type entered!!!");
        }
    }
}
