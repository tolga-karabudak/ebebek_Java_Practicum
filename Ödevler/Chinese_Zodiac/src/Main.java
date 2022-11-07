import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome the Chinese Zodiac Calculator !!\nEnter your birth Year : ");
        int birth = input.nextInt();
        int zodiac = birth % 12;

        switch (zodiac){
            case 0:
                System.out.printf("Your Chinese Zodiac is : Monkey");
                break;
            case 1:
                System.out.printf("Your Chinese Zodiac is : Rooster");
                break;
            case 2:
                System.out.printf("Your Chinese Zodiac is : Dog");
                break;
            case 3:
                System.out.printf("Your Chinese Zodiac is : Pig");
                break;
            case 4:
                System.out.printf("Your Chinese Zodiac is : Mice");
                break;
            case 5:
                System.out.printf("Your Chinese Zodiac is : Ox");
                break;
            case 6:
                System.out.printf("Your Chinese Zodiac is : Tiger");
                break;
            case 7:
                System.out.printf("Your Chinese Zodiac is : Rabbit");
                break;
            case 8:
                System.out.printf("Your Chinese Zodiac is : Dragon");
                break;
            case 9:
                System.out.printf("Your Chinese Zodiac is : Snake");
                break;
            case 10:
                System.out.printf("Your Chinese Zodiac is : Horse");
                break;
            case 11:
                System.out.printf("Your Chinese Zodiac is : Sheep");
                break;
        }
    }
}