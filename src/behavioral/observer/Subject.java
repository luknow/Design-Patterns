package behavioral.observer;

public class Subject {
	
	public void startCounting(Observer observer) {
		Thread thread = new Thread(()-> {
			for(int i=0;i<100;i++) {
				System.out.println(i);
				try {
					Thread.sleep(50);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			observer.notification();
		});
		thread.start();
	}
	
}
