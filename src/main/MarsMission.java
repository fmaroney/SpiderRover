package main;

import java.io.FileNotFoundException;
import java.io.IOException;

import support.Ground;

public class MarsMission {

	public static void main(String[] args) {
		//support functionality to read in args and get ground truth.
		try {
			Ground groundPlane = new Ground(args[0]);
			//DO NOT TOUCH CODE ABOVE THIS LINE
			//
			// Develop your main method here
			
			
			//DO NOT TOUCH CODE BELOW THIS LINE
		} catch (FileNotFoundException e) {
			System.out.println("File " + args[0] + "does not exist! Exiting.");
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Error reading file " + args[0] + "! Exiting.");
			e.printStackTrace();
			System.exit(1);
		}

		
		
	}

}
