package _solution;
import java.text.DecimalFormat;
import java.util.Random; 
import javax.swing.*;  

/*
 * @author Belinda Nguyen
 */

public class Birthday {

   public static void main(String[] args) {
	   
	   //declare variables
	   String childName = null;
	   String childAge = null;
	   String childToy = null;
	   String anotherToy;
	   String addCard, addBalloon;
	   String continueOrder="yes";

	   int age;
	   boolean confirmation;
	   double payTotal=0.0;
	   
	   Toy toy = new Toy();
	   
       String decimal = "###.00";
       DecimalFormat twoDecimal = new DecimalFormat(decimal);
   	   Random objGenerator = new Random();
	   String programmer="Belinda Nguyen";
	   
	  JOptionPane.showMessageDialog(null, "Welcome come to the Toy Company\nto chooose gift for children");

	  //if user would like to add more toys, prompt will loop
	   do {
		   while(continueOrder.equals("yes")) {
			   childName=JOptionPane.showInputDialog("Please enter the child's name:");
	   
			   childAge=JOptionPane.showInputDialog("Please enter the age of the child: ");
			   age=Integer.parseInt(childAge);
			   toy.setAge(age);
	   
			   childToy=JOptionPane.showInputDialog("Please choose a toy: Plushie, Blocks, or a Book");
			   toy.setToy(childToy);
	   
			   confirmation=toy.ageOK();
	   
	   if (confirmation==false) {
           continueOrder = JOptionPane.showInputDialog("Toy is not age appropriate. Would you like to purchase another toy? Yes or No");
           
           if (continueOrder.equalsIgnoreCase("yes")) {
        	   confirmation=true;
           } 
	   	}
           else {
        	   continueOrder="no";
           }
		}
	  	
		//set cost of toy chosen
        toy.setCost(childToy);
        
        //add card to order
        addCard = JOptionPane.showInputDialog("Would you like a card with it? Yes or No");
        toy.addCard(addCard);

        //add balloon to order
        addBalloon = JOptionPane.showInputDialog("Would you like a balloon as well? Yes or No");
        toy.addBalloon(addBalloon);


        payTotal += toy.getCost();
        
        System.out.println("The gift for " + childName + toy.toString());

        anotherToy=JOptionPane.showInputDialog("Would you like to purchase another toy? Yes or No");
        
        if(anotherToy.equals("yes")) {
        	continueOrder="yes";
        }

	} 
	   	while (anotherToy.equalsIgnoreCase("yes"));
        
	   //print out user info, cost and order number
        System.out.println("the total cost of your order is "+"$"+twoDecimal.format(payTotal));
        int randomNumber = objGenerator.nextInt(100000);
        System.out.println("You order number is: "+randomNumber);
        System.out.println(programmer);
	  	
	  	}
   }