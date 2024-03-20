package Day14_interthreadcommunication;

public class Producer extends Thread {
	ServiceClass obj;
	
	public Producer(ServiceClass obj) {
		this.obj = obj;
		start();
	}
	
	public void run() {
		int i =0;
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			obj.put(i);
			i++;
		}
	}

}
