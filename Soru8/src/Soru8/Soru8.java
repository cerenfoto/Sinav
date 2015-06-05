package Soru8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sinarik
 */
public class Soru8 {

    public static void main(String[] args) {
        int boyut = 100;
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int[] dizi = new int[boyut];
        int sayi = 0;
        System.out.println("Kac sayi istiyorsunuz? :");
        sayi = scan.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i >= boyut) {
           dizi = dizibuyut(dizi);
           boyut=dizi.length;
        }
            dizi[i] = rnd.nextInt(1000);
            System.out.print(dizi[i] + "-");
        }
    }

    public static int[] dizibuyut(int[] dizi) {
        int kapasite = dizi.length;
        kapasite *= 2;
        int[] yenidizi = new int[kapasite];
        for (int i = 0; i < dizi.length; i++) {
            yenidizi[i] = dizi[i];
        }
        System.out.println("\nKapasite Arttirildi.");
        System.out.println("Kapasite : " + kapasite);
        return yenidizi;
    }
}
