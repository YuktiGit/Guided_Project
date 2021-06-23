import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ValidatorSix {
 	boolean specialCharacter(String fileName) {
		fileName = fileName.split("\\.")[0];
		Pattern  patternGet = Pattern.compile("[@#$%^&(,)_]");
		Matcher check = patternGet.matcher(fileName);
		boolean finalValue = check.find();
		if (finalValue == true)
			return true;
		else
			return false;
	}
}
class testnamevalidator {
	public static void main(String[] args) {
		ValidatorSix csvObject = new ValidatorSix();
		boolean checkValidator = csvObject.specialCharacter("example.csv");
		System.out.println(checkValidator);
		checkValidator = csvObject.specialCharacter("example@.csv");
		System.out.println(checkValidator);
	}
}
