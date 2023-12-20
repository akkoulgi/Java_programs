package conditional;

public class Nested_if {

	public static void main(String[] args) {

		int idly=3;
		
		if(idly>1) { // Outer If condition
			
			if(idly==2) { // Inner if condition
				
				System.out.println("Stomach is ok satisfied");
				
			}
			else  // Inner else condition 
			{
				
				System.out.println("more than enough");
			}
					
		}
		else // outer else condition
		{
			System.out.println("Idly is not available");
		}	
		
	}

}
