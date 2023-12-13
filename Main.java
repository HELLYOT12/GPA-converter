import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        try {
            while (flag) {
                displayMenu();
                int userChoice = scanner.nextInt();

                switch (userChoice) {
                    case 1:
                        System.out.println("Enter percentage");
                        double percentage = scanner.nextDouble();
                        System.out.println("Your GPA is: " + convertFromPercentage(percentage) + "\n");
                        break;
                    case 2:
                        System.out.println("Enter GPA");
                        double gpa = scanner.nextDouble();
                        System.out.println("Your percentage is: %" + convertFromGPA(gpa) + "\n");
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("Wrong input");
                }
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number.");
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Press 1 for convert from percentage to GPA");
        System.out.println("Press 2 for convert from GPA to percentage");
        System.out.println("Press 3 To exit");
    }

    public static double convertFromPercentage(double percentage) {
        if (percentage > 100) {
            System.out.println("Wrong Percentage\n");
            return 0;
        }
        return (percentage / 100) * 4;
    }

    public static double convertFromGPA(double gpa) {
        if (gpa > 4.0) {
            System.out.println("Wrong GPA");
            return 0;
        }

        return (gpa * 100) / 4;
    }
}
