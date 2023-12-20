package Object_programs;

public class Institute {

	public static void main(String[] args) {
			
		
		//Object of JavaSession class
		JavaSession js=new JavaSession();
		
		//Accessing akshayDemo method of JavaSession class
		js.akshayDemo();
		
		js.soumyaDemo();
		
		js.MethodDemo();
		
		int jyoti_marks=js.jyoti_marks;
		
		
		System.out.println(jyoti_marks);
		
		System.out.println(js.rahul_marks+" "+js.soumya_marks);
		
		System.out.println(js.soumya_marks);
		
	}

}
