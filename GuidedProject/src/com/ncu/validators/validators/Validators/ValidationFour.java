class ValidatorFour {
 	boolean csvOnly(String fileName) {
		String[] name = fileName.split("\\.");		
		if(name[1].equals("csv"))
			return false;
		else
			return true;
	}

	boolean jsonOnly(String fileName) {
		String[] name = fileName.split("\\.");		
		if(name[1].equals("json"))
			return false;
		else
			return true;
	}
    
    boolean checValidation(String fileName, String fileType){
      boolean b = true;
      if(fileType == "csv"){
	     b = csvOnly(fileName);
	    if (b == true)
		  return false;
       else
	      b = jsonOnly(fileName);
     }
     return b;
   }    
}


class testnamevalidator{
	public static void main(String[] args){
	    
		ValidatorFour csvObject = new ValidatorFour();
		boolean checkValidator = csvObject.checValidation("example.csv","csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.checValidation("example.jpg","csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.checValidation("example.json","json");
		System.out.println(checkValidator);
	}
}