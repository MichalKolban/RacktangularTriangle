package RacktangularTriangle;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        double sizeOne;
        double sizeTwo;
        double sizeThree;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program will check if this is Racktangular Triangle");
        System.out.println("Enter first length :");

        sizeOne = scanner.nextDouble();

        System.out.println("Enter secound length :");

        sizeTwo = scanner.nextDouble();

        System.out.println("Enter third length:");

        sizeThree = scanner.nextDouble();

        System.out.println("Your lengths are  | One - " + sizeOne + " | Two - " + sizeTwo + " | Three - " + sizeThree);
        System.out.println();

        if(sizeOne + sizeTwo > sizeThree && sizeOne + sizeThree > sizeTwo && sizeTwo + sizeThree > sizeOne ){
            System.out.println("Congratulations yours triangle is racktangular !");
        }
        else{
            System.out.println("Sorry ;/ i can't make racktangular triangle with this lengths");
        }
    }
}
