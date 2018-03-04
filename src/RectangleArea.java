import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleArea{
    public static void rectangleArea(){

        System.out.println("Please enter the length of the Rectangle.");
        Scanner input = new Scanner(System.in);
        try {
            double length = input.nextDouble();
            System.out.println("Please enter the breadth of the Rectangle.");
            double breadth = input.nextDouble();
            double areaRectangle = length * breadth;

            System.out.println("The area of the Rectangle is " +
                    (new DecimalFormat("##.##").format(areaRectangle)) +
                    " square meter.");
        }
        catch (InputMismatchException ime){
            System.out.println("Please enter the value in correct format. Eg 5");
            rectangleArea();
        }
    }

}
