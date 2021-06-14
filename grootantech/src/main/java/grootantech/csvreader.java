package grootantech;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csvreader {
	
	public static void main(String[] args) {
		String path = "C:\\Users\\sachi\\Downloads\\Sample-Spreadsheet-5000-rows.csv";
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while((line = br.readLine())!= null){
			  String values[] = line.split(",");
			  System.out.println(values[1]);
			}
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
