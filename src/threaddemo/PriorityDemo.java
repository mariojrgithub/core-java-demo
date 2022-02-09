package threaddemo;

public class PriorityDemo {

	public static void main(String[] args) {
		
		// thread with higher priority is given more preference to use the processor
		// default priority is 5
		// default priority of child thread - same priority of the parent thread at time of spawning
		

		// create 2 thread objects that have different priorities
		HigherPriorityThread hpt = new HigherPriorityThread();
		LowerPriorityThread lpt = new LowerPriorityThread();
		
		// set priority
		hpt.myThread.setPriority(Thread.MAX_PRIORITY);
		lpt.myThread.setPriority(Thread.MIN_PRIORITY);
		
		// run
		hpt.myThread.start();
		lpt.myThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// stop the threads
		hpt.myThread.stop();
		lpt.myThread.stop();
		
		System.out.println("counter of HigherPriorityThread: " + hpt.counter);
		System.out.println("counter of the LowerPriorityThread: " + lpt.counter);
		
	}

}
