package dgpd;

public class PlacesLinkedList{
	
	private PlacesNode head;
	   
	   public PlacesLinkedList() {
		   head = null;
	   }
	   
	   public boolean isEmpty() {
		   if(head == null) {
			   return true;
		   }else {
			   return false;
		   }
	   }
	   
	   /**
	    * Checks if there is any additional memory
	    * */
	   @SuppressWarnings("unused")
	public boolean isFull() {
		   //attempt to allocate memory for a new node
		   PlacesNode temp = new PlacesNode();
		   //if memory is successfully allocated the address
		   // of the Node object will be stored in the 
		   //variable temp
		   if(temp == null) {
			 //if temp is null, no address, no memory allocated
			   return true; 
		   }else {
			   //successfully allocated memory
			   //release resources
			   temp = null; //CPP : delete temp;
			   return false;
		   }
	   }
	   
	   
	   public boolean addToBack(Places attraction) {
		   if(isFull()) {
			   System.out.println("List is full, unable to add to back");
			   return false;
		   }else {
			   PlacesNode nextItem = new PlacesNode();
			   nextItem.setAttraction(attraction);
			   if(isEmpty()) {
				   head = nextItem;
			   }else {
				   PlacesNode current = head;
				   while(current.getNext()!=null) {
					   current = current.getNext();
				   }
				   current.setNext(nextItem);
			   }
			   return true;
		   }
		  
	   } //--addToBack ends
	   
	   public Places deleteFromFront() {
		   //if it is not empty, there is an item
		   // to delete
		   if(!isEmpty()) {
			   Places data = head.getAttraction();
			   @SuppressWarnings("unused")
			PlacesNode itemToDelete = head;
			   head = head.getNext();
			   itemToDelete = null;//CPP: delete itemToDelete;

			   return data;
		   }
		   return null;
	   }//end deleteFromFront
	   
	   public void display() {
		   if(isEmpty()) {
			   System.out.println("List is empty, nothing to display");
		   }else {
			   PlacesNode current = head;
			   while(current != null) {
				   current.getAttraction().display();
				   current = current.getNext();
			   }
		   }	   
	   }
	}
	

