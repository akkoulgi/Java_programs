package Inheritance;

public class Program extends Object {
	
	


	public static void main(String[] args) {
		
		// Example of Hierarchiral Inheritance
		System.out.println("Boys qualities");
		Boy b= new Boy();
		b.emotions();
		b.money();
		
		Girl g= new Girl();
		
		System.out.println("Girls Qualities");
		g.emotions();
		g.money();
		
	}
	

}