package dgpd;

public class RequestNode {
	private Request data;
	private RequestNode next;
	private RequestNode  previous;
	
	public RequestNode() {
		super();
		this.data = null;
		this.next = null;
		this.previous = null;
	}
	
	public RequestNode(Request data) {
		super();
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	public Request getData() {
		return data;
	}

	public void setData(Request data) {
		this.data = data;
	}

	public RequestNode getNext() {
		return next;
	}

	public void setNext(RequestNode next) {
		this.next = next;
	}

	public RequestNode getPrevious() {
		return previous;
	}

	public void setPrevious(RequestNode previous) {
		this.previous = previous;
	}
	
	
}
