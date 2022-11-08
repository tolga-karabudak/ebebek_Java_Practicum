import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.printf("Enter a value : ");
            number = input.nextInt();

            if (number % 4 == 0    ){
                total += number;
            }
        }while (number % 2 == 0); //All 4's multiples are even so that will be enough.
        System.out.printf("Result = :" + total);
    }
}