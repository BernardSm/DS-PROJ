package dgpd;

import java.util.Scanner;

public class Driver {

	
	public static void main(String[] args) {
		int opt =0;
		menu(opt);
	}
	
	public static void menu(int opt) {
		Scanner in = new Scanner(System.in);
		PlaceTree list = new PlaceTree();
		
		while(opt!=3) {

			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("||                                 Welcome To                             ||");
			System.out.println("||                              Di Good Ting Dem!!                        ||");
			System.out.println("||''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''||");
			System.out.println("||  Before Entering the system please indicate which type of user are you ||");
			System.out.println("|| (1) Admin                                                              ||");
			System.out.println("|| (2) Visitor                                                            ||");
			System.out.println("|| (3) Exit                                                               ||");
			System.out.println("||                                                                        ||");
			System.out.println("||                                                                        ||");
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			opt = in.nextInt();
			
			switch(opt) {
			case 1:
				Admin a = new Admin();
				adminMenu(in, a, list);
				break;
				
			case 2:
				//code for visitor
				break;
				
			case 3:
				in.close();
				System.out.println("Thank you for using the program ...........:");
				break;
				
			default:
				System.out.println("Invalid selection, try again\n");
				
			}
		}
		}
	
	public static void adminMenu(Scanner in, Admin a, PlaceTree list) {
		int opt1=0;
		while(opt1!=4) {
			//System.out.println("\n::Before Entering the system please indicate which type of user are you::\n");
	        System.out.println("::[1] Add a place \t\t\t::\n");
	        System.out.println("::[2] View places \t\t\t::\n");
	        System.out.println("::[3] View visitor requests \t\t\t::\n");
	        System.out.println("::[4] Exit \t\t\t\t::\n");
	        opt1 = in.nextInt();
			
			switch(opt1) {
			case 1:
				a.addPlace(in, list);
				break;
				
			case 2:
				a.viewPlace(list);
				break;
				
			case 3:
				//code
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("Invalid selection, try again\n");
			}
		}
	}

}
