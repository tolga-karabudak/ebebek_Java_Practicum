import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double harm = 0, unit = 0;

        System.out.printf("Enter a number : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            unit = (1.0 / i);
            harm += unit;
        }

        System.out.println("Hormonic number is : "+ harm);
    }
}
