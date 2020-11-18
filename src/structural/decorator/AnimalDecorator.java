package structural.decorator;

public abstract class AnimalDecorator implements Animal{
	protected Animal decoratedAnimal;
	
	public AnimalDecorator(Animal decoratedAnimal){
		this.decoratedAnimal = decoratedAnimal;
	}

	public void voice(){
		decoratedAnimal.voice();
	}
}
