/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dik_ucgen_hipotenus;

import java.util.Scanner;

/**
 *
 * @author tolga https://app.patika.dev/tolgahankarabudak

 */
public class Dik_ucgen_hipotenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk kenarin uzunlugunu girin: ");
        double a = input.nextDouble();
        System.out.println("Ikinci kenarin uzunlugunu girin: ");
        double b = input.nextDouble();
        System.out.println("Ucuncu kenarin uzunlugunu girin");;
        double c = input.nextDouble();
        
        double alan = 0;
        double u =(a+b+c)/2;
 
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        
        System.out.println("Alan : "+alan);
    }
    
}
