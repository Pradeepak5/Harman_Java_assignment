import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		int num,reverse=0,rem,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number :");
		num=s.nextInt();
		while( i<num) {
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		System.out.println("Reversed number is "+reverse);	

	}

}
