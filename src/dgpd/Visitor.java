package dgpd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Visitor {

	
	public void Creaole_Phases() {
		System.out.println("Creale Phrase \t Translation");
		System.out.println("Mi Soon Come-\t I am coming soon");
		System.out.println("Weh yuh ah seh-\t  What are you saying");
		System.out.println("Inna di morrows-\t I will see you later");
		System.out.println("Wah Gwaan-\t What is up with you");
		System.out.println("yu good-\t Are you okay?");
		System.out.println("");
		
	}
	public void SearchTree() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("places.text"));
		String line;
		while((line = in.readLine()) != null)
		{
		    System.out.println(line);
		}
		in.close();
	}
	
	public void request(RequestQueue q) {
		String Fname = null;
		String Lname = null;
		String Email = null;
		String A_id = null;
		String A_name = null;
		String message=null;
		Date date = new Date();
		
		try{
			
			int num = 0;
			Scanner scanner=new Scanner(System.in);
			//File DATAFILE =new File("places.FILE");//create a file object//
		
			
			System.out.println("Enter your first name");
			Fname= scanner.next(); 
			
			
			System.out.println("Enter your Last name");
			Lname= scanner.next();
			
			System.out.println("Enter your Email");
			Email= scanner.next(); 
			
			
			System.out.println("Enter your Attraction ID");
			A_id= scanner.next(); 
			
			
			System.out.println("Enter your Attraction name");
			A_name= scanner.next(); 
			
			
			System.out.println("Please write a message that you would like to leave with the extablishment");
			message = scanner.nextLine();
			
			try {
			    
				FileWriter file = new FileWriter("request.txt", true);
				
				String record = Fname + "\n" + Lname + "\n" + Email + "\n" + A_id + "\n" + 
				A_name + "\n" + message+ "\n" +  date.toString() + "\n";
				
				file.write(record);
				file.close();
			}
			catch(IOException e) {
				e.getMessage();
			}

			
			Request r = new Request(Fname, Lname, Email, A_id, A_name, message, date);
			q.enqueue(r);
			//writing the variable to the file
//			Date date = new Date();
			
			// display time and date using toString()
		    date.toString();//write the auto generated date to the file
		    System.out.println("2\n");
			
		    System.out.println("Are you finished");
			System.out.println("1 for Yes");
			System.out.println("2 for No");
			int choice=scanner.nextInt();
				 
			switch(choice) {
				case 1:
					System.out.println("Thank you for using the program ...........:");		
					break;
				
				case 2:
					 request(q);	
					 break;
				 
				default:
					System.out.println("Invalid selection, try again\n");

			}
			
		}catch(Exception x) {
			System.out.println("FILE Acesserror. could not save");
		}
	}
	

}
