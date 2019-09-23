package dgpd;

public class Places {
	private int id;
	private String name;
	private String description;
	private String address;
	private int parishCode;
	private float cost;
	//private String openingHours; //check this later
	private int contactNumber;
	// Add photo attribute here
	private String mainAttraction;
	
	
	
	public Places() {
		super();
		this.id = 0;
		this.name = "";
		this.description = "";
		this.address = "";
		this.parishCode = 0;
		this.cost = 0.0f;
		this.contactNumber = 0;
		this.mainAttraction = "";
	}



	public Places(int id, String name, String description, String address, int parishCode, float cost,
			int contactNumber, String mainAttraction) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.address = address;
		this.parishCode = parishCode;
		this.cost = cost;
		this.contactNumber = contactNumber;
		this.mainAttraction = mainAttraction;
	}



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



	public int getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getMainAttraction() {
		return mainAttraction;
	}



	public void setMainAttraction(String mainAttraction) {
		this.mainAttraction = mainAttraction;
	}
	
	
}
