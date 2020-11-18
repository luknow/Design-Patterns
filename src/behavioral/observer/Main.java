package behavioral.observer;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		Subject subject = new Subject();
		subject.startCounting(client);
	}

}
