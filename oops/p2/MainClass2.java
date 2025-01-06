package p2;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		MainClass2 app = new MainClass2();
		
		Student student1 = new Student(); // empty
		Student student2 = new Student(); // empty
		Student student3 = new Student(); // empty
		
				
		app.getStudentFromuser(student1,"Student 1 Information ");
		app.getStudentFromuser(student2,"Student 2 Information");
		app.getStudentFromuser(student3,"Student 3 Information");
		
		
		
		app.printStudentDetails(student1);
		app.printStudentDetails(student2);
		app.printStudentDetails(student3);
		
		
		
		
		
	}
	
	public void getStudentFromuser(Student anyStudent, String info)
	{
		System.out.println("\n"+info+"\n");
		
		Scanner scStr = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name ");
		String name = scStr.nextLine();
		anyStudent.setName(name);
		
		System.out.println("Enter Student Id ");
		anyStudent.setId(sc.nextInt());
		
		System.out.println("Enter Student Age ");
		anyStudent.setAge(new Scanner(System.in).nextInt());
		
		System.out.println("Enter Student marks ");
		int marks =sc.nextInt();
		anyStudent.setMarks(marks);
		
		
		
		
		
		
		
		
	}
	
	public void printStudentDetails(Student anyStudent)
	{
		System.out.println("\n------------------------------------\n");
		System.out.println("Name "+anyStudent.getName()+" "+anyStudent.getId());
		System.out.println("Marks "+anyStudent.getMarks());
		
	}
}
