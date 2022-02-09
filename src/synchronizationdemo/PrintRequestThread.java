package synchronizationdemo;

public class PrintRequestThread implements Runnable {

	Printer printer;
	Thread myThread;
	String msg;
	
	public PrintRequestThread(Printer printer, String msg) {
		this.printer = printer;
		this.msg = msg;
		myThread = new Thread(this);
	}

	@Override
	public void run() {
	
		// explore the synchronized block
		
		
		printer.print(msg);
		
	}
	
}
