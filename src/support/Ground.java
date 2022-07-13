package support;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ground {
	
	public static final int ORE = 1;
	public static final int EMPTY = 0;
	public static final int INVALID = -1;
	
	private String filepath;
	
	private int[][] map;

	public Ground(String path) throws FileNotFoundException, IOException {
		//initialize variables
		if(path.contains(".csv"))
			filepath = path;
		else {
			System.out.println("Not a valid file!");
			System.exit(1);
		}
		
		List<int[]> records = new ArrayList<>();
		
		//load in CSV
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		
		//get each line
	    String line;
	    while ((line = br.readLine()) != null) {
	    	int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
	    	records.add(numbers);
	    }
	    
	    //convert to 2d array
	    map = new int[records.size()][records.get(0).length];
	    for(int i = 0; i < records.size(); i++) {
	    	map[i] = records.get(i);
	    }
	    
	    br.close();
	}
	
	public int scanForOre(int x, int y) {
		//check that this point exists on the map. Otherwise return invalid. 
		int mapSize = map.length;
		int yAxis = map[0].length;
		int xAxis = mapSize/yAxis;
		if(map[0].length <= y || y < 0|| map.length <= x || x < 0) {
			return INVALID;
		}
		
		return map[x][y];
	}

}
