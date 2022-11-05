import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1,n2,result = 0;
        int choise;
        System.out.printf("Please type first number :");
        n1 = input.nextDouble();
        System.out.printf("Please type second number :");
        n2 = input.nextDouble();
        System.out.println("Please make a choise \n1. Adding\n2. Extraction\n3. Multiply\n4. Division");
        choise = input.nextInt();

        switch (choise) {
            case 1:
                result = n1 + n2;
                System.out.println("Result is: " + result);
                break;
            case 2:
                result = (n1-n2);
                System.out.println("Result is: " + result);
                break;
            case 3:
                result = n1*n2;
                System.out.println("Result is: " + result);
                break;
            case 4:
                result = n1/n2;
                System.out.println("Result is: " + result);
                break;
            case 5:
                System.out.println("Exited !!");
                break;
        }

    }
}