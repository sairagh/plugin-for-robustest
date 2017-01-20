class ArrayDemo {
    public static void passByReference(String a[]){
	a[0] = "Changed";
    }

    public static void main(String args[]){
	int a[]=new int [2];
	int []c={11,12,13,14,15};
	a[0]=12;a[1]=223;
	System.out.println(a[0]+" "+a[1]+" "+c[4]);
//	System.out.println(a[0]+" "+a[1]+" "+c[5]);
	String []b={"Apple","Mango","Orange"};
	System.out.println("Before Function Call    "+b[0]);
	ArrayDemo.passByReference(b);
	System.out.println("After Function Call    "+b[0]);
    }
}
