class conchain
{
	int a;
	int b;
	conchain()
	{
		a=10;
		b=20;
		System.out.println("Inside parent");
	}
	conchain(int l)
	{
		a=l;
		System.out.println("Inside parent 2");
	}
	public void display(){
		System.out.println("Value1 === "+a);
		System.out.println("Value2 === "+b);
	}
	public static void main(String args[]){
		child d1 = new child();
		d1.display();
	}
}
class child extends conchain{
	int value3;
	int value4;
	child(){
		super(5);
		value3 = 3;
		value4 = 4;
		System.out.println("Inside the Constructor of Child");
	}
	public void display(){
		System.out.println("Value1 === "+a);
		System.out.println("Value2 === "+b);
		System.out.println("Value1 === "+value3);
		System.out.println("Value2 === "+value4);
	}
}


