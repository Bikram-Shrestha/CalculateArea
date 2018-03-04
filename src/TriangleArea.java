import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleArea{
    public static void triangleArea(){

        System.out.println("Please enter the breadth of the Triangle.");
        Scanner input = new Scanner(System.in);
        try {
            double breadth = input.nextDouble();
            System.out.println("Please enter the height of the Triangle");
            double height = input.nextDouble();


            double areaTriangle = .5 * (breadth * height);

            System.out.println("The area of the Triangle is " +
                    (new DecimalFormat("##.##").format(areaTriangle)) +
                    " square meter.");
        }
        catch (InputMismatchException ime){
            System.out.println("Please enter the value in correct format. Eg 5");
            triangleArea();
        }
    }

}
