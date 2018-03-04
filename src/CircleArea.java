import java.lang.Math;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/* This class contain circleArea method which can take radius and calculate area of circle.
* This class also use math class to get the value of pi*/

public class CircleArea{
    public static void circleArea(){

    double PI = Math.PI; //Assigning the value of PI from the Math class.
    System.out.println("Please enter the radius of the Circle.");
    Scanner radiusInput = new Scanner(System.in);
    try{
    double radius = radiusInput.nextDouble();
    double areaCircle = PI * (radius * radius);

    System.out.println("The area of the Circle is "+
                        (new DecimalFormat("##.##").format(areaCircle)) +
                        " square meter.");
    }
    catch (InputMismatchException ime){
        System.out.println("Please enter the value in correct format. Example 5");
    }
    }

}
