import java.util.Scanner;

/*This is the main class and will provide an option
* for the user to choose what action user want to
* perform and allow user to choose whether user want to
* calculate area for Square, Triangle, Rectangle, Circle*/

public class CalculateArea {
    public static void main (String[] args){
        String option;
        System.out.println("This application will calculate area.\n" +
                "Please select one of the options to calculate area.\n" +
                "Option     \t Enter    \n" +
                "Circle     \t 1        \n" +
                "Rectangle  \t 2        \n" +
                "Square     \t 3        \n" +
                "Triangle   \t 4        \n" +
                "Exit       \t 5        \n" +
                "Please enter one of the number to select the option\n" +
                " or enter any other value to exit. ");
        Scanner optionScan = new Scanner(System.in);
        option    = optionScan.nextLine();
        try {
            int optionSelection = Integer.parseInt(option);


            System.out.println("You have selected Option:" + optionSelection);

            // use switch to show options to select the required geometry for area calculation.

            switch (optionSelection) {
                case 1:
                    System.out.println("You have selected to calculate area of Circle.");
                    CircleArea.circleArea();
                    break;

                case 2:
                    System.out.println("You have selected to calculate area of Rectangle.");
                    RectangleArea.rectangleArea();
                    break;
                case 3:
                    System.out.println("You have selected to calculate area of Square.");
                    SquareArea.squareArea();
                    break;

                case 4:
                    System.out.println("You have selected to calculate area of Triangle.");
                    TriangleArea.triangleArea();
                    break;

                default:
                    System.out.println("You have selected not to calculate area.\n" +
                            "Thank you for trying out the application");
                    System.exit(0);
                    break;
            }

        }

        catch (NumberFormatException nfe)
        {
            System.out.println("You have entered other than option provided.\n" +
                    "This application is going to close.");
            System.exit(0);
        }

    }

}
