import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Year :");
		year=s.nextInt();
		if(year%400==0) {
			System.out.println(year+" is Leap year");
		}
		else if(year%100==0) {
			System.out.println(year+" is not Leap year");
		}
		else if(year%4==0) {
			System.out.println(year+" is Leap year");
		}
		else {
			System.out.println(year+" is not Leap year");
		}
	}

}
