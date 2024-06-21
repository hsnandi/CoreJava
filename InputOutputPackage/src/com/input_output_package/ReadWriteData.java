package com.input_output_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class ReadWriteData {

	public static void main(String[] args) throws IOException {
		// Input keyboard
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  //Adding buffer to read whole string instead of just one character.

		try {
			System.out.println("Enter Number: ");
			int number = Integer.parseInt(br.readLine());
			System.out.println(number);
			System.out.println("Enter String: ");
			String inputString = br.readLine();
			System.out.println(inputString);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			isr.close();
			br.close();
		}

		// File read write operation
		try (
				Writer fr = new FileWriter("demo.txt"); 
				BufferedWriter br1 = new BufferedWriter(fr)) {    //Adding buffer to read whole string.
			br1.write("Any random strings can be written here.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//We will take input from user and add that in file. We need multiple line in file using 'br.write()' or 'br.newLine()'. we can take string until '$'. we should be using while loop, while(line.equals("$"))
