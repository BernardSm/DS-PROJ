package dgpd;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Admin {
	private String name;
	private String password;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin() {
		super();
		this.name = "";
		this.password = "";
	}

	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", password=" + password + "]";
	}

	public void addPlace() {
		
//		String name="", desc="", address="", attraction, url;
//		int parish, id;
//		int contact;
//		int from;
//		int to;
//		float cost;
//		boolean open;
//		Scanner in = new Scanner(System.in).useDelimiter("\n");
//		
//		System.out.println("Enter id of destination");
//		id=in.nextInt();
//		System.out.println("Enter destination name");
//		name = in.next();
//		System.out.println("Enter description of destination");
//		desc = in.next();
//		System.out.println("Enter address");
//		address = in.next();
//		System.out.println("Enter parish code");
//		parish = in.nextInt();
//		System.out.println("Enter cost to visit destination");
//		cost = in.nextFloat();
//		
//		// enter opening hours
//		OpeningHours o = new OpeningHours();
//		System.out.println("Enter 'yes' or 'no' if the destination is open on the following days: \n");
//		System.out.println("Sunday ");
//		open = in.next()=="yes";
//		o.setSunday(open);
//		
//		System.out.println("Monday ");
//		open = in.next()=="yes";
//		o.setMonday(open);
//		
//		System.out.println("Tuesday ");
//		open = in.next()=="yes";
//		o.setTuesday(open);
//		
//		System.out.println("Wednesday ");
//		open = in.next()=="yes";
//		o.setWednesday(open);
//		
//		System.out.println("Thursday ");
//		open = in.next()=="yes";
//		o.setThursday(open);
//		
//		System.out.println("Friday ");
//		open = in.next()=="yes";
//		o.setFriday(open);
//		
//		System.out.println("Saturday ");
//		open = in.next()=="yes";
//		o.setSaturday(open);
//		
//		System.out.println("Enter opening time");
//		from = in.nextInt();
//		o.setFrom(from);
//		
//		System.out.println("Enter closing time");
//		to = in.nextInt();
//		o.setTo(to);
//		
//		System.out.println("Enter destination contact number");
//		contact = in.nextInt();
//		System.out.println("Enter image url");
//		url = in.next();
//		System.out.println("Enter main attraction");
//		attraction = in.next();
//		
//		in.close();
//		
//		Places place = new Places(id, name, desc, address, parish, cost, o, contact, url, attraction);
//		
//		
//		try {
//			FileWriter file = new FileWriter("places.text", true);
//			file.write(place + "\r\n");
//			file.close();
//		}
//		catch(IOException e) {
//			e.getMessage();
//		}
		
	}
}
