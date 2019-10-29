package dgpd;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
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

	public void addPlace(Scanner in, PlaceTree list) {
		
		String name, desc, address, attraction, url, contact, str;
		int parish, from, to;
		float cost;
		Random rand = new Random();

		
		//System.out.println("Enter id of destination");
		//id = in.nextInt();
		in.nextLine(); //important don't remove
		System.out.println("Enter destination name");
		name = in.nextLine();
		System.out.println("Enter description of destination");
		desc = in.nextLine();
		System.out.println("Enter address");
		address = in.nextLine();
		System.out.println("Enter parish code");
		parish = in.nextInt();
		System.out.println("Enter cost to visit destination");
		cost = in.nextFloat();
		
		OpeningHours o = new OpeningHours();
		System.out.println("Enter 'yes' or 'no' if the destination is open on the following days: \n");
		System.out.println("Sunday ");
		str = in.next();
		o.setSunday(str.equals("yes"));
		
		System.out.println("Monday ");
		str = in.next();
		o.setMonday(str.equals("yes"));
		
		System.out.println("Tuesday ");
		str = in.next();
		o.setTuesday(str.equals("yes"));
		
		System.out.println("Wednesday ");
		str = in.next();
		o.setWednesday(str.equals("yes"));
		
		System.out.println("Thursday ");
		str = in.next();
		o.setThursday(str.equals("yes"));
		
		System.out.println("Friday ");
		str = in.next();
		o.setFriday(str.equals("yes"));
		
		System.out.println("Saturday ");
		str = in.next();
		o.setSaturday(str.equals("yes"));
		
		System.out.println("Enter opening time");
		from = in.nextInt();
		o.setFrom(from);
		
		System.out.println("Enter closing time");
		to = in.nextInt();
		o.setTo(to);
		
		System.out.println("Enter destination contact number");
		contact = in.next();
		System.out.println("Enter image url");
		url = in.next();
		in.nextLine(); //important don't remove
		System.out.println("Enter main attraction");
		attraction = in.nextLine();
		
		
		Places p = new Places(rand.nextInt(10000)+1, name, desc, address, parish, cost, o, contact, url, attraction);
		list.insert(p);
		
		
		try {
	        
			FileWriter file = new FileWriter("places.text", true);
			String record = p.getId() + "\t" + p.getName() + "\t" + p.getDescription() + "\t" + p.getAddress() + "\t" + 
			p.getParishCode() + "\t" + p.getCost() + "\t" + p.getOh().isSunday() + "\t" + p.getOh().isMonday() + "\t" + 
			p.getOh().isTuesday() + "\t" + p.getOh().isWednesday() + "\t" + p.getOh().isThursday() + "\t" + 
			p.getOh().isFriday() + "\t" + p.getOh().isSaturday() + "\t" + p.getOh().getFrom() + "\t" + 
			p.getOh().getTo() + "\t" + p.getContactNumber() + "\t" + p.getImageUrl() + "\t" + p.getMainAttraction();
			
			file.write(record + "\r\n");
			file.close();
		}
		catch(IOException e) {
			e.getMessage();
		}
		
	}
	

	public void viewPlace(PlaceTree list) {
		list.preOrder(list.getRoot());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		try {
//			Scanner in = new Scanner(new File("places.txt", "rw"));
//			Places p = new Places();
//			//OpeningHours oh = new OpeningHours();
//			
//			while(in.hasNext()) {
//				p.setId(in.nextInt());
//				p.setName(in.next());
//				p.setDescription(in.nextLine());
//				p.setAddress(in.nextLine());
//				p.setParishCode(in.nextInt());
//				p.setCost(in.nextFloat());
//				p.getOh().setSunday(in.nextBoolean());
//				p.getOh().setMonday(in.nextBoolean());
//				p.getOh().setTuesday(in.nextBoolean());
//				p.getOh().setWednesday(in.nextBoolean());
//				p.getOh().setThursday(in.nextBoolean());
//				p.getOh().setFriday(in.nextBoolean());
//				p.getOh().setSaturday(in.nextBoolean());
//				p.getOh().setTo(in.nextInt());
//				p.getOh().setFrom(in.nextInt());
//				p.setContactNumber(in.next());
//				p.setImageUrl(in.next());
//				p.setMainAttraction(in.nextLine());
//				p.toString();
//			}
//			in.close();
//			
//		}
//		catch(IOException e) {
//			e.getStackTrace();
//		}
	}
}
