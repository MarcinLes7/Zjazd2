import java.util.StringTokenizer;

public class BirthToken {
    public static void main(String[] args) {
        StringTokenizer urodziny;
        String data = "29/04/2016";
        urodziny = new StringTokenizer(data, "/");
        System.out.println("Dzien " + urodziny.nextToken());
        System.out.println("Miesiac " + urodziny.nextToken());
        System.out.println("Rok " + urodziny.nextToken());

        // lub inaczej
        StringTokenizer imieniny = new StringTokenizer(data, "/");
        System.out.println("dzień " + imieniny.nextToken());
        System.out.println("miesiąc " + imieniny.nextToken());
        System.out.println("rok " + imieniny.nextToken());


    }
}
