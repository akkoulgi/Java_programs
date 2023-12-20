package method_overloading;

public class Whatsapp {

	public static void main(String[] args) {
		boolean signal = send("I love you");
		int res =send(3);
		boolean signal2 = send(true);
		
		System.out.println(signal);
		System.out.println(res);
		System.out.println(signal2);

		
	}

	
	public static boolean send(String message) {
		
	    boolean conform = message.startsWith("I");
		
		return conform;
	}
	
	public static int send(int number) {
		
	return number*number;
		
		
		
	}
	
	public static boolean send(boolean msg) {
	
	return false;
	
}

	
}
