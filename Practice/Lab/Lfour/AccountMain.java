package Lfour;

class Acco{
	private long accnum;
	private double balance;
	private Perso accHolder;
	public Acco(long accnum,double balance,Perso accHolder) {
		super();
		this.accnum=accnum;
		this.balance=balance;
		this.accHolder=accHolder;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Perso getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Perso accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double aa) {
		balance=balance+aa;
		setBalance(balance);
	}
	public void withdraw(double bb) {
		balance=balance-bb;
		setBalance(balance);
	}
}
class Perso{
	private String name;
	private float age ;
	public Perso(String name,float age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
class SavingsAccoun extends Acco{

	public SavingsAccoun(long accnum, double balance, Perso accHolder) {
		super(accnum, balance, accHolder);
	}
	final int minimumbalance=500;
	double bal=getBalance();
	
	public void withdraw(double amt) {
		if(amt<bal) {
		double res=bal-amt;
		if(amt>minimumbalance) {
			setBalance(res);
		}
		
			else {
				System.out.println("IB");
			}
		}
		}
			
	}
public class AccountMain {
	public static void main(String[] args) throws AgeException {
		int aa1=100;
		int aa2=100;
		if(aa1<15 && aa2<15) {
			throw new AgeException("Age must be minimum 15");
		}
  Perso p1=new Perso("Smith",aa1);
  Perso p2=new Perso("David",aa2);
  SavingsAccoun sa=new SavingsAccoun(101,10000,p1);
  SavingsAccoun sb=new SavingsAccoun(102,20000,p2);
  sa.withdraw(1000);
  sb.deposit(100);
  System.out.println(sa.getBalance()+" "+sb.getBalance());
	}
}
