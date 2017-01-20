class JavaExceptionwithfinal {
   public static void main(String args[]){
    try{
       int d = 0;
       int n =20;
       int fraction = n/d;
System.out.println("It is executing");
    }
  catch(ArithmeticException e){
    System.out.println("In the catch clock due to Exception = "+e);
  }
  finally{
  System.out.println("Inside the finally block");
  }
}
}
