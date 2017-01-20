public class Account{
    private int balance;
    private int number;
    public Account()
    {
	balance=0;
	number=100;
    }
    /*public Account(int r,int q)
      {
      balance=r;
      number=q;
      }*/
    public void showData()
    {
	//return balance;
	System.out.println("Balance in this account is "+balance);
    }
    public void deposit(int a)
    {
	if(a<0)
	    System.out.println("Invalid amount deposited");
	else
	    balance=balance+a;
    }
    public void withdraw(int a)
    {
	if(a>balance)
	    System.out.println("Invalid amount asking!!");
	else
	    balance=balance-a;
    }
}
class Savings extends Account
{
    private int balance;
    public Savings()
    {
	balance=0;
    }
}
class Customer{
    public static void main(String []args)
    {
	Account ar=new Account();
	ar.showData();
	//System.out.println(ar.balance);
	ar.deposit(100);
	ar.showData();
	//System.out.println(ar.showData());
	ar.deposit(200);
	ar.withdraw(150);
	//System.out.println(ar.showData());
	ar.showData();
	Savings er=new Savings();
	er.deposit(1000);
	er.showData();
	ar.showData();
    }
}
