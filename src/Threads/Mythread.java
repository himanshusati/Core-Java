package Threads;

public class Mythread implements Runnable {

	/**
	 * @param args
	 */
	

	@Override
	public void run() {
	
		System.out.println("inside Run method");
		throw new RuntimeException("Some problem encoutered ");
	}

	public static void main(String[] args) {
		
		
		Thread t = new Thread(new Mythread());
	
		t.start();
		
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of code");
	}
	
}
