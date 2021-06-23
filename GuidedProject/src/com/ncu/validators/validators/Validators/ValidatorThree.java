import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ValidatorThree {
	boolean missingDot(String fileName) {
		Pattern costPattern = Pattern.compile("[.]");
		Matcher costMatcher = costPattern.matcher(fileName);
		boolean value = costMatcher.find();
		if (value == true) {
			return false;
		}
		else {
			return true;
		}
	}

   void fileFormat(String fileName) {
		String [] haveExtenstion= fileName.split("\\.");
		if (haveExtenstion.length<=1) {
			throw new InvalidExtensionException("");
		}
	}
}		

class testnamevalidator{
	public static void main(String[] args){
		
		ValidatorThree csvObject = new ValidatorThree();
		boolean checkValidator = csvObject.missingDot("example.csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.missingDot("examplecsv");
		System.out.println(checkValidator);

		checkValidator = csvObject.fileFormat("example.csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.fileFormat("example.");
		System.out.println(checkValidator);
	}
}
