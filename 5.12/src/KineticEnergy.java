import java.util.Scanner;

public class KineticEnergy {
	
	public static double kineticEnergy( double mass, double velocity ) {
		double kineticEnergy = ( ( double )1 / 2 ) * mass * ( Math.pow( velocity, 2 ) );
		return kineticEnergy;
	}
	
	public static void main( String [ ] args ) {
		Scanner scanner = new Scanner( System.in );
		double userMass;
		double userVelocity;
		double kineticEnergy;
		
		System.out.println( "Please enter the mass: " );
		userMass = scanner.nextDouble();
		
		System.out.println( "Please enter the velocity: " );
		userVelocity = scanner.nextDouble();
		
		kineticEnergy = kineticEnergy( userMass, userVelocity );
		System.out.printf( "The kinetic energy with mass %.2f and velocity %.2f is %.2f", 
							userMass, userVelocity, kineticEnergy );
	}
	
}
