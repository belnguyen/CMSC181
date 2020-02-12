// Belinda Nguyen Assignment 1 WindChill

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
			double fahrenheit;
			double windspeed;
			double windChill;
			String name = "Belinda Nguyen";
			
		System.out.print("Wind Chill Calculator\n\n");
			
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40)");
			fahrenheit = input.nextDouble();
			
			System.out.print("Enter the wind speed in miles per hour (must be >= 5 and <= 60): ");
			windspeed = input.nextDouble();

			
			windChill = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windspeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windspeed, 0.16);

			
			System.out.println("\nThe wind chill index is " + windChill);

			System.out.println("\nProgrammer: " + name);
	}

}
