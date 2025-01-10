package ce;

public class UserFrontEnd {
	public static void main(String[] args) {
		BusinessProblem2 app = new BusinessProblem2();
		
		try {
			app.fillJobForm();
			
		}
		
			
		catch (JFCValidationException e) {
			System.out.println(e.exceptionMsg());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
			// ... 
		
		
	}
}
