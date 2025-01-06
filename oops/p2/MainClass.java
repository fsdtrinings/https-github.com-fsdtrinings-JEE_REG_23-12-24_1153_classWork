package p2;

public class MainClass {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		// provide values 
		
		// student1.age = 22; // error 
		student1.setAge(22); // should enter by user
		student1.setId(101);
		student1.setMarks(70);
		student1.setName("Ramesh");
		
		student2.setAge(22); // should enter by user
		student2.setId(102);
		student2.setMarks(71);
		student2.setName("Suresh");
		
			
		// print value - through object
		
		System.out.println("Name "+student1.getName()+" "+student1.getId());
		System.out.println("Marks "+student1.getMarks());
		
		System.out.println("Name "+student2.getName()+" "+student2.getId());
		System.out.println("Marks "+student2.getMarks());
		
		
	}//end main
}//end of class















