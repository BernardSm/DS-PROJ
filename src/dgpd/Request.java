package dgpd;

import java.util.Date;

public class Request {
	String Fname; 
	String Lname ;
	String Email;
	String A_id ;
	String A_name; 
	String message;
	Date date;
	
	public Request() {
		super();
		Fname = "";
		Lname = "";
		Email = "";
		A_id = "";
		A_name = "";
		this.message = "";
		this.date = new Date();
	}
	
	public Request(String fname, String lname, String email, String a_id, String a_name, String message, Date date) {
		super();
		Fname = fname;
		Lname = lname;
		Email = email;
		A_id = a_id;
		A_name = a_name;
		this.message = message;
		this.date = date;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getA_id() {
		return A_id;
	}

	public void setA_id(String a_id) {
		A_id = a_id;
	}

	public String getA_name() {
		return A_name;
	}

	public void setA_name(String a_name) {
		A_name = a_name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Request [Fname=" + Fname + ", Lname=" + Lname + ", Email=" + Email + ", A_id=" + A_id + ", A_name="
				+ A_name + ", message=" + message + ", date=" + date + "]";
	}
	
	public void display() {
		toString();
	}
}
