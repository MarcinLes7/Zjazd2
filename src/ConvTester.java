public class ConvTester {
    public static void main(String[] args) {
/*        Integer firstPrice = 234;
        Integer secondPrice = 178;

        System.out.println(Math.max(firstPrice, secondPrice)); // w przypadku w którym zamianst typow podstawowych np int daliśmy typ obiektowy
        // Integer to i tak zadziałao sprawdzenie która jest większa z  tego powodu, że nastapiła konwersja unboxing rozpakowanie automatyczne
        // oraz automatyczna konwersja - nie trzeba robić rzutowania */

 /*       byte a = 7;
        short b;
        int c;

        c = a; // zachodzi konwersja niejawna - do integera wsadzam shorta - mieści się więc jest ok
        // b = c; // tak się nie da, bo do shorta wsadzam inta i jest on za duży - musze zrobic jawna konwersję
        b = (short) c; // to jest jawna konwersja czyli rzutowanie.Zmieniam inta na short i wsadzam do shorta*/

        int a = 5;
        double b = 13.5;
        // double c = b/a; // tu wszystko działa bo konwersja niejawna, a zostało zamienione w inta na doubla i jest ok bo nie straciło przecyzji

      /*  int c = b/a; // tu się nie da bo dzielimy doubla przez inta i dostajemy doubla i chcemy go wepchać do intaa - wówczas spracimy
        // precyzję - wówczas trzeba zastosowac konwersję jawna rzutowania - jeżeli się oczywiście na to godziny*/

        int c = ((int) b) / a; // tu robimy konwersję jawną rzutowania ale racimy precyzję





    }
}
