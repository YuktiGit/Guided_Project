class ValidatorSeven {
  boolean fileAvailability(String filename, String filetype) {
    boolean b; 
    if(filetype == "csv") {
   	 b = fileNotAvaiable(filename);
	 if (b == true) {
		return false;
	 }	
     else {
	   b = fileExist(filename);
	  if (b == true)
	   return true;
     }
   }
  }
}
 
class testnamevalidator{
	public static void main(String[] args){
		ValidatorSeven csvObject = new ValidatorSeven();
		boolean checkValidator = csvObject.fileAvailability("example.csv","csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.fileAvailability("example.json","json");
		System.out.println(checkValidator);
	}
}

