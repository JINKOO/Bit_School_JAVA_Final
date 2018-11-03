package thread;

class AThread extends Thread {
	
	public void run() {
		
		try {
			for(int i = 0; i<10; i++) {
				System.out.print(i+1 + " ");
				Thread.sleep(1000);
		    }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class BThread extends Thread {
	
	public void run() {
		try {
			for(int j = 'A'; j < 'K'; j++) {
				System.out.print((char)j + " ");
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadMain01 {
	
	public static void main(String[] args) {
		
		Thread a = new AThread();
		Thread b = new BThread();
		
		a.start();
		b.start();
	}
}
