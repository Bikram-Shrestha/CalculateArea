import java.util.Scanner;
/*This is the main class and will provide an option
* for the user to choose what action user want to
* perform and allow user to choose whether user want to
* calculate area for Square, Triangle, Rectangle, Circle*/

public class CalculateArea {
    public static void main (String[] args){
        int optionSelection;
        System.out.println("This application will calculate area.\n" +
                "Please select one of the options to calculate area.\n" +
                "Option     \t Enter    \n" +
                "Circle     \t 1        \n" +
                "Rectangle  \t 2        \n" +
                "Square     \t 3        \n" +
                "Triangle   \t 4        \n" +
                "Please enter one of the number to select the option\n" +
                " or enter any other value to exit. ");
        Scanner optionScan = new Scanner(System.in);
        optionSelection    = optionScan.nextInt();



    }

}
