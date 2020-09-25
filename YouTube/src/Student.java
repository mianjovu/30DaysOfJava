public class Student extends User implements Talk{
    public boolean verified = true;
    public String major;
    
    public Student(String fn, String ln) {
    	firstName = fn;
    	lastName = ln;
	}
    
}
