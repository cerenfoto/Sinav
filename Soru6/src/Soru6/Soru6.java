package Soru6;

public final class Soru6 {

    public static void sifirsayisi(int[] a) {
        int[] sifirlidiziler = new int[a.length];
        int sayici = 0, sayi = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == 0) {
                    sayici++;
                } else if (a[i] == 1 && sayici > 0) {
                    sifirlidiziler[sayi] = sayici;
                    sayici = 0;
                    sayi++;
                }
                System.out.println(" " + a[i] + " ");
            }
        }
        sifirSayisi(sifirlidiziler);
    }

    private static void sifirSayisi(int[] sifirliAltDiziler) {
        int buyuk = 0;
        for (int i = 0; i < sifirliAltDiziler.length; i++) {
            if (sifirliAltDiziler[i] > buyuk) {
                buyuk = sifirliAltDiziler[i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Sıfır sayısı " + buyuk);

    }

    public static void main(String[] args) {
        int[] dizi = new int[]{0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0};
        sifirsayisi(dizi);
    }
}
