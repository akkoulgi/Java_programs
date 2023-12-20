package conditional;

public class Demo3_if_else_if {

	public static void main(String[] args) {

		int marks=62;
		
		if(marks>25 && marks<=30) {
			
			System.out.println("Result is just passed");
			
		} 
		
		else 
			
		if(marks>80) {
			
			System.out.println("Result is Distinction");
			
		}
		else 
			if(marks>60 && marks<70 && marks<80) {
				
				System.out.println("Result is first class");
				
			}
		
		else
			if(marks>25) {
				
				System.out.println("pass");
				
			}
		
		else {
			
			System.out.println("Result is failed");
			
		}
		
		
		
	}

}
