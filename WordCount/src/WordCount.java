
import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class WordCount {

    /*
        Burada kritik nokta ana metodumuz içinde File sınıfı ile birlikte ilgili dosyayı belirdik
        Belirnen dosya ya yoksa ?
        Yada satır sayısı çok fazla ise ?

        gibi problemler oluştuğundan EXCEPTION olabilir.

        Ana metodumuzun EXCEPTION atacağını belirlememiz gerekir.

     */
    public static void main(String[] args) throws Exception {
        File file = new File("pg.txt");
        Scanner scanner = new Scanner(file);

        int wordCount = 0;
        
        while(scanner.hasNextLine()){ // burası true yada false döndürecek(hasNextLine). false olana kadar satır satır okuma sağlayacağız.

            // her satırın içeriğine bakmak gerekiyor.
            String line = scanner.nextLine();
            // boşluklara bölecek ve length uzunluğunu verecek. ( Bölünmüş değerlerin )

           //  System.out.println(line.split(" ").length);
            wordCount = line.split(" ").length;


        }

        System.out.println("Word Count = "+ wordCount);

    }

}
