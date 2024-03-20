package Day14_interthreadcommunication;

public class Consumer extends Thread {
	ServiceClass obj;
	
	public Consumer(ServiceClass obj) {
		this.obj = obj;
		start();
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch(Exception e) {
				System.out.println(e);
			}
			obj.get();
		}
	}

}
