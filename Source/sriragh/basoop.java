class account
{
	private int acc_balance;
	private int acc_number;
	public void showdata()
	{
	
		System.out.println("acc no"+acc_number+"accbal"+acc_balance);
	}
	public void set(int m,int l)
	{
		acc_balance=l;
		acc_number=m;
	
	}
	public void deposit(int t)
	{
		if(t<0)
		{
		System.out.println("Error");
		}
		else
		{
		acc_balance=acc_balance-t;
		}
	
	}


}
class basoop
{
public static void main(String args[])
{
	account a=new account();
	a.set(1,1000);
	a.deposit(100);
	a.showdata();



}
}
