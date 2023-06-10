import java.util.Scanner;
public class Account {
    int balance=10000;
    String accNo="101010";
    String pass="abc";


    public String accNo()
    {
        return accNo;
    }
    public String getPass()
    {
        return pass;
    }
    public void checkBal()
        {
            System.out.println("Current Balance is:"+balance);
    }
    public void witdrawBal()
    {
        System.out.println("Enter amount that you want to withdraw:");
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(balance>temp)
        {
            balance=balance-temp;
            System.out.println(temp+" rupees is withdraw from your accout.");
            System.out.println("Your current balance is:"+balance);
        }
        else {
            System.out.println("You have not sufficient amount: "+balance);
        }
    }
    public void deposit()
    {
        System.out.print("Enter the amount that you want to deposit:" );
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        balance+=temp;
        System.out.println("enter amount deposited..");

    }
}
