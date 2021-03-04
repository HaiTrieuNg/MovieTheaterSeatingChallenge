import java.util.ArrayList;

public class row {
	
	private seat[] row;
	private int length;
	private int rowIndex;
		
	public row(int rowIndex){
		this.row = new seat[20];
		this.rowIndex = rowIndex;
		
		for(int i = 0 ; i<20 ; i++) {
			row[i] = new seat(i);
		}
	}
	
	public int getLength() {
		return row.length;
	}
	
	public seat getSeat (int index) {
		return this.row[index];
	}
	
	public String getSeatState(int index) {
		return row[index].getState();
	}
	
	public ArrayList<Integer> openSeats() {
		
		ArrayList<Integer> openList = new ArrayList<Integer>();
		for (seat s : this.row) {
			if (s.getState() == "s") {
				openList .add(s.getIndex());
			}
		}
		
		return openList;
	}
	
	public void setTakenState(int index) {
		row[index].setTaken();;
	}
	
	public void setBufferedState(int index) {
		row[index].setBuffered();;
	}
	
	public ArrayList<ArrayList<Integer>> nConsecutiveWays (int n) {
		
		ArrayList<ArrayList<Integer>>  consecutiveWays = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> openSeats = this.openSeats();
		
		if(openSeats.size() >= n) {
			for (int i = 0 ; i < openSeats.size(); i++) {
				int start =i;
				boolean notConsecutive = false;
				
				if(i + n < openSeats.size() + 1) {
					
					for(int j = start + 1 ; j < i + n ; j++) {
						if(openSeats.get(start) + 1 != openSeats.get(j)) {
							notConsecutive = true;
							break;
						}	
						else
							start = start + 1;
					}
					
					if (!notConsecutive) {
						ArrayList<Integer> consecutiveSeats = new ArrayList<Integer>();		
						for(int k = 0; k<n ; k++)
							consecutiveSeats.add(openSeats.get(i+k));
						consecutiveWays.add(consecutiveSeats);
					}
				}
				
			}
			
		}
		
		
		return consecutiveWays;
	}
	
	
	
	
	
}
