import java.util.ArrayList;
import java.util.List;


public class MySweetProgram {
	
	public static void main(String[] args) {
		Student s = new Student("Mia-rose", "Njovu");
		
		s.status = s.status.probation;
		
		System.out.println(s.status);
		
		switch(s.status) {
		case probation:
			System.out.println("Ouch");
			break;
		case active:
			System.out.println("Great!");
			break;
		case innactive:
			System.out.println("come back!");
			break;
		}
	}
}