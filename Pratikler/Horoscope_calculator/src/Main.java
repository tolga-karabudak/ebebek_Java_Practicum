import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.printf("Welcome the Horoscope Calculator !\nPlease type your birth MONTH : ");
        int month = input.nextInt();
        System.out.printf("Please type your birth DAY : ");
        int day = input.nextInt();

        if (month == 1)
        {
            if (day <=21)
                System.out.printf("You are a Capricorn !");
            if(day >=22)
                System.out.printf("You are a Aquarius !");
        }
        if (month == 2)
        {
            if (day <= 19)
                System.out.printf("You are a Aquarius !");
            if(day >= 20)
                System.out.printf("You are a Pisces !");
        }
        if (month == 3)
        {
            if (day <= 20)
                System.out.printf("You are a Pisces !");
            if (day >= 21)
                System.out.printf("You are a Aries !");
        }
        if (month == 4)
        {
            if(day >= 21)
                System.out.printf("You are a Taurus");
            if (day <= 20)
                System.out.printf("You are a Aries !");
        }
        if (month == 5)
        {
            if (day <= 21)
                System.out.printf("You are a Taurus !");
            if (day >= 22)
                System.out.printf("You are a Gemini !");
        }
        if (month == 6)
        {
            if (day <=22)
                System.out.printf("You are a Gemini !");
            if (day >= 23)
                System.out.printf("You are a Cancer !");
        }
        if (month == 7)
        {
            if (day <=22)
                System.out.printf("You are a Cancer !");
            if (day >= 23)
                System.out.printf("You are a Leo !");
        }
        if (month == 8)
        {
            if (day <= 22)
                System.out.printf("You are a Leo !");
            if (day >= 23)
                System.out.printf("You are a Virgo !");
        }
        if (month == 9)
        {
            if (day <= 22)
                System.out.printf("You are a Virgo !");
            if (day >= 23)
                System.out.printf("You are a Libra !");
        }
        if (month == 10)
        {
            if (day <=22)
                System.out.printf("You are a Libra !");
            if (day >= 23)
                System.out.printf("You are a Scorpio !");
        }
        if (month == 11)
        {
            if (day <= 21)
                System.out.printf("You are a Scorpio !");
            if (day >= 22)
                System.out.printf("You are a Sagittarius !");
        }
        if (month == 12)
        {
            if (day <= 21)
                System.out.printf("You are a Sagittarius !");
            if (day >= 22)
                System.out.printf("You are a Capricorn !");
        }

    }
}