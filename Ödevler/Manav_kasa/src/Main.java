import java.util.ArrayList;
import java.util.Scanner;
/*Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0, generalTotal = 0;
        int kg = 0;

        String[] fruits = new String[]{"Armut", "Elma", "Domates", "Muz", "Patlıcam"};//string that implements fruits and vagies name
        double[] prices = {2.14, 3.67, 1.11, 0.95, 5.00};//string that implements prices value

        for (int i=0; i< fruits.length; i++)
        {
            System.out.printf(fruits[i] + " Kaç Kilo? : ");
            kg = input.nextInt();
            total = kg * prices[i];
            generalTotal +=total;

        }
        System.out.printf("Toplam Tutar : "+generalTotal);

    }
}