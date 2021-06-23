class ValidatorFive {
 	boolean fileLength(String fileName){
		int fileLength = 25;
		String namelength = fileName.split("\\.")[0];
		if(fileName.length() > fileLength)
			return true;
		else 
			return false; 
		}
    
}
class testnamevalidator{
	public static void main(String[] args){
		ValidatorFive csvObject = new ValidatorFive();
		boolean checkValidator = csvObject.fileLength("example.csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.fileLength("exampleexampleexampleexampleexampleexampleexample.cvs");
		System.out.println(checkValidator);
	}
}
