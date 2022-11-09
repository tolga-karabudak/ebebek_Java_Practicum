import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, k, i, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = input.nextInt();
        System.out.print("Enter the Power : ");
        k = input.nextInt();

        for (i = 1; i <= k; i++) {
            total *= n;
            if(i < k){
                continue;
            }else{
                System.out.println("Result : " + total);
            }

        }
    }
}