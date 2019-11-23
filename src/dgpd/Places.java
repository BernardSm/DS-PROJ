package dgpd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Places {
	private int id;
	private String name;
	private String description;
	private String address;
	private int parishCode;
	private float cost;
	private OpeningHours oh;
	private String contactNumber;
	private String imageUrl; // may need a check
	private String mainAttraction;

	//default constructor
	public Places() {
		super();
		this.id = 0;
		this.name = "";
		this.description = "";
		this.address = "";
		this.parishCode = 0;
		this.cost = 0.0f;
		this.oh = new OpeningHours();
		this.contactNumber = "";
		this.imageUrl = "";
		this.mainAttraction = "";
	}

	//Primary Constructor 
	public Places(int id, String name, String description, String address, int parishCode, float cost, OpeningHours oh,
			String contactNumber, String imageUrl, String mainAttraction) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.address = address;
		this.parishCode = parishCode;
		this.cost = cost;
		this.oh = oh;
		this.contactNumber = contactNumber;
		this.imageUrl = imageUrl;
		this.mainAttraction = mainAttraction;
	}

	//Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getParishCode() {
		return parishCode;
	}

	public void setParishCode(int parishCode) {
		this.parishCode = parishCode;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public OpeningHours getOh() {
		return oh;
	}

	public void setOh(OpeningHours oh) {
		this.oh = oh;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMainAttraction() {
		return mainAttraction;
	}

	public void setMainAttraction(String mainAttraction) {
		this.mainAttraction = mainAttraction;
	}

	//To String Method
	@Override
	public String toString() {
		return "Places [id=" + id + ", name=" + name + ", description=" + description + ", address=" + address
				+ ", parishCode=" + parishCode + ", cost=" + cost + ", contactNumber=" + contactNumber
				+ ", mainAttraction=" + mainAttraction + "]";
	};

	//Displays the values of the attributes 
	public void display() {
		System.out.println(toString());
	}

	
	//Function to get user response, search and displays the attraction in selected parish
	String Parish;
	@SuppressWarnings("resource")
	public void Parish() {
		int id = 0;
		String name = "";
		String description = "";
		String address = "";
		int parishCode = 0;
		float cost = 0;
		OpeningHours oh = new OpeningHours(); 
		String contactNumber = "";
		String imageUrl = ""; 
		String mainAttraction = "";
		boolean sunday, monday, tuesday, wednesday, thursday, friday, saturday;
		int to, from;
		
		Scanner Response= new Scanner(System.in);
		System.out.println("Please enter Gimmi all a di place dem inna [Parish name]");
		String response = Response.nextLine(); 
		String testString = "Gimmi all a di place dem inna ";
		int testStringLength = testString.length();
		
		String lastword = response.substring(testStringLength);
		//String[] parts = response.split("");
		//String lastword =parts[parts.length - testStringlength];
		
		System.out.println(lastword);
		boolean itemFound = false;
		
		
		  if(lastword.contains("Kingston & St. Andrew") ||
		  lastword.contains("Kingston") || lastword.contains("St. Andrew" )) {
		  parishCode=1; }
		  
		  if(lastword.contains("St. Thomas")) { parishCode=2;
		 
		  } if(lastword.contains("Portland")) { parishCode=3;
		  
		  } if(lastword.contains("St. Mary")) { parishCode=4;
		  
		  } if(lastword.contains("St. Catherine")) { parishCode=5;
		  
		  } if(lastword.contains("Clarendon")) { parishCode=6;
		  
		  } if(lastword.contains("Manchester")) { parishCode=7 ;
		  
		  } if(lastword.contains("St. Ann")) { parishCode=8;
		  
		  } if( lastword.contains("St. Elizabeth")) { parishCode=9; }
		  
		  if(lastword.contains("St. James")) { parishCode=10;
		  
		  } if(lastword.contains("Hanover")) { parishCode=11;
		  
		  } if(lastword.contains("Westmoreland")) { parishCode=12;
		  
		  } if(lastword.contains("Trelawny")) { parishCode=13; }
		 
		
		try {
			Scanner filereader = new Scanner(new File("places.txt"));//make sure the info is stored in one line for each record
			
			while (filereader.hasNext()) {
				id = filereader.nextInt();
				filereader.nextLine();
				name = filereader.nextLine();
				description = filereader.nextLine();
				address = filereader.nextLine();
				parishCode= filereader.nextInt();
				filereader.nextLine();
				cost = filereader.nextFloat();
				
				sunday = filereader.nextBoolean(); 
				monday = filereader.nextBoolean(); 
				tuesday = filereader.nextBoolean();
				wednesday = filereader.nextBoolean(); 
				thursday = filereader.nextBoolean(); 
				friday = filereader.nextBoolean();
				saturday = filereader.nextBoolean();
				to = filereader.nextInt();
				from = filereader.nextInt();
				contactNumber= filereader.next();
				imageUrl = filereader.next();
				mainAttraction= filereader.next();
				filereader.next();
			
				
				
				if (address.contains(lastword)) {
					itemFound = true;
					break;
				}
			}
			if(itemFound == false) {
				System.out.println("Place was not found");
			}else {
				System.out.println("Attraction Id: " + id);
				System.out.println("Attraction Name: " + name);
				System.out.println("Description: " + description);
				System.out.println("Address: " + address);
				System.out.println("parishCode: " + parishCode);
				System.out.println("Cost: " + cost);
				System.out.println("Contact Number: " + contactNumber);
				System.out.println("Image URL: " + imageUrl);
				System.out.println("Main Attraction: " + mainAttraction);
			
			}filereader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, File was not found");
		}
		
	}
	
	public void viewCheapest() {
		
		Scanner Response= new Scanner(System.in);
		System.out.println("Please enter “Which part have di cheapest [Attraction  name]");
		String response = Response.nextLine(); 
		String testString = " Which part have di cheapest ";
		int testStringLength = testString.length()-1;
		String lastword = response.substring(testStringLength);
		String[] parts = response.split("");
		boolean found = false;
		boolean sunday, monday, tuesday, wednesday, thursday, friday, saturday;
		int to, from, id=0, parishcode=0;
		float cost=0;
		String name="", description="", address="", contactnumber="", imageurl="", mainattraction="";
		
		try {
			Scanner filereader = new Scanner(new File("places.txt"));//make sure the info is stored in one line for each record
			
			Places p = new Places();
			OpeningHours oh = new OpeningHours();;
			float lowest = 0;
			while (filereader.hasNext()) {
				id = filereader.nextInt();
				filereader.nextLine();
				name = filereader.nextLine();
				description = filereader.nextLine();
				address = filereader.nextLine();
				parishcode= filereader.nextInt();
				filereader.nextLine();
				cost = filereader.nextFloat();
				
				sunday = filereader.nextBoolean(); 
				monday = filereader.nextBoolean(); 
				tuesday = filereader.nextBoolean();
				wednesday = filereader.nextBoolean(); 
				thursday = filereader.nextBoolean(); 
				friday = filereader.nextBoolean();
				saturday = filereader.nextBoolean();
				to = filereader.nextInt();
				from = filereader.nextInt();
				contactnumber= filereader.next();
				imageurl = filereader.next();
				filereader.nextLine();
				mainattraction= filereader.nextLine();
				filereader.nextLine();
			
				//This if may need to be modified or removed
				if (mainattraction.contains(lastword)) {
					found = true;
					
					if(lowest == 0) {
						lowest = cost;
						p.setId(id);
						p.setName(name);
						p.setDescription(description);
						p.setAddress(address);
						p.setParishCode(parishcode);
						p.setCost(cost);
						oh.setSunday(sunday);
						oh.setMonday(monday);
						oh.setTuesday(tuesday);
						oh.setWednesday(wednesday);
						oh.setThursday(thursday);
						oh.setFriday(friday);
						oh.setTo(to);
						oh.setFrom(from);
						p.setOh(oh);
						p.setContactNumber(contactnumber);
						p.setImageUrl(imageurl);
						p.setMainAttraction(mainattraction);
					}
					else {
						if(cost < lowest) {
							lowest = cost;
							p.setId(id);
							p.setName(name);
							p.setDescription(description);
							p.setAddress(address);
							p.setParishCode(parishcode);
							p.setCost(cost);
							oh.setSunday(sunday);
							oh.setMonday(monday);
							oh.setTuesday(tuesday);
							oh.setWednesday(wednesday);
							oh.setThursday(thursday);
							oh.setFriday(friday);
							oh.setTo(to);
							oh.setFrom(from);
							p.setOh(oh);
							p.setContactNumber(contactnumber);
							p.setImageUrl(imageurl);
							p.setMainAttraction(mainattraction);
						}
					}
				}
				
				
				
			}
			if(found == false) {
				System.out.println("No place has this particular attraction. Please try searching for a different attraction name");
			}else {
				System.out.println("Attraction Id: " + p.getId());
				System.out.println("Attraction Name: " + p.getName());
				System.out.println("Description: " + p.getDescription());
				System.out.println("Address: " + p.getAddress());
				System.out.println("parishCode: " + p.getParishCode());
				System.out.println("Cost: " + p.getCost());
				System.out.println("Contact Number: " + p.getContactNumber());
				System.out.println("Image URL: " + p.getImageUrl());
				System.out.println("Main Attraction: " + p.getMainAttraction());
			
			}filereader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, File was not found");
		}
	}
}
		
	