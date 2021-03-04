import java.util.*;

public class seat {
	private seat seat;
	private String state;
	private int index;
	
	public seat(int index){
		this.state = "s";
		this.index = index;
	}
	
	public String getState() {
		return this.state;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setTaken() {
		this.state = "X";
	}
	public void setBuffered() {
		this.state = "B";
	}
}
