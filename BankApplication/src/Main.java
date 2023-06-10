import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("---------------------------");
        System.out.print("Enter account no:");
        Scanner sc=new Scanner(System.in);
        String strac= sc.next();
        System.out.print("Enter pin:");
        String strpin=sc.next();
        Account ac=new Account();
        while(strac.equals(ac.accNo()) && strpin.equals(ac.getPass()))
        {
            x:
            System.out.println("1. check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4.exit");
            int i=sc.nextInt();
            switch (i)
            {
                case 1:
                    ac.checkBal();
                    break;
                case 2:
                    ac.witdrawBal();
                    break;
                case 3:
                    ac.deposit();
                    break;
                case 4:
                    return;
            }
        }
        System.out.println("Enter pass is wrong");

    }
}