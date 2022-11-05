package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double height = input.nextDouble(); // input height
        System.out.print("Lütfen kilonuzu giriniz : ");
        double mass = input.nextDouble();// input mass

        double endex = mass / (height * height);// formula

        System.out.printf("Vücut kitle endeksiniz : " + endex); // output

    }
}