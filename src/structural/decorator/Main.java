package structural.decorator;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal dogSatDown = new SitDownDecorator(dog);
		
		cat.voice();
		System.out.println("*");
		dog.voice();
		System.out.println("*");
		dogSatDown.voice();
	}

}
