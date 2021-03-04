import java.util.ArrayList;
import java.util.HashMap;

public class grid {
	
	private row[] grid;
	
	public grid(){
		this.grid = new row[10];
		
		for(int i = 0 ; i<10 ; i++) {
			grid[i] = new row(i);
		}
		
	}
	
	public void print_grid () {
		for (int i = 0 ; i< grid.length; i++) {
			for (int j = 0 ; j< grid[0].getLength(); j++) {
				System.out.print(grid[i].getSeatState(j));	
			}
			System.out.print("\n");
		}
	}
	
	public row getRow (int index) {
		return this.grid[index];
	}
	
	public HashMap<Integer, ArrayList<ArrayList<Integer>>> allRowsOptions (int n){
		HashMap<Integer,ArrayList<ArrayList<Integer>>> rowsOptions = new HashMap<>();
		for(int i = 0 ; i<10 ; i++) {
			ArrayList<ArrayList<Integer>> availableAtRow = new ArrayList<ArrayList<Integer>>();
			availableAtRow = grid[i].nConsecutiveWays(n);
			if(availableAtRow.size() != 0) {
				rowsOptions.put(i,(availableAtRow));
			}
				
		}	
		
		return rowsOptions;	
	}
	
	public void setTakenSeats (int rowIndex, int start, int n) {
		for(int i = 0 ; i< n ; i++)
			grid[rowIndex].setTakenState(start+i);
	}
	
	public void setBufferedSeats (int rowIndex, int start, int n) {
		for(int i = 0 ; i < 3; i++) {
			if(start + n + i < 20)
				grid[rowIndex].setBufferedState(start + n + i);
			
			if(start - (i+1) >= 0)
				grid[rowIndex].setBufferedState(start - (i+1));
		}
	}
}
