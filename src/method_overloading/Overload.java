package method_overloading;

public class Overload {

	public static void main(String[] args) {
		
		
		// Method Declaration getting binded to its definition at compile time. 
		
		System.out.println(add(3,4));
		System.out.println(add(3,4,10));
		System.out.println(add(3,4,90,900));

		//add(0,9,10);
		//add(90,98,9,87);
	
		
	}
	
	
	// method overloading - Multiple methods with the same name but variation in the arguement list
	
	
	public static int add(int num1,int num2) {
		
		return num1+num2;
		
	}
	
	public static  int add(int num2,int num3,int num4) {
		
		return num2+num3+num4;
		
	}
	
	public static int add(int num1,int num2,int num3,int num4) {
	
	return num1+num2+num3+num4;
	
}
	
	

}
