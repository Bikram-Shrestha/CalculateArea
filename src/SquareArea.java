import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareArea{
    public static void squareArea(){
        System.out.println("Please enter the length of the square.");
        Scanner lengthInput = new Scanner(System.in);
        double length       = lengthInput.nextDouble();
        double areaSquare   = length * length;

        System.out.println("The area of the Square is "+
                (new DecimalFormat("##.##").format(areaSquare)) +
                " square meter.");
    }

}
