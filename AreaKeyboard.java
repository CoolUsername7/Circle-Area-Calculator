import java.util.Scanner;

public class AreaKeyboard{
  public static void main(String[] args) {

	  double radius = 0; // Declare radius
	  double area; // Declare area
	  double pi= Math.PI; // Assign value of pi;

	  Scanner keyboard = new Scanner(System.in);

	  // Assing a radius
	  for(int i = 1; i<3; i++)
	  { System.out.print("Enter the radius of the circle ");
	  	radius = keyboard.nextDouble(); // New value is radius



	  	// Compute area
	  	area = radius * radius * pi;
		area = Math.round(area);
	  	// Display results
	  	System.out.println("The area of a circle with the radius of " + radius + " is " + area);

    }
  }
}

