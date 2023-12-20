package OOPS1;

public class ThisKeywordDemo {
	
	String school_name;
	int rating;
	String class_name;
	
	ThisKeywordDemo(String school_name,int rating,String class_name){
		
		this.school_name=school_name;
		this.rating=rating;
		this.class_name=class_name;
	}
	
	
	

	public static void main(String[] args) {
		
		ThisKeywordDemo ts = new ThisKeywordDemo("Rotary",5,"10thD");
		
		
		System.out.println(ts.class_name);
		System.out.println(ts.rating);
		System.out.println(ts.school_name);

		

	}

}
