import java.util.Locale;

public class TextFormat {
    public static void main(String[] args) {
        int accountBalance = 15005; // mamy tką kwotę i chcemy to ładnie wyswietlić
        System.out.println(accountBalance); // tojest zwykłe wyświetlenie
        System.out.printf("Saldo: %,d zł%n", accountBalance); // po przecinku wyświetlamy liczbę dziesiętną d-to decimal liczba, %n nowa linia

        // jakie w tej metodzie sa parametry?
        // %[flags - czyli nieobowiązkowe][width][.precision]conversion-character
        // s - strings
        // d - decimal integers
        // f - floating points numbers
        // t - date / time
        // n - new line
        // bB - booleans

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.11f%n", pi); // 11 znaków po przecienku i nowa linia %n
        System.out.printf(new Locale("us"), "%.6f%n", pi);






    }
}
