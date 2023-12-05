package Basic_programs;

public class Method_parameter {

	public static void main(String[] args) {

		//int res=add(2,9); // Giving input from the main method
		
		int re=add(2,9);
		
		
		System.out.println(re);
	}

	public static int add(int a,int b) {
		
		
		//int a=2;
		//int b=9;
		int result=a+b;
	
		//System.out.println(result);
		
		return result; // This statement will return the value of result to the main method.
		
	}
	
	
}
