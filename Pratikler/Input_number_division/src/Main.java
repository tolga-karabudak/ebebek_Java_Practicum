import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double counter = 0;
        double value;
        double totalValue = 0;
        System.out.printf("Welcome the calculator\nFirst of all if we want a common devider for 4 and 3 its should be 12 !!\n");
        System.out.printf("Enter any number for calculation : ");
        value = input.nextDouble();

        for (double i = 1; i<=value; i++)
        {
            if (i % 12 ==0)
            {
                totalValue += i;
                counter++;
            }
        }
        System.out.printf("Avarage of 3 and 4's divide number : " + totalValue / counter);





    }
}