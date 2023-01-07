public class Bloki {
    public static void main(String[] args) {
        int x = 5;
        { // początek bloku
            int y = 10; // ta zmienna lokalna jest widoczna tylko w tym bloku
            y = x + y;
        } // koniec bloku
//        System.out.println(y); // brak zasięgu y
    }
}
