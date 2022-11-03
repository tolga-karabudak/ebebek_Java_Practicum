/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kdv_hesaplama;

import java.util.Scanner;

/**
 *
 * @author https://app.patika.dev/tolgahankarabudak
 * 
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
public class Kdv_hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Para degerini giriniz : ");
        double para = input.nextDouble();
        double kdv = 0;
        double kdvli = 0;
        
        if (para > 0 && para <= 1000)
        {
            kdv = 0.18;
            kdvli = para +(para*kdv);
        }
        if (para > 1000)
        {
            kdv = 0.08;
            kdvli = para +(para*kdv);
        }
        
        System.out.println("KDV'siz Fiyat : "+para);
        System.out.println("KDV'li Fiyat :"+kdvli);
        System.out.println("KDV tutari: :"+ kdv);
        
        
        
        
    }
    
}
