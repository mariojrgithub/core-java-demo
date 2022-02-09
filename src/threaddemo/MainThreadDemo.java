package threaddemo;

public class MainThreadDemo {

	public static void main(String[] args) {

		// extract info of current thread
		// main thread is created automatically 
		Thread mainThread = Thread.currentThread();
		
		// set name of the thread
		mainThread.setName("MyMainThread");
		
		System.out.println("Thread name: " + mainThread.getName());
		System.out.println("Priority: " + mainThread.getPriority());
		System.out.println("State of the thread: " + mainThread.getState());
		System.out.println("Thread group: " + mainThread.getThreadGroup());
		System.out.println("Is the thread alive? " + mainThread.isAlive());
		
		// create child thread object at Java level
		ChildThread ct1 = new ChildThread("MyChildThread1");
		
		// create second child thread
		ChildThread ct2 = new ChildThread("MyChildThread2");
		
		// create new SecondChildThread
		SecondChildThread sct1 = new SecondChildThread("MyChildThread3"); // start() is called in constructor
			
		// operating system becomes aware of the child thread / OS level
		// start() will implicitly call the run method
		ct1.start();
		ct2.start();
		
		// to start without using constructor
		sct1.myThread.start();
		
		// thread will not be created at the OS level using run()
//		ct1.run();
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(mainThread.getName() + ": " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
