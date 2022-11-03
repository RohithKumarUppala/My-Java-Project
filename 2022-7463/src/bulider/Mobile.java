package bulider;

public class Mobile {
	private String model;
	private String Processor;
	private String cost;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessor() {
		return Processor;
	}
	public void setProcessor(String processor) {
		Processor = processor;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "\n\nMobile :-\nModel = " + model + "\nProcessor = " + Processor + "\nCost = "
				+ cost ;
	}
	
}
