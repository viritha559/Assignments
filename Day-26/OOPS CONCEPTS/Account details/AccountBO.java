import java.util.Scanner;
class Account{
    protected int accountnumber;
    protected double balance;
    protected String accountholdername;
}
class SavingAccount extends Account{
    double minimumbalance;
}  
class FixedAccount extends SavingAccount{
    int lockingperiod;
    
}


public class AccountBO{
    void getAccountDetails(String accountholdername){

        System.out.format("%-20s %-10s %-20s %-20s %s\n","accountnumber","balance","accountholdername","minimumbalance","lockingperiod");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int accountnumber = sc.nextInt();
         double balance = sc.nextDouble();
         sc.nextLine();
        String accountholdername = sc.nextLine();
        FixedAccount fa=new FixedAccount();
        fa.accountholdername = accountholdername;
        fa.accountnumber= accountnumber;
        fa.balance = balance;
        sc.close();
        }

}
