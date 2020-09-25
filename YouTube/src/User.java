public abstract class  User implements Talk{
	public enum status {active, innactive, probation};
	public String firstName;
	public String lastName;
	public boolean verified = false;
	public status status;
	
	public final void sayHello() {
		
	}
}