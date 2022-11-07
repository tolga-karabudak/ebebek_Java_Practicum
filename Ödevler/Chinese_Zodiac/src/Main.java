import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome the Chinese Zodiac Calculator !!\nEnter your birth Year : ");
        int birth = input.nextInt(); //getting input
        int zodiac = birth % 12; //zodiac can be found in that formula and ready to switch case to print which zodiac are you.

        switch (zodiac){
            case 0:
                System.out.printf("Your Chinese Zodiac is : Monkey"); // output your zodiac for that condition
                break;
            case 1:
                System.out.printf("Your Chinese Zodiac is : Rooster");// output your zodiac for that condition
                break;
            case 2:
                System.out.printf("Your Chinese Zodiac is : Dog");// output your zodiac for that condition
                break;
            case 3:
                System.out.printf("Your Chinese Zodiac is : Pig");// output your zodiac for that condition
                break;
            case 4:
                System.out.printf("Your Chinese Zodiac is : Mice");// output your zodiac for that condition
                break;
            case 5:
                System.out.printf("Your Chinese Zodiac is : Ox");// output your zodiac for that condition
                break;
            case 6:
                System.out.printf("Your Chinese Zodiac is : Tiger");// output your zodiac for that condition
                break;
            case 7:
                System.out.printf("Your Chinese Zodiac is : Rabbit");// output your zodiac for that condition
                break;
            case 8:
                System.out.printf("Your Chinese Zodiac is : Dragon");// output your zodiac for that condition
                break;
            case 9:
                System.out.printf("Your Chinese Zodiac is : Snake");// output your zodiac for that condition
                break;
            case 10:
                System.out.printf("Your Chinese Zodiac is : Horse");// output your zodiac for that condition
                break;
            case 11:
                System.out.printf("Your Chinese Zodiac is : Sheep");// output your zodiac for that condition
                break;
        }
    }
}