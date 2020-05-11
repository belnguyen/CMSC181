//Programmer Belinda Nguyen

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Function1 extends Function{

	double cost;
	
	@Override
	public double fnValue (double x)
	 {
		cost = 10;
		double pi = Math.PI;
		double radius_sqr = Math.pow(x, 2);
		return (5/2.0)*x*(cost - (0.8*pi*radius_sqr));
	 }
	

	public String toString()
	{
		return "Minimize the cost of a can that will hold 2 litres of liquid";
	}
	
	
	
	@Override
	public String answerString(double volume, double radius, double height, double z)
	{

				String pattern = "#,###.##";
				DecimalFormat decimalFormat = new DecimalFormat(pattern);
				String volumeFormat =	decimalFormat.format(volume);
				decimalFormat.applyPattern("#0.##");
				String hFormat = decimalFormat.format(Math.abs(height));
				String rFormat = decimalFormat.format(Math.abs(radius));
				return "Maximum volume is " + volumeFormat + " with height = "+hFormat+"cm and radius = " +rFormat+"cm";
	}
	

	@Override
	public double getXVal (double x)
	{
		return x;
	}
	

	@Override
	public double getYVal (double x)
	{
		return (cost -.8*Math.PI*Math.pow(x,2))/(0.4*Math.PI*x); //2000/(Math.PI*Math.pow(x,2));
	}
	

	@Override
	public double getZVal (double x)
	{
		return -1.0;
	}

}

