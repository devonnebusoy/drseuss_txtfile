/**
 * Uses the File class, to open the seuss.txt file and print it out to the console.
 * @author devonne.busoy
 */
import java.io.File; 
import java.util.Scanner;
import java.io.FileNotFoundException;

public class suess{
	public static void main(String[] args){
		File file = new File("seuss.txt"); // Instantiate a new File object with the specified path
		
		if(file.exists() && file.isFile()) {
			try {
				Scanner fileScan = new Scanner(file); // Instantiates a new Scanner to read from the specified File
				
				while(fileScan.hasNextLine()) { // Iterates through every line of the file
					System.out.println(fileScan.nextLine());
				}
				fileScan.close();
			}
			catch (FileNotFoundException e) {
				System.out.print("Not valid: " + file);
			}
		}
	}
}