import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yaricapini girin: ");
        int yaricap = input.nextInt();
        double alan = pi * yaricap * yaricap;
        double cevre = 2 * pi * yaricap;
        System.out.println("Cevresi: " + cevre + "\nAlanı : " + alan );

        System.out.println("Merkez acisini girin : ");
        double aci =input.nextDouble();

        double alan1 = (pi*(yaricap * yaricap) * aci) / 360;
        System.out.println("Merkez açıyla alan hesabı: " + alan1);

    }
}