package com.ncu.main;
import com.ncu.processors.*;
import com.ncu.validators.*;
import java.util.Scanner;
public class jsonconvertor{

	static String getFileName(){
		String filename=null;
		
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter File Name:");
			filename = scn.nextLine();
		
		return filename;
	}

	

	public static void main(String[] args){
		String c,csvfilename,jsonfilename;
		boolean b;
		System.out.println("CSV FILE");
		csvfilename = getFileName();
		NameValidator csvObject = new NameValidator();
		b = csvObject.nameValidator(csvfilename,"csv");
		if(b==true)
			System.out.println("CSV File is OK..");
		System.out.println("JSON FILE");
		jsonfilename = getFileName();
		b = csvObject.nameValidator(jsonfilename,"csv");
		if(b==true)
			System.out.println("JSON File is OK..");
		csvprocessor processorObj = new csvprocessor();
		try{ b=processorObj.processCSV("D:\\College\\Semester2\\FOCP2\\GuidedProject\\csvs\\"+csvfilename,"D:\\College\\Semester2\\FOCP2\\GuidedProject\\jsons\\"+jsonfilename);}
		catch(Exception e ){e.printStackTrace();}
		if(b=true)	
			System.out.println("...Converted...");
	}

}