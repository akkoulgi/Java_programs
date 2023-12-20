package Loops;

public class WhileDemo {

	public static void main(String[] args) {

		// While loop - While the condition is true, keep on executing the lines of code mentioned inside
		// the while loop, when the condition is false- come out of the loop.
		
		int n=10;
		
		
		while(true) {
			
			if(n==199)
			{
				break;
			}
			
			else
			{
			System.out.println(n);
			n++;
			}
			
		}// while loop ends here
		
		
		System.out.println(n);
		
	}

}
