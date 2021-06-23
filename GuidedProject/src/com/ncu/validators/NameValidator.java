package com.ncu.validators;
import com.ncu.exceptions.*;
import java.io.FileInputStream;
import java.util.*;
import java.util.regex.*;

public class NameValidator {

    public boolean nameValidator(String filename , String filetype){

        //boolean b;
        Properties prop= new Properties(); //To use predefined msgs
        FileInputStream input = null;      //To read the file in which custom msg are stored
        try{
            input=new FileInputStream("D:\\College\\Semester2\\FOCP2\\GuidedProject\\configs\\constants\\exception.properties"); // Where ever my custom msg ki .properties file is stored
            prop.load(input);  //Need to load in property object
        emptyFileName(filename);  
        emptyDot(filename);
        //isCsV(filetype);
        filelength(filename);
       }
        catch(EmptyFileNameException q)
        {   String e=prop.getProperty("emptyNameMessage");
            System.out.println(e);
        q.printStackTrace();
        return false;}

        catch(MissingExtensionException w)
        { System.out.println(prop.getProperty("extensionMessage"));
            w.printStackTrace();
        return false;}
        //catch(InvalidExtensionException t)
       // {   System.out.println(prop.getProperty("notCsvMessage"));
          //  t.printStackTrace();
        //return false;}
        catch(FileNameLengthException y){
            System.out.println(prop.getProperty("longFileNameMessage"));
            y.printStackTrace();
            return false;
        }    
        
        catch(Exception r){r.printStackTrace();
        return false;}


        return true;
        
    }


    public static  void emptyFileName(String filename) throws EmptyFileNameException{
        if(filename=="")
        throw new EmptyFileNameException("Blank File name ");
    }

    public static void emptyDot(String filename) throws MissingExtensionException{
        Pattern ob1= Pattern.compile("[.]");
        Matcher ob2 = ob1.matcher(filename);
        if(ob2.find()==false)
        throw new MissingExtensionException("No . in filename"); 
    }
    public static void isCsV(String filetype) throws InvalidExtensionException{
        if(filetype!="csv")
            throw new InvalidExtensionException("File is not CSV type");
    }

    public static void filelength(String filename)throws FileNameLengthException{
        if(filename.length()>29)
            throw new FileNameLengthException("File too long");

    }
}

//class test{
   // public static void main(String[]args){
   //     NameValidator ob = new NameValidator();
   //     System.out.println(ob.nameValidator("uditcsv", "csv"));
   // }
//