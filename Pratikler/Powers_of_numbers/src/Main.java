import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Border Number:");
        int num = input.nextInt();

        System.out.print( num+ " is a border number for FOUR\n");
        for (int i=1; i<=num; i*=4){
            System.out.print(i + "   ");
        }
        System.out.printf("\n");

        System.out.print( num+ "is a border number for FIVE \n");
        for (int i=1; i<=num; i*=5){
            System.out.print(i + "   ");
        }
    }
}