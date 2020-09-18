package Lab2b.ques2;

public class InVoice implements Payable{
	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuality() {
		return quantity;
	}
	public void setQuality(int quality) {
		this.quantity = quality;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	@Override
	public String toString() {
		return ("PartNum : "+partNum+"\nPartDescription : "+partDescription+"\nPartNum : "+quantity+"\nPrice Per Item : "+pricePerItem);
	}
	@Override
	public double getPayment() {
		System.out.println(this);
		System.out.println("Payment is : "+pricePerItem*quantity);
		return (double)(pricePerItem*quantity);
	}
	
	
	
}