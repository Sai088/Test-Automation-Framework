package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojo.User;

public class CSVReaderUtility {
	public static Iterator<User> readCSVFile(String fileName) {
		File csvFile = new File(System.getProperty("user.dir")+"\\testData\\" + fileName);
		FileReader fileReader = null;;
		CSVReader csvReader;
		String[] line;
		List<User> userList = null;
		User userData;
		try {
			fileReader = new FileReader(csvFile);
			csvReader = new CSVReader(fileReader);
			csvReader.readNext(); //Reading the Col Names---Row 1
			//data = csvReader.readNext(); //Row 2 and if we have reaached the end of the csv file readNext returns you null			
			userList = new ArrayList<User>();
			User user;
			while((line = csvReader.readNext()) != null) {
			user = new User(line[0], line[1]);
			userList.add(user);
			}
			
			//for(User userData : userList) {
				//System.out.println(userData);
			//}
			//System.out.println(Arrays.toString(line));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (CsvValidationException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userList.iterator();
		
	}

}
