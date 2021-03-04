public class input {
	private String o;
	private String n;
	public input (String orderNumber, String numberOfSeats) {
		this.o = orderNumber;
		this.n = numberOfSeats;
	}
	
	public String getOrderNumber () {
		return this.o;
	}
	
	public String getNumberOfSeats () {
		return this.n;
	}
	
}
