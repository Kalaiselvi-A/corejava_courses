// driver program for creating generic class - sender

package Day15_generics;

public class SenderDemo {

	public static void main(String[] args) {
		Sender<String> strSend = new Sender<String>("Hello, Welcome to TNS");
		
		Sender<Person> perSend = new Sender<Person>();
		perSend.setMessage(new Person("Ashwin", "Delhi"));
		
		strSend.sendMessage();
		perSend.sendMessage();

	}

}
