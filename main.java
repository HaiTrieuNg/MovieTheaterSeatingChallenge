
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
		
		ArrayList<input> inputs = new ArrayList<>();
		String filename = "";
		
		if (args.length > 0) {
		    filename = args[0];
		    File file = new File(filename);
		}
		
		
		try{
		    FileInputStream fstream = new FileInputStream(filename);
		          DataInputStream in = new DataInputStream(fstream);
		          BufferedReader br = new BufferedReader(new InputStreamReader(in));
		          String strLine;
		          while ((strLine = br.readLine()) != null)   {
		   String[] tokens = strLine.split(" ");
		   input input = new input(tokens[0],tokens[1]);
		   inputs.add(input);
		   }
		   in.close();
		   }catch (Exception e){
		     System.err.println("Error: " + e.getMessage());
		   }

		findSeat s = new findSeat();
		for (int i= 0 ; i< inputs.size(); i++) {
			
			String numberOfSeat = inputs.get(i).getNumberOfSeats();
			String orderNum = inputs.get(i).getOrderNumber();
			
			System.out.println(s.choosenSeats(orderNum, Integer.valueOf(numberOfSeat)));
			s.getGrid().print_grid();
		}
		
	}
}



