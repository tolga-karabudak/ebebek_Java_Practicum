import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        System.out.print("Enter a number :");
        int number = input.nextInt();
        temp = number;
        int basValue,basSum=0;

        while(number != 0){
            basValue = number % 10;
            basSum += basValue;
            number /= 10;
        }
        System.out.println("Sum of digits of "+ temp + " are :"+basSum);
    }
}