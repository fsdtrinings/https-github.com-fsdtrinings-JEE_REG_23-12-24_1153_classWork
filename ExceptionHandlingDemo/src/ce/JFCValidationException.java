package ce;



//   #step 1 : create class extends with Exception class
public class JFCValidationException extends Exception{
	
	private String fieldName;
	
	public JFCValidationException(String fieldName)
	{
		this.fieldName = fieldName;
	}
	
	public String exceptionMsg()
	{
		return fieldName+" input is invalid";
	}

}
