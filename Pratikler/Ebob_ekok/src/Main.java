import java.util.Scanner;
/**
 * EBOB
 */
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        boolean a = false;
        do {
            System.out.print("Enter a first number : ");
            n1 = input.nextInt();
            System.out.print("Enter a second number : ");
            n2 = input.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("Please enter a positive numbers !");
            } else {
                a = true;
            }
        } while (!a);
        if (n2 < n1) {
            int tempN2 = n2;
            n2 = n1;
            n1 = tempN2;
        }
        int i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("Ebob : " + i);
                break;
            } else {
                i--;
            }
        }
        int j = n2;
        while (j <= (n1 * n2)) {
            if ((j % n1 == 0) && (j % n2 == 0)) {
                System.out.println("Ekok : " + j);
                break;
            } else {
                j++;
            }
        }
    }
}