import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;
        System.out.printf("Welcome the Flight Ticket Service !\n Enter the distance with KM type :");
        int distance = scanner.nextInt();
        System.out.print("Enter Your age : ");
        int age = scanner.nextInt();
        System.out.print("Enter your Flight Type (1-> One-way 2-> Round-trip: ");
        int flightType = scanner.nextInt();
        if(distance>0) {
            totalPrice += distance * 0.10;   //per KM = 0.10 we get total price like this way.
        }
        else {
            System.out.println("Wrong Entry !! Exitting"); // pop-up when entry is wrong
            System.exit(0);
        }
        if(age > 0) {
            if(age < 12) {
                totalPrice -= totalPrice * 50/100; // %50 discount for under 12 year age
            }
            else if(age >= 12 && age<= 24) {
                totalPrice -= totalPrice * 10/100; //%10 discount for age between 12-24
            }
            else if(age >= 65) {
                totalPrice -= totalPrice * 30/100; //%30 discount for 65 years old and older customers
            }
        }else {
            System.out.println("Wrong Entry !! Exitting");// pop-up when entry is wrong
            System.exit(0);
        }

        if(flightType == 1 || flightType == 2) {
            if(flightType == 2) {
                totalPrice -= totalPrice * 20/100; //%20 discount for raund-trip customers
                totalPrice *= 2;					//we multiple 2 for it has 2 ticket
            }
        }else {
            System.out.println("Wrong Entry !! Exitting");// pop-up when entry is wrong
            System.exit(0);
        }

        System.out.println("Total price : " + totalPrice + " TL"); //result output
    }
}