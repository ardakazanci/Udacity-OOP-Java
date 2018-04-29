

import java.util.Scanner;

public class NumberGame {

    // Bu örnekte ikili arama algoritması kullanarak hile yapabiliriz :)
    // 50 den başlayıp fazla veya az ise yarısını vererek rahat rahat çözebiliriz.
    // Farklı değer girmelerini engelleyebiliriz.


    public static void main(String[] args) {

        /*
            Math.random(); NŞA ' da 0.0 ile 1.0 arasında double sayı döndürür.
            x 10 ile çarparak 0 ile 10 arasında sayı döndürmesini sağlarız
            x 100 ile çarparak 0 ile 100 arasında sayı döndürmesini sağlarız.
            x 1000 ile çarparak 0 ile 10000 arasında sayı döndürmesini sağlarız.

            + 1 diyerek 1 ' den başlamasını sağlarız.
            İşlem önceliği için parantez kullanırız.

         */
        boolean kontrol = false;
        Scanner scanner = new Scanner(System.in);
        int rastgeleSayi = (int) (Math.random() * 100) + 1;
        System.out.println("1 ile 100 arasında rastgele sayı sakladım.");
        System.out.println("Umarım bulabilirsin. Bol şans!");


        for (int i = 10; i > 0; i--) {

            System.out.println("Kalan hakkın" + i + " tekrar dene ! ");
            int girilenSayi = scanner.nextInt();


            if(rastgeleSayi > girilenSayi){
                System.out.println("Girdiğiniz sayıdan daha büyük bir sayı...");
            }
            if(rastgeleSayi < girilenSayi){
                System.out.println("Girdiğiniz sayıdan daha küçük bir sayı...");
            }

            if(rastgeleSayi == girilenSayi){
                kontrol = true;
                break;
            }


            //System.out.println("Girilen Sayı "+ girilenSayi);

        }


        if(kontrol == true){
            System.out.println("Kazandın ! ");

        }else{
            System.out.println("Kaybettin !");
            System.out.println("Sayı = "+ rastgeleSayi+ " idi.");
        }

    }

}
