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
            //use of printf for formatting double into two decimal point.
            System.out.printf("The area of the Rectangle is %.2f square meter.", areaRectangle);
        }
        catch (InputMismatchException ime){
            System.out.println("Please enter the value in correct format. Eg 5");
            rectangleArea();
        }
    }

}
