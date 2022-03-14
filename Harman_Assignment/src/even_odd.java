import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number :");
		num=s.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even number");
		}
		else {
			System.out.println(num+" is odd number");
		}
	}

}
