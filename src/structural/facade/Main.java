package structural.facade;

public class Main {

	public static void main(String[] args) {
		CreateSet createSet = new CreateSet();
		System.out.println("Set #1");
		createSet.createwBigMacSet();
		System.out.println("");
		System.out.println("Set #2");
		createSet.createBigMacFitSet();
		System.out.println("");
		System.out.println("Set #3");
		createSet.createMcWrapSet();
	}

}
