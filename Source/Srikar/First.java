import java.util.Scanner;

public class First{
	public static void main (String args[]){
		Scanner user_input = new Scanner(System.in);
		int Array[]=new int[3];
		for(int i=0;i<3;i++){
		Array[i]=user_input.nextInt();
		}
		for(int i=0;i<3;i++){
			System.out.print(""+Array[i]+" ");
		}

			System.out.print("\n");
	}
}
