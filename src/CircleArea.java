import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleArea{
    public static void circleArea(){

    double pi = Math.PI;
    System.out.println("Please enter the radius of the Circle.");
    Scanner radiusInput = new Scanner(System.in);
    double radius = radiusInput.nextDouble();
    double areaCircle = pi * (radius * radius);

    System.out.println("The area of the Circle is "+
                        (new DecimalFormat("##.##").format(areaCircle)) +
                        " square meter.");
    }

}
