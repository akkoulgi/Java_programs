package Strings;

public class reverse {

	public static void main(String[] args) {

		String s="india";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) { //
			
			rev=rev+s.charAt(i); // 1st iteration ,i = 4
			
								// ""+a , rev ="a"
			
								// 2nd iteration , i =3
								// a = a + i     , rev=ai
			
			
								// 3rd iteration , i = 2
								// ai= ai+d    , rev = aid
			
								//4th iteration, i=1
								//aid = aid + n , rev = aidn
					
			
								//5th Iteration , i=0
								//aidn = aidn + I  , rev = aidnI
								
		}
		
		
		
		System.out.println(rev);
		
		
		//Logic to check palindrome
		
		if(rev.equals(s)) {

			System.out.println(" Given string is a palindrome");
			
		}
		
		else
			System.out.println(" Not a palindrome");
		
		
		
		
	}

}
