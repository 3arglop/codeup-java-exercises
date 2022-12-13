import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        String name = "Thor";
        System.out.printf("Hello there, %s. Nice to see you.%n", name);

        String greeting = "Bonjour";
        System.out.printf("%s, %s! %n", greeting, name);

        String askOnDate = "Would you like to grab dinner with me tonight?";
        System.out.printf("%s, %s! %s %n", greeting, name, askOnDate);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        double pi = 3.14159;
        System.out.println(pi);

        System.out.format("The value of pi is approximately %.2f. %n", pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//        System.out.println("This is your number: " + userInput);



//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Three Words: ");
//        String valueOne = scanner.next();
//        String valueTwo = scanner.next();
//        String valueThree = scanner.next();
//        System.out.println("These are your three words: " + valueOne + " " + valueTwo + " " + valueThree);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of your room?");
//        double userLength = Double.parseDouble(scanner.nextLine());
        int userLength = scanner.nextInt();
        System.out.println("What is the width of your room?");
//        double userWidth = Double.parseDouble(scanner.nextLine());
        int userWidth = scanner.nextInt();

        double l = userLength;
        double w = userWidth;
        double area = l * w;
        double perimeter = (2 * l) + (2 * w);

        System.out.println("The area of your room is " + area + " and the perimeter of your room is " + perimeter);




    }
}
