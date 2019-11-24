package dgpd;

public class RequestStack {


	private RequestNode Top;
	
	public RequestStack()
	{
		Top = null;
	}

	public RequestNode getTop() {
		return Top;
	}

	public void setTop(RequestNode top) {
		Top = top;
	}
	
	@SuppressWarnings("unused")
	public void Push(Request request)
	{
		RequestNode temp = new RequestNode(request);
		if (temp!=null)
		{
			if(Top == null)
			{
				Top = temp;
			}
			else
			{
				temp.setNext(Top);
				Top = temp;
			}
		}
		else
		{
			System.out.println("Stack full, unable to add to stack.\n\n");
		}
	}
	
	public Request Pop()
	{
		Request request = new Request();
		if(Top!=null)
		{
			request = Top.getData();
			RequestNode temp = Top;
			Top = Top.getNext();
			temp = null;
		}
		else
		{
			System.out.println("Stack is empty, unable to pop");
		}
		return request;
	}
	
	
	public void ViewStack()
	{
		RequestNode temp = Top;
		while (temp!=null)
		{
			System.out.println("Visitor Name: "+temp.getData().getFname() 
					+"\nVisitor Email: " + temp.getData().getEmail()+
					"\nAttraction ID: " + temp.getData().getA_id()+
					"\nAttraction: "+temp.getData().getA_name()+
					"\nMessage: " + temp.getData().getMessage()+
					"\nRequestID: "+ temp.getData().getA_id()+"\n\n");
			temp = temp.getNext();
		}
	}
}
	


