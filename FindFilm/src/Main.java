import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {


        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        int filmSiraNo = (int) (Math.random() * 25) + 1;
        int sayac = 0;
        String[] asilKelime = new String[200];
        int toplamPuan = 100;


        while (scanner.hasNextLine()) {


            String line = scanner.nextLine();


            sayac += 1;

            if (sayac == filmSiraNo) {


                line = line.replace(" ", "");
                asilKelime[0] = line;


                for (int i = 0; i < line.length(); i++) {


                    line = line.replace(line.charAt(i), '_');


                }

                System.out.println(line);
                System.out.println(asilKelime[0]);

                while (true) {

                    Scanner scanner1 = new Scanner(System.in);

                    //  System.out.println(asilKelime[0]);
                    System.out.println("Lütfen bir harf giriniz");
                    String girilenHarf = scanner1.next();
                    int kontrol = 0;

                    kontrol = asilKelime[0].indexOf(girilenHarf);

                    char bulunanHarf = 0;
                    try {

                        bulunanHarf = asilKelime[0].charAt(kontrol);


                    } catch (StringIndexOutOfBoundsException e) {

                        System.out.println("Böyle bir harf yok " + girilenHarf);
                        System.out.println("------------------------");
                        toplamPuan -= 20;
                    }


                    int sonDurum = line.indexOf('_');

                    if (sonDurum == -1) {

                        System.out.println("Tebrikler Kazandınız ! ");
                        System.out.println("------------------------");
                        System.out.println("Puanınız : " + toplamPuan);
                        System.out.println("------------------------");
                        break;


                    }


                    if (toplamPuan == 0) {

                        System.out.println("Oyun bitti");
                        System.out.println("------------------------");
                        break;
                    }


                    if (kontrol != -1) {
                        for (int k = 0; k < line.length(); k++) {


                            if (asilKelime[0].charAt(k) == bulunanHarf) {


                                char[] kelimeChar = line.toCharArray();
                                kelimeChar[k] = bulunanHarf;

                                line = String.valueOf(kelimeChar);


                            }

                        }
                    }

                    if (toplamPuan < 0) {

                        System.out.println("Kaybettiniz Kalan Puan 0");

                    }

                    System.out.println("Kalan puan " + toplamPuan);


                    System.out.println(line);

                }


            }


        }


    }


}
