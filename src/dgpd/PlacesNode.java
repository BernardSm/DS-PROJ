package dgpd;


public class PlacesNode {
	private Places attraction;
	private PlacesNode next;
	
	public PlacesNode() {
		this.attraction = new Places();
		this.next = null;
	}

	public PlacesNode(Places attraction, PlacesNode next) {
		super();
		this.attraction = attraction;
		this.next = next;
	}

	public Places getAttraction() {
		return attraction;
	}

	public void setAttraction(Places attraction) {
		this.attraction = attraction;
	}

	public PlacesNode getNext() {
		return next;
	}

	public void setNext(PlacesNode next) {
		this.next = next;
	}
	

	}


