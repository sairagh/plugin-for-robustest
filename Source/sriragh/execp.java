class execp
{
	public static void main(String args[])
	{
		int m=20;
		int i=0;
		try
		{
			int g[]=new int[2];
			int j=m/i;
			g[3]=5;
			System.out.println("This line will not be execute");
		}
		catch(Exception e){
			System.out.println("In the catch clock due to Exception = "+e);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Into catch becaause of"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception"+e);
		}*/

		finally
		{
			System.out.println("Finalaly");
		}
	}


}
