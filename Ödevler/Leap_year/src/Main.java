import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome the Leap Year Calculator \nPlease Enter a year :");
        int year = input.nextInt(); // Geting input
        if (year % 4 == 0) //condition first that year must be divided 4.
        {
            if(year % 100 == 0)//if that year may divide 100 also another condition created.
            {
                if (year % 400 ==0)//if that year devide 400 also that year is leap year.
                {
                    System.out.printf(year + " is a Leap year !!");
                    System.exit(0);
                }
                else{
                    System.out.printf(year + " is NOT a Leap year !!");//if year can devide 100 and canot devide 400 its not a leap year.
                    System.exit(0);
                }
            }
            System.out.printf(year + " is a Leap year !!");//condition first that year must be divided 4.
        }
        else {
            System.out.printf(year + " is NOT a Leap year !!");// this year cannot divide 4.
        }



    }
}