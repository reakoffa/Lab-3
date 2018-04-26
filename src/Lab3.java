import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		// Anthony Reakoff, Lab 3 on 4/25/18
		
		String ans;
		Scanner scnr = new Scanner(System.in);
		
		
		do {
			System.out.println("Enter integer between 1 and 100:");
			int num = scnr.nextInt();
		
			if (num < 1 ) {
				System.out.println("You need to learn to follow instructions");
			} else if (num > 100) {
				System.out.println("You need to learn to follow instructions");
			} else if ((num % 2 != 0) && (num > 60)){
				System.out.println(num + " is odd and greater than 60");
			} else if (num % 2 != 0 ) {
				System.out.println("Number is odd");
			} else if ((num % 2 == 0) && (num > 1 && num < 25)){
				System.out.println("number is even and less than 25");
			} else if ((num % 2 == 0) && (num > 25 && num < 61)) {
				System.out.println("Number is even");
			} else if ((num % 2 == 0) && (num > 60)) {
				System.out.println(num + " is even" );
			}
			
			
			scnr.nextLine();
			System.out.println("Continue? y/n:");
			ans = scnr.nextLine();
			
			
		} while(ans.equalsIgnoreCase("y"));
		
		//if (ans != "y") {
			System.out.println("Goodbye!");
		//}
	}

}
