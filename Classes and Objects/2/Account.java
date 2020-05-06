public class Account
{
    private int accountId;
    private String accountType;
    private int balance;
    public void setAccountId(int accountId)
    {
        this.accountId=accountId;
    }
    public int getAccountId()
    {
        return accountId;
    }
    public void setAccountType(String accountType)
    {
        this.accountType=accountType;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
    public int getBalance()
    {
        return balance;
    }
    public boolean withdraw(int amount)
    {
        if(balance>=amount)
        {
            System.out.println("Balance amount after withdraw: "+(balance-amount));
            return true;
        }
        else
        {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
}