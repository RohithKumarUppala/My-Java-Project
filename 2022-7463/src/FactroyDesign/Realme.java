package FactroyDesign;

public class Realme implements IMobile {
	
	String model;
	double cost;
	String processor,battery,Ram,Storage,Display;
	
	public String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public void model() {
		System.out.println("Realme Model :"+getModel());
	}
	@Override
	public void price() {
		System.out.println("Model "+getModel()+" Cost is "+getCost());
	}
	public void setFeature(String processor,String battery,String Ram,String Storage,String Display) {
		this.processor=processor;
		this.battery=battery;
		this.Ram=Ram;
		this.Storage=Storage;
		this.Display=Display;
	}
	public void features() {
		System.out.println("\n\nThe Model Realme "+getModel()+"\nBasic Features are:\n\n1.Processor :"+processor+
				"\n2.Ram       :"+Ram+"\n3.Storage   :"+Storage+"\n4.Battery   :"+battery+"\n"
						+ "5.Display   :"+Display+"\n");
	}
	
	
}
