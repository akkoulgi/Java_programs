package OOPS1;

public class DemoConstructor {

	
	int number;
	String name_;
	
	
	// What is the main usage of Paramterized constructor? 
	
	// To initialize Global variables.
	
	
	//User Defined parameterized Constructor
	 DemoConstructor(String name,int num){
		
		 name_=name;
		 number=num;
		
	}
	 //Default Constructor
	 DemoConstructor(){
		
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
		DemoConstructor dr = new DemoConstructor("Rahul",100);
		
		DemoConstructor dr1 = new DemoConstructor("Jyoti",99);
		
		DemoConstructor dr2 = new DemoConstructor("Harish",98);
		
		DemoConstructor dr3=new DemoConstructor();
		
		//Accessing initailized variable through Default Constructor
		System.out.println(dr3.name_);
		System.out.println(dr3.number);
		
		
		//Accessing initailized variable through Parameterized constructor
		System.out.println(dr.name_);
		System.out.println(dr.number);
		
		//Accessing initailized variable through Parameterized constructor

		System.out.println(dr1.name_);
		System.out.println(dr1.number);
		
		//Accessing initailized variable through Parameterized constructor

		System.out.println(dr2.number);
		System.out.println(dr2.name_);
		
		
		
		
	}

}
