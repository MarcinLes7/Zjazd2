public class EqualsTester {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Ale to się rozrasta"; // wskazuje na miejsce w pamięci gdzie jest zapisane ale jak to się rozrasata
        str2 = str1;
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2)); // to jest ten sam obiekt
        System.out.println("Ta sama wartość ? " + (str1.equals(str2)));

        System.out.println("----------------");

        str2 = new String(str1);  // ae tu stworzylismy nowy obiekt w pamieci z nowym naapisem itp
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2)); // a to nie jest teraz ten sam obiekt bo operator new zaalokował pamięć na nowy String
        System.out.println("Ta sama wartość? " + (str1.equals(str2))); // to jest metoda do sprawdzenia czy to jest ta sama wartośc

        // Wniosek jest takie, że jak porównujemy dwa stringi to musimy to robic za pomoca equals ale nie za pomocą == bo == porównuje czy to jest ten sam obiekt
        // a equal porównuje zawartość. To samo się dotyczy porównywania dwóch Integerów z wielkiej litery


    }
}
