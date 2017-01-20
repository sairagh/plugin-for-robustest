import java.util.Random;
class maths
{
public static void main(String args[])
{
	Random o=new Random();
int i=-7;
double d=8.6;
System.out.println(Math.abs(i)+"fllor"+Math.floor(d)+"ceil"+Math.ceil(d));
System.out.println(Math.min(i,d));
int m=5;
int n=3;
System.out.println(Math.exp(n)+"log"+Math.log(m)+"sq"+Math.pow(5.0,3.0)+"sqr"+Math.sqrt(n));
System.out.println(o.nextInt(1000));
double ang=30.0;
System.out.println(Math.sin(Math.toRadians(ang)));
System.out.println(Math.atan2(1,1));

}

}
