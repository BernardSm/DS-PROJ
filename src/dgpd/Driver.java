package dgpd;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void menu() {
		
		int opt =0;
		Scanner in = new Scanner(System.in);

		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||                                 Welcome To                             ||");
		System.out.println("||                              Di Good Ting Dem!!                        ||");
		System.out.println("||''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''||");
		System.out.println("||  Before Entering the system please indicate which type of user are you ||");
		System.out.println("|| (1) Admin");
		System.out.println("|| (2) Visitor");
		System.out.println("|| (3)");
		System.out.println("|| (4)");
		System.out.println("||");
		System.out.println("||");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
		opt = in.nextInt();
		in.close();
		
		switch(opt) {
		case 1:
			//code
			break;
			
		case 2:
			//code
			break;
			
		case 3:
			//code
			break;
			
		default:
			System.out.println("Invalid selection, try again\n");
			
		}
	}

}
