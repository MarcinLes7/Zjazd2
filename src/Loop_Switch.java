public class Loop_Switch {
    public static void main(String[] args) {
        // instrukcja switch działana takich typach:
        // byte i Byte
        // short i Short
        // int i Integer
        // car i Character
        // enum
        // String

        // instrukcja wystawiająca odpowiedni opis do oceny


        char grade = 'A';

        switch(grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'D':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Rozważ oszukiwanie");

        }



    }
}
