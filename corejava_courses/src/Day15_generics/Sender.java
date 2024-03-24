//generic class

package Day15_generics;

//sender - generic class
public class Sender<T> {
	private T message;
	
	public Sender() {
		
	}
	
	//generic constructor
	public Sender(T message)
	{
		this.message = message;
	}
	
	//generic method
	public void setMessage(T message)
	{
		this.message = message;
	}
	public void sendMessage()
	{
		System.out.println(message);
	}

}
