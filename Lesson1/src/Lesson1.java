
public class Lesson1 {

	
	public static void main(String[] args) {
 
		System.out.println("Program start.\n");
		printFirstName();
		printLastName();
		addNames();
		System.out.println("\nProgram end.");
		
		
	}
			
    public static void printFirstName() {
    	System.out.println("My first name is Jason.");
    }
    
    public static void printLastName() {
    	System.out.println("My last name is Gibson.");
    }
    
    public static void addNames() {
    	int jason = 5;
    	int gibson = 6;
    	int sum;
    	
    	sum = jason + gibson;
    	
    	System.out.println("The number of letters in your full name is: " + sum);
    }
	
}
