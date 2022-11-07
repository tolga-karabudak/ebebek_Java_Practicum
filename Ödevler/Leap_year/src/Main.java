import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome the Leap Year Calculator \nPlease Enter a year :");
        int year = input.nextInt();
        if (year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if (year % 400 ==0)
                {
                    System.out.printf(year + " is a Leap year !!");
                    System.exit(0);
                }
                else{
                    System.out.printf(year + " is NOT a Leap year !!");
                    System.exit(0);
                }
            }
            System.out.printf(year + " is a Leap year !!");
        }
        else {
            System.out.printf(year + " is NOT a Leap year !!");
        }



    }
}