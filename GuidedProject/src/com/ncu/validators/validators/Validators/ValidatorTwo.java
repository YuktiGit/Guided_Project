class ValidatorTwo {
  boolean emptyFileName(String fileName) { 		
		boolean b;
		b = emptyFileName(fileName);
		if (b == true) {
			return false;
		}	
        else {
		    return true;
		} 
}			
}
class testnamevalidator {
	public static void main(String[] args) {
		ValidatorTwo csvObject = new ValidatorTwo();
		boolean checkValidator = csvObject.emptyFileName("example.csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.emptyFileName("");
		System.out.println(checkValidator);
	}
}