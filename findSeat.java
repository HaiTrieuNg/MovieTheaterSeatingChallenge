import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class findSeat {
	
	private grid g;
	
	public findSeat() {
		 g = new grid();
	}
	
	public grid getGrid () {
		return this.g;
	}
	
	public void writeOutput (String s) {
		try {
		      File myObj = new File("output.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(
				        new FileWriter("output.txt", true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	 
		try {
			writer.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String choosenSeats(String orderNum, Integer n) {
		Map<Integer, ArrayList<ArrayList<Integer>>> allOptions = new TreeMap<Integer, ArrayList<ArrayList<Integer>>>(g.allRowsOptions(n));
		
		if(allOptions.size() > 0) {		
			
			//chose random numbers
			int chosenRowIndex = (int) (Math.random() * (allOptions.keySet().size()-1 -  0 + 1) + 0);	
			
			//get the value from hashmap
			int chosenRow = (int) allOptions.keySet().toArray()[chosenRowIndex];
					
			
			int chosenSeatsIndex = (int) (Math.random() * (allOptions.get(chosenRow).size()-1 -  0 + 1) + 0);
					
			ArrayList<Integer> chosenSeat = allOptions.get(chosenRow).get(chosenSeatsIndex);
			
			g.setBufferedSeats (chosenRow, chosenSeat.get(0), n);
			g.setTakenSeats (chosenRow, chosenSeat.get(0), n);
			
			
			String s = orderNum + " ";
			int m = chosenRow  + 65;
			Character charRow = (char)m;
			String stringRow = Character.toString(charRow);
			
			for(int i = 0 ; i<n; i++) {
				int actualSeatNum = chosenSeat.get(i) + 1;
				s =  s + stringRow + actualSeatNum + ",";
			}
			
			if (s.endsWith(",")) {
				  s = s.substring(0, s.length() - 1);
			}
			s += "\n";
			
			writeOutput (s);
			
			return s;
			  
		}
		else {
			return ("There is no available consecutive numbers of seats that ensure safety.");
		}
		
	}
}
