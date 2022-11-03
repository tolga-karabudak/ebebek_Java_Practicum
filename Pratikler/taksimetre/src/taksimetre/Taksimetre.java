/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taksimetre;

import java.util.Scanner;

/**
 *
 * @author tolga https://app.patika.dev/tolgahankarabudak
 */
public class Taksimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int km;
        double perkm = 2.20, toplam, minprice = 10;
        
        System.out.println("Kac km yol aldiniz ? :");
        km = input.nextInt();
        
        toplam = (km*perkm);
        toplam = toplam +  minprice;
        
        if (toplam < 20)
            System.out.println("Odeyeceginiz tutar: 20");
        else
            System.out.println("Odeyeceginiz tutar : "+toplam);
        
    }
    
}
