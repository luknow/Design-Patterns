package structural.facade;

public class CreateSet {
 
	private Product product;
	private Beverage beverage;
	private Addition addition;
	
	CreateSet(){
		this.product = new Product();
		this.beverage = new Beverage();
		this.addition = new Addition();
	}
	
	public void createwBigMacSet() {
		product.addBigMac();
		beverage.addCocaCola();
		addition.addFries();
	}
	
	public void createBigMacFitSet() {
		product.addBigMac();
		beverage.addWater();
		addition.addSalad();
	}
	
	public void createMcWrapSet() {
		product.addMcWrap();
		beverage.addCocaCola();
		addition.addFries();
	}
}
