package Basic_programs;

public  class Multiply {

	
	
	static int price;//static pool area 
	
	public static void main(String[] args) { //String[] args is arguement of main method - String array
												//name of string array is args. - Static pool area , Stack(For execution)
		int result=multiply(); // Method calling 
		System.out.println(result);
		
		
	}

	public void add() { // heap memory
		
		
		
	}

	public static int multiply() {// method definition  - //Static pool area
									
		int a=2;
		int b=3;
		int c=9;
		
		int result=a*b*c;
		
		return result;
		
		
		
	}// Method body is from line 23 to 35
	
	
	
	
}
