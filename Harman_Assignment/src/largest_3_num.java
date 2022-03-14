import java.util.Scanner;

public class largest_3_num {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Three Numbers :");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is Largest");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is Largest");
		}
		else {
			System.out.println(num3+" is Largest");
		}


	}

}
