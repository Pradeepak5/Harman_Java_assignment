import java.util.Scanner;

public class Divisible_by_8 {
	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number :");
		num=s.nextInt();
		if(num%8==0) {
			System.out.println(num+" is Divisible by 8");
		}
		else {
			System.out.println(num+" is not Divisible by 8");
		}
	}
	
}
