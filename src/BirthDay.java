import java.util.StringTokenizer;

public class BirthDay {
    public static void main(String[] args) {
        String birtday = "19/04/2016";

        String day = birtday.substring(0,2);
        System.out.println("day: " + day);

        String month = birtday.substring(3,5);
        System.out.println("month: " + month);

        String year = birtday.substring(6,10);
        System.out.println("year: " + year);

        System.out.println("---------------");

        // podejście z użyciem klasy StringTokenizer

        StringTokenizer st = new StringTokenizer(birtday, "/");
        System.out.println("day: " + st.nextToken());
        System.out.println("month: " + st.nextToken());
        System.out.println("year: " + st.nextToken());


    }
}
