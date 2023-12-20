package Inheritance;

public class Implementation  {
	
	
public static void main(String[] args) {

		
	
	//Creating object of Child class
	Student s1 = new Student();
	
	// Access parent methods from child class object.
	
	s1.explaination();
	s1.java_skills();
	s1.selenium_skills();// Teacher methods
	s1.soft_skills();
	s1.display(); // Student method
	
	
	
		
	}

}
