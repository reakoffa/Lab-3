import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter number between 1-7");
		int num = scnr.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("You entered 1");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("the number is even");
			break;
		case 7:
			System.out.println("You entered 7");
		}
		

		scnr.close();
	}

}
