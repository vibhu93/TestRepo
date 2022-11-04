package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ReadTheSystemFolder {

	
	// File handing 
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\INTEL\\Downloads");
		File[] dir = file.listFiles();
		Arrays.sort(dir);
		for (File e : dir) {
			boolean test = e.createNewFile(); 
			//System.out.println(e.getName());
			if (e.getName().contains("Timesheet Dec 2021")) {
				String fileLocation = e.getPath();
			}
		}

	}

}
