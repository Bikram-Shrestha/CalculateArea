import java.util.Scanner;

public class UserOption {

    public static void userOption() {
        String option;
        //Option menu for the user
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
        option = optionScan.nextLine();
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
        //If the user input something else then the following action will be triggered.
        // Exit from the application
        catch (NumberFormatException nfe) {
            System.out.println("You have entered other than option provided.\n" +
                    "This application is going to reopen.");
            userOption();
        }
    }
}