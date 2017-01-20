class student
{
	int a;
	int b;
public void set(int c,int d)
{
this.a=c;
this.b=d;
}
public void show()
{
System.out.println("a is"+a+"b is "+b);
}
public static void main(String args[])
{
	student s1=new student();
	s1.set(1,2);
	s1.show();
	student s2=new student();
	s2=s1;
	s2.show();
	s1=null;
	s2.show();
	s2=null;
	s2.show();
}
}
