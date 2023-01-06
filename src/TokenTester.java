import java.awt.*;
import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {
        /*Object obj = new Object();  //deklaruje zmienna i inicjaizacja czyli definicja
        String name = new String("Michael Jordan"); // tworzymy obiekt typu String, ktory inicjalizujemy wartością typu Michael Jordan
        Point pt = new Point(0,0); // utworzył się obiekt w pamięci i referencja do tego objektu jest zapisana w zmiennej pt
        */
        StringTokenizer str1, str2;

        String quote1 = "GOOG 530,80 -9,98";
        str1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + str1.nextToken());
        System.out.println("Token 2: " + str1.nextToken());
        System.out.println("Token 3: " + str1.nextToken());

        System.out.println("-------");

        String quote2 = "RTH@75,00@0,22";
        str2 = new StringTokenizer(quote2, "@");
        System.out.println("Token 1: " + str2.nextToken());
        System.out.println("Token 2: " + str2.nextToken());
        System.out.println("Token 3: " + str2.nextToken());


    }
}
