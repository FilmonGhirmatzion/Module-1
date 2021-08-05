package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearch {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String filePath = userInput.nextLine();
		System.out.println("What is the search word you are looking for?");
		String wordSearch = userInput.nextLine();
		System.out.println("Should the search be case sensitive? (Y/N)");
		String caseSensitivity = userInput.nextLine();
		File file = new File(filePath);
		if(!file.exists()) {
			System.out.println("The file is not valid.");

		}
		if(!file.isFile()) {
			System.out.println("This is not a file.");

		}
		int lineNumber = 1;
		try(Scanner fileScanner = new Scanner(file)) {
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();

				Pattern pattern;
				if(caseSensitivity.equalsIgnoreCase("Y")) {
					pattern = Pattern.compile(wordSearch);
				} else {
					pattern = Pattern.compile(wordSearch, Pattern.CASE_INSENSITIVE);
				}
				Matcher matcher = pattern.matcher(line);
				if(matcher.find()) {
					System.out.println(lineNumber + ") " + line);
				}
				lineNumber += 1;
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}