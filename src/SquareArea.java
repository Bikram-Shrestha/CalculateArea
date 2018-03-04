import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareArea{
    public static void squareArea(){
        System.out.println("Please enter the length of the square.");
        Scanner lengthInput = new Scanner(System.in);
        try{
            double length       = lengthInput.nextDouble();
            double areaSquare   = length * length;

            System.out.println("The area of the Square is "+
                    (new DecimalFormat("##.##").format(areaSquare)) +
                    " square meter.");
        }

        catch (InputMismatchException ime){
            System.out.println("Please enter the value in correct format. Eg 5");
            squareArea();
        }

    }

}
