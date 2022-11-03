/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package not_ortalamasi;

import java.util.Scanner;

/**
 *
 * @author https://app.patika.dev/tolgahankarabudak
 */
public class Not_ortalamasi {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);


        System.out.println("Matematik notu (0 - 100) : ");
        double mat = input.nextDouble();
        while (mat < 0 || mat >100)
        {
            System.out.println("Gecersiz not lutfen gecerli not girin !!!");
            mat = input.nextDouble();
        }

        System.out.println("Fizik notu (0 - 100) : ");
        double fizik = input.nextDouble();
        while (fizik < 0 || fizik >100)
        {
            System.out.println("Gecersiz not lutfen gecerli not girin !!!");
            fizik = input.nextDouble();
        }

        System.out.println("Kimya notu (0 - 100) : ");
        double kimya = input.nextDouble();
        while (kimya < 0 || kimya >100)
        {
            System.out.println("Gecersiz not lutfen gecerli not girin !!!");
            kimya = input.nextDouble();
        }
        
        System.out.println("Turkce notu (0 - 100) : ");
        double turkce = input.nextDouble();
        while (turkce < 0 || turkce >100)
        {
            System.out.println("Gecersiz not lutfen gecerli not girin !!!");
            turkce = input.nextDouble();
        }
        
        System.out.println("Tarih notu (0 - 100) : ");
        double tarih = input.nextDouble();
        while (tarih < 0 || tarih >100)
        {
            System.out.println("Gecersiz not lutfen gecerli not girin !!!");
            tarih = input.nextDouble();
        }
        
        System.out.println("Muzik notu (0 - 100) : ");
        double muzik = input.nextDouble();
        while (muzik < 0 || muzik >100)
        {
            System.out.println("Gecersiz not lutfen gecerli not girin !!!");
            muzik = input.nextDouble();
        }
        
        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) /6;
        String gecmedurumu = ortalama > 60 ? "Sinifi gecti" :  "Sinifta kaldi";
        System.out.println("Ortalama : " +ortalama);
        System.out.println("Gecme Durumu : "+ gecmedurumu);
    }
    
}
