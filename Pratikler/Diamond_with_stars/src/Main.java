import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        //top triangle
        for(int i=1; i<=number; i++){
            for(int j=1; j<=(number-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //bottom triangle
        for(int i=1; i<number; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*number-(2*i+1)); k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}