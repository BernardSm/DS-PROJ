package dgpd;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int opt = 0;
		PlacesLinkedList list = null;
		Visitor visitor= null;
		menu(opt,visitor, list);
		
	}
	//Display User interface
	public static void menu(int opt, Visitor visitor, PlacesLinkedList placesList) {
		Scanner in = new Scanner(System.in);
		PlaceTree list = new PlaceTree();
		RequestQueue q = new RequestQueue();
	
		

		while (opt != 3) {

			System.out.println(" ==========================================================================");
			System.out.println("|                        ***** WELCUM TUH *****                            |");
			System.out.println("|                       DI GOOD PLACE DEM KIOSKS                           |");
			System.out.println("|''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''  |");
			System.out.println("|  Before Entering the system please indicate what type of user you are    |");
			System.out.println("|                                                                          |");
			System.out.println("| (1) Administrator / Administrata                                         |");
			System.out.println("| (2) Visitor / Visita                                                     |");
			System.out.println("| (3) Exit / Guope                                                         |");
  			System.out.println("|                                                                          |");
			System.out.println("|                                                                          |");
			System.out.println(" ==========================================================================\n");
			
			System.out.println("Enter response Here: \n"); 
			opt = in.nextInt();
			System.out.println("============================================================================\n\n");
			
			switch (opt) {
			
			case 1:
				Admin a = new Admin();
				adminMenu(in, a, list, q);
				break;
	
			case 2:
				Visitor v = new Visitor();
				Places p = new Places();
				visitorMenu(in, v, p, q);
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

	
	

	public static void adminMenu(Scanner in, Admin a, PlaceTree list, RequestQueue q) {
		RequestStack Plog = new RequestStack();
		int opt1 = 0;
		while (opt1 != 6) {
			
			System.out.println("[1] Add a place \n");
			System.out.println("[2] View places \n");
			System.out.println("[3] View visitor requests \n");
			System.out.println("[4] Process Requests \n");
			System.out.println("[5] View Process Log \n");
			System.out.println("[6] Exit \n");
			System.out.println("Enter response Here: \n"); 
			opt1 = in.nextInt();
			System.out.println("============================================================================\n\n");
			
			

			switch (opt1) {
			case 1:
				a.addPlace(in, list);
				break;

			case 2:
				a.viewPlace(list);
				break;

			case 3:
				q.displayRequest();
				break;

			case 4:
				q.ProcessRequest(Plog);
				break;
			case 5:
				Plog.ViewStack();
				break;
			case 6:
				
				break;

			default:
				System.out.println("Invalid selection, try again\n");
			}
		}
	}
	
	
	
	

	public static void visitorMenu(Scanner in, Visitor v, Places p, RequestQueue q) {
		int opt2 = 0;
		while (opt2 != 5) {
			
			System.out.println("[1] View Creole Phrases \n");
			System.out.println("[2] View Attractions in Parishes \n");
			System.out.println("[3] Find Cheapest attraction\n");
			System.out.println("[4] Request additional details on Attractions \n");
			System.out.println("[5] Exit \n");
			System.out.println("Enter response Here: \n"); 
			opt2 = in.nextInt();
			System.out.println("============================================================================\n\n");
			

			switch (opt2) {
			case 1:
				v.Creaole_Phases();
				break;

			case 2:
				p.Parish();
				break;

			case 3:
				p.viewCheapest();
				break;

			case 4:
				v.request(q);
				break;

			case 5:
				break;

			default:
				System.out.println("Invalid selection, try again\n");

			}
		}
	}
	
}
