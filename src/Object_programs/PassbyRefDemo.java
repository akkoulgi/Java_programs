package Object_programs;

public class PassbyRefDemo {
	
	
	int n2;
	String example;

	public static void main(String[] args) {

		Students s=new Students();
		
		String name1=s.name;
		
		s.details();
		s.assessment();
		s.placements();
		
		
		System.out.println("Demo methods");
		
		PassbyRefDemo p1 =new  PassbyRefDemo();
		
		
		p1.demo(s);
		
	}
	
	public static void io() {
		
		System.out.println("some print");
		
	}
	
	public void demo(Students s1) // Pass by reference 
	{
		
	String name2=s1.name;
	int roll_=s1.rollno;
	
	s1.assessment();
	s1.placements();
	s1.details();
		
		
	}
	
	
	public void display() {
		
		
		System.out.println("display");
		
		
	}

}
