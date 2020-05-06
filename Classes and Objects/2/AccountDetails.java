import java.util.*;
public class AccountDetails
{
    public Scanner sc = new Scanner(System.in);
    public static Account ac=new Account();
    public Account getAccountDetails()
    {
        //Account ac=new Account();
        System.out.println("Enter account id:");;
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account type:");
        String type=sc.nextLine();
        int balance;
        while(true)
        {
            System.out.println("Enter balance:");
            balance=sc.nextInt();
            if(balance<=0)
            System.out.println("Balance should be positive");
            else
            break;
        }
        ac.setAccountId(id);
        ac.setAccountType(type);
        ac.setBalance(balance);
        return ac;
    }
    public int getWithdrawAmount()
    {
        int amount;
        while(true)
        {
            System.out.println("Enter amount to be withdrawn:");
            amount=sc.nextInt();
            if(amount<=0)
            System.out.println("Amount should be positive");
            else
            break;
        }
        return amount;
    }
    public static void main (String[] args) {
        AccountDetails obj=new AccountDetails();
        ac=obj.getAccountDetails();
        int amount=obj.getWithdrawAmount();
        ac.withdraw(amount);
        
    }
}