package threaddemo;

public class SecondChildThread implements Runnable {
	
	Thread myThread;
	
	public SecondChildThread(String name) {
		
		// create thread object in constructor
		myThread = new Thread(this);
		
		// set name
		myThread.setName(name);
		
		// create thread at OS level
//		myThread.start();
		
	}

	@Override
	public void run() {
		
		for(int j = 1; j <= 5; j++) {
			System.out.println(myThread.getName() + ": " + j);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
