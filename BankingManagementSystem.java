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

}
class CurrentAccount
{

}
class BankingManagementSystem
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Saving Account ");
        System.out.println("2.Current Account ");
        System.out.println("Enter Account type ");
        int type = scan.nextInt();
        if(type==1)
        {
            
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
