import java.util.*;
public class smallest_of_2 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		num1=s.nextInt();
		num2=s.nextInt();
		
		if(num1<num2) {
			System.out.println(num1+" is Smallest");
		}
		else {
			System.out.println(num2+" is Smallest");
		}

	}

}
