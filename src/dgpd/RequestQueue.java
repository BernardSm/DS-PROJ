package dgpd;

import java.util.Scanner;

public class RequestQueue {
	private RequestNode  front;
	private RequestNode  tail;
	
	public RequestQueue() {
		super();
		this.front = null;
		this.tail = null;
	}

	public RequestNode getHead() {
		return front;
	}

	public RequestNode getTail() {
		return tail;
	}
	
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		TreeNode temp = new TreeNode();
		if(temp == null) {
			return true;
		}else {
			temp = null;//delete temp;
			return false;
		}
	}
	
	public void enqueue(Request r) {
		if(isFull()) {
			System.out.println("Queue is full, unable to add to queue.");
		}
		else {
			RequestNode temp = new RequestNode(r);
			if(isEmpty()) {
				front = temp;
				tail = temp;
			}
			else {
				tail.setNext(temp);
				temp.setPrevious(tail);
				tail = temp;
			}
		}
	}
	
	public Request dequeue(){
		if (isEmpty()){
			System.out.println("Queue is empty, unable to dequeue\n\n");
			return null;
		}
		else{
			if(front == tail) {
				Request re = front.getData();
				tail = null;
				return re;
			}
			else {
				RequestNode temp = front.getNext();
				Request n = front.getData();
				front = temp;
				return n;
			}
		}
		
	}
	
	public void displayRequest() {
		RequestNode temp = front;
		while(temp!=null){
			System.out.println("Visitor First Name: " + temp.getData().getFname()+
			"Visitor Last Name: " + temp.getData().getLname()+
			"\nVisitor Email: " + temp.getData().getEmail()+
			"\nAttraction ID: " + temp.getData().getA_id()+
			"\nAttraction: " + temp.getData().getA_name()+
			"\nMessage: " + temp.getData().getMessage()+
			"\n\n");
			temp = temp.getNext();
		}
	}
	
	public void destroy() {
		while(!isEmpty()) {
			dequeue();
		}
	}
	
	public void ProcessRequest(RequestStack stack){
		Scanner input = new Scanner(System.in);
		int pin;
		RequestNode process = getHead();
		 if(process!=null)
			{
				System.out.println("Visitor Name: "+process.getData().getFname() 
						+"\nVisitor Email: " + process.getData().getEmail()+
						"\nAttraction ID: " + process.getData().getA_id()+
						"\nAttraction: "+process.getData().getA_name()+
						"\nMessage: " + process.getData().getMessage()+
						"\nRequestID: "+ process.getData().getA_id()+"\n\n");
				System.out.println("Enter 1 to process\n");
				pin = input.nextInt();
				if(pin == 1)
				{
					stack.Push(dequeue());				
				}
		
			}
		}

}
