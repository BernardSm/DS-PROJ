package dgpd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

}
