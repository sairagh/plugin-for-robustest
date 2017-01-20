public class inherit
{

	public static void main(String args[])

	{
		x ab=new x();
		ab.m1();
		y a=new y();
		a.m2();
		a.m1();

	}


}
class x
{
int b;
public void m1()
{
System.out.println("Aceesing parent ");
}
}
class y extends x
{
public void m1()
{
System.out.println("Acessing child");
}
public void m2()
{
System.out.println("calling functon 2");

}
}

