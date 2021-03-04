import java.util.*;

public class seat {
	private String state;
	private int index;
	
	public seat(int index)
	/**
	 * Constructor
	 */
	{
		this.state = "s";
		this.index = index;
	}
	
	public String getState()
	/**
	 * return the state of the seat
	 */
	{
		return this.state;
	}
	
	public int getIndex()
	/**
	 * return the position of the seat in a row
	 */
	{
		return this.index;
	}
	
	public void setTaken()
	/**
	 * set the seat as taken
	 */
	{
		this.state = "X";
	}
	
	public void setBuffered()
	/**
	 * set the seat as buffer seat
	 */
	{
		this.state = "B";
	}
}
