package Bullpen;

public abstract class Reliever {
	protected String name;
	boolean power;
	double length;
	
	public void Info() {
		System.out.println("Type: " + name);
		System.out.println("Will be pitching for " + length + " innings");
	}
	
	public void Warmup() {
		System.out.println("The pitcher is warming up");
	}
	
	public void CallIn() {
		System.out.println("Call in the reliever!");
	}
	
	public void Complete() {
		System.out.println();
	}
}
