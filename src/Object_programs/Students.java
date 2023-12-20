package Object_programs;

public class Students {
	
	String name;
	int rollno;

	
	
	public void showdetails(PassbyRefDemo pf) {
		
		
		pf.display();
		System.out.println("Students details are stored in Database");
		
	}
	
	public void details() {
	
		System.out.println("Students details are stored in Excel sheets");
		
	}
	
	
	public void assessment() {
		
		System.out.println("Assesmment of students are taken every 4 weeks");

		
	}
	
	public void placements() {
		
		System.out.println("Placements activites starts when most of the syllabus is covered.");

		
	}
	

}
