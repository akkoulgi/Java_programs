package Basic_programs;
public class Global_local {
	
	
	//Gobal variables
	static String bank_name="ICICI Bank";
	static String branch_name = "Hebbal";	
	static String IFSC_code = "ICICI09090";



	public static void main(String[] args) {

		
	double account_balance	= ak_bank_details();
	
	
	// Local variable
	System.out.println("Account number of akshay is"+account_balance);
	System.out.println(bank_name);
	System.out.println(branch_name);
	System.out.println(IFSC_code);	
		
	}
	
	
	
	public static double ak_bank_details() {
		
		int acc_no=909024;
		String acc_name="akshay koulgi";
		double balance=0000.5;
		char gender='f';
		
		
		return gender;
			
	}

}
