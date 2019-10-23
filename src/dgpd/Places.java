package dgpd;

public class Places {
	private int id;
	private String name;
	private String description;
	private String address;
	private int parishCode;
	private float cost;
	private OpeningHours oh;
	private int contactNumber;
	private String imageUrl; //may need a check
	private String mainAttraction;
	
	
	
	public Places() {
		super();
		this.id = 0;
		this.name = "";
		this.description = "";
		this.address = "";
		this.parishCode = 0;
		this.cost = 0.0f;
		this.oh = new OpeningHours();
		this.contactNumber = 0;
		this.imageUrl = "";
		this.mainAttraction = "";
	}


	public Places(int id, String name, String description, String address, int parishCode, float cost, OpeningHours oh,
			int contactNumber, String imageUrl, String mainAttraction) {
		super();
		this.id = 0;
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


	public int getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(int contactNumber) {
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


	@Override
	public String toString() {
		return "Places [id=" + id + ", name=" + name + ", description=" + description + ", address=" + address
				+ ", parishCode=" + parishCode + ", cost=" + cost + ", contactNumber=" + contactNumber
				+ ", mainAttraction=" + mainAttraction + "]";
	}
	
	
	
}
