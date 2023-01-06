public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze spłata swoje długi";
        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu: " + str.length());
        System.out.println("Znak na pozycji 6: " + str.charAt(6));
        System.out.println("Fragment tekstu od znaku nr 10 do 16 " + str.substring(10,16));
        System.out.println("Zwraca indeks pierwszej litery 't' " + str.indexOf('t'));
        System.out.println("Indeks początku podtekstu: \"długi\": " + str.indexOf("długi"));
        System.out.println("Tekst wielkimi literami: " + str.toUpperCase());


    }
}
