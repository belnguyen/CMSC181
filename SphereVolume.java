
import java.util.Scanner;
//programmer is Belinda Nguyen

public class SphereVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare variables
		String programmer = "Belinda Nguyen";
		double diam; //diameter
		double radius;
		double volume;
		
		//ask user to input diameter of sphere
		System.out.print("Enter the diameter of the sphere: ");
	    // Read the diameter
		diam = input.nextDouble();
		
	    // Calculate radius
	    radius = diam / 2.0;
	       
	    // Calculate volume
	    volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
	       
	    // Print out the volume
	    System.out.println("The volume of the sphere is " + volume);
	    
	    System.out.println("Programmer is: " + programmer);

	}

}
