package Day14_interthreadcommunication;

public class InterThreadcommunication {

	public static void main(String[] args) {
		ServiceClass obj = new ServiceClass();
		
		Producer p1 = new Producer(obj);
		Consumer c1 = new Consumer(obj);
		
		try {
			p1.join();
			c1.join();
		} catch(InterruptedException e) {
			System.out.println(e);
		}

	}

}
