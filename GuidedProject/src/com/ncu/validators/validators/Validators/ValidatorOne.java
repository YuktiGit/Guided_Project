class ValidatorOne {
	boolean ValidatorOne(String filename, String filetype) {
		System.out.println("File name is : " + filename + " and its type is : " + filetype);
		return true;
	}
 }  

class testnamevalidator{
	public static void main(String[] args){
		ValidatorOne csvObject = new ValidatorOne();
		csvObject.ValidatorOne("example.csv","csv");
	}
}