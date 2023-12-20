package Object_programs;

public class Mobile {

	public static void main(String[] args) {
		
		//nk - reference variable
		//new Nokia() - object		
		//what is Nokia nk?
		// nk is a reference variable of the type Nokia class.
		//object was created with new Nokia(), and we are storing the object inside a reference variable which is of the type Nokia class.
		// nk is a non primitive variable.
		
		Nokia nk=new Nokia();
		
		Nokia jk= new Nokia();
		
		Institute in= new Institute();
		
		JavaSession jn = new JavaSession();

		
		System.out.println("methods of Nokia class");
		int battery_var = nk.battery();
		 String camera_var = nk.camera();
		int os_var=nk.Osdetails();
		String features_var = nk.features();
		 int memory_var = nk.memory();
		 
		 
		 System.out.println("Nokia details "+battery_var+" "+camera_var+" "+os_var+" "+memory_var);
		 
		
		Nokia.sample();
		System.out.println(Nokia.rating);
		
		
		
	}
	
public void demopass(Nokia n) {
	
	System.out.println(n.power);
	n.features();
	n.camera();
	
	
}
	
}
