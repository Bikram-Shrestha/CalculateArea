import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea{
    public static void triangleArea(){

        System.out.println("Please enter the breadth of the Triangle.");
        Scanner input = new Scanner(System.in);
        double breadth = input.nextDouble();
        System.out.println("Please enter the height of the Triangle");
        double height = input.nextDouble();


        double areaTriangle = .5 * (breadth * height);

        System.out.println("The area of the Triangle is "+
                (new DecimalFormat("##.##").format(areaTriangle)) +
                " square meter.");
    }

}
