package behavioral.observer;

public class Client implements Observer{

	@Override
	public void notification() {
		System.out.println("Thread has been ended");
	}

}
