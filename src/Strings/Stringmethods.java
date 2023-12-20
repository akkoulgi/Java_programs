package Strings;

public class Stringmethods {

	public static void main(String[] args) {

		
		String s1="divya";
		
		String s2= "JYoti";
		
		String s3="                I am a human           ";
		
		//Charat
		
		System.out.println(s1.charAt(3)); // Indexing in strings always starts from 0.
		
		 System.out.println(s1.contains("a"));
		 
		 System.out.println(s1.concat(s2));  
		 
		 
		 System.out.println( s1.endsWith("a"));
		
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		
		System.out.println(s3);
		
		System.out.println(s3.trim());	//Trim removes the white spaces at the start and at the end  of the string

		
		//toCharArray - it will convert the given string into character array
		char[] arr = s3.toCharArray();
		
		
		//Substring is also an example of Method overloading.
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(0, 3)); // the endindex mentioned will also be removed
		
		
		String s="my name is ak";
		
		System.out.println("Split function below");
		String[] spstr = s.split(" ");
		
		for(int i=0;i<spstr.length;i++) {
			
			System.out.println(spstr[i]);
			
		}
		
		
		// Split splits the string with the mentioned pattern and stores it into a string array.
		
		System.out.println(s.replace('m', 'k'));
		
		s1="happy";
		s2="HAPPY";
	
		System.out.println("Equals function below");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.contains("z"));
		;
		
		s.equalsIgnoreCase(s3);
		
		
		//Is String mutable?
		String name="welcome";
		
		System.out.println(name);
		
		System.out.println(name.concat("2"));
		
		System.out.println(name);
		
		//String is Immutable - The value of any string doesnt change once initialised.
		//If we do any operation, the value will not be stored inside the variable , but only 
		// operation is performed.
		
	
		
	}

}
