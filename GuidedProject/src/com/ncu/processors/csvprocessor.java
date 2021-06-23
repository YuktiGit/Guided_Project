package com.ncu.processors;
import java.io.*;
import org.json.simple.*;


public class csvprocessor{
   public  boolean processCSV(String csvFileName,String jsonFileName) throws Exception {
	
	FileReader fr = new FileReader(csvFileName);
	BufferedReader br = new BufferedReader(fr);
	String headerLine = br.readLine(); 
	String[] keyNames = headerLine.split(",");
	

	String line;
		JSONArray jsonArry = new JSONArray();		
	   FileWriter fw = new FileWriter(jsonFileName);	
	   BufferedWriter bw = new BufferedWriter(fw);		
		
	 while ((line = br.readLine()) != null) {
		JSONObject jObj = new JSONObject();		
		String[] dataLine = line.split(",");
		for(int i=0;i<dataLine.length;i++){
			jObj.put(keyNames[i],dataLine[i]);	
		}
		jsonArry.add(jObj);	
								
	}
		bw.write(jsonArry.toJSONString());	
		bw.flush();
	
	

	return true;
 }
  }

//class csvprocessortest{
//	public static void main(String[]args){
//		csvprocessor ob = new csvprocessor();

//		System.out.println(ob.processCSV("D:\\College\\Semester2\\FOCP2\\GuidedProject\\csvs\\example.csv" , "D:\\College\\Semester2\\FOCP2\\GuidedProject\\jsons\\example.json"));

//	}
//}