//Programmer Belinda Nguyen

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		char ch='y';
		
		while(ch=='y') {
			Movie movie=new Movie();
			
			System.out.println("Enter the name of the movie : ");
			String title=input.nextLine();
			movie.setTitle(title);//set title
			
			System.out.println("Enter the rating of the movie : ");
			String rating=input.next();
			movie.setRating(rating);//set rating
			
			System.out.println("Enter the number of tickets sold for this movie : ");
			int n=input.nextInt();
			movie.setSoldTickets(n);//set number of tickets
			
			System.out.println(movie.toString());
			System.out.println("Do you want to enter another ?(y or n)");
			ch=input.next().charAt(0);
			input.nextLine();//to put in a break/next line
		}
		System.out.println("Goodbye!");

   }
}



