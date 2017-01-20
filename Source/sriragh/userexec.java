class userexec
{
public static void main(String args[])
{
try
{
throw new myexec(2);
}
catch(Exception e)
{
System.out.println(e);
}
}

}
class myexec extends Exception
{
	int b;
myexec(int a)
{
b=a;
}
public String toString()
{
return ("Exception number"+b);
}
}
