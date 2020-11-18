package structural.decorator;

public class SitDownDecorator extends AnimalDecorator {

	public SitDownDecorator(Animal decoratedAnimal) {
		super(decoratedAnimal);
	}
	
	@Override
	public void voice() {
	      decoratedAnimal.voice();	       
	      sitDown();
	}

	private void sitDown(){
	      System.out.println("Sat down");
	}
}
