package dgpd;

public class OpeningHours {
	private boolean Sunday;
	private boolean Monday;
	private boolean Tuesday;
	private boolean Wednesday;
	private boolean Thursday;
	private boolean Friday;
	private boolean Saturday;
	private int from;
	private int to;
	
	
	public OpeningHours() {
		super();
		Sunday = false;
		Monday = false;
		Tuesday = false;
		Wednesday = false;
		Thursday = false;
		Friday = false;
		Saturday = false;
		this.from = 0;
		this.to = 0;
	}

	public OpeningHours(boolean sunday, boolean monday, boolean tuesday, boolean wednesday, boolean thursday,
			boolean friday, boolean saturday, int from, int to) {
		super();
		Sunday = sunday;
		Monday = monday;
		Tuesday = tuesday;
		Wednesday = wednesday;
		Thursday = thursday;
		Friday = friday;
		Saturday = saturday;
		this.from = from;
		this.to = to;
	}


	public OpeningHours(int from, int to, boolean everyDay) {
		super();
		this.from = from;
		this.to = to;
		if(everyDay) { //try to put backup if everyday value is false
			this.Sunday = true;
			this.Monday = true;
			this.Tuesday = true;
			this.Wednesday = true;
			this.Thursday = true;
			this.Friday = true;
			this.Saturday = true;
		}
	}

	public boolean isSunday() {
		return Sunday;
	}

	public void setSunday(boolean sunday) {
		Sunday = sunday;
	}

	public boolean isMonday() {
		return Monday;
	}

	public void setMonday(boolean monday) {
		Monday = monday;
	}

	public boolean isTuesday() {
		return Tuesday;
	}

	public void setTuesday(boolean tuesday) {
		Tuesday = tuesday;
	}

	public boolean isWednesday() {
		return Wednesday;
	}

	public void setWednesday(boolean wednesday) {
		Wednesday = wednesday;
	}

	public boolean isThursday() {
		return Thursday;
	}

	public void setThursday(boolean thursday) {
		Thursday = thursday;
	}

	public boolean isFriday() {
		return Friday;
	}

	public void setFriday(boolean friday) {
		Friday = friday;
	}

	public boolean isSaturday() {
		return Saturday;
	}

	public void setSaturday(boolean saturday) {
		Saturday = saturday;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}


	
	
	
	
}
