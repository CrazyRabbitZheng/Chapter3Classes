/**
 * This class plays with the Date class
 */
public class DateTest {
    public static void main(String[] args) {
        Date today = new Date(1985,02,23);
        String information = today.displayDate(today.getYear(), today.getMonth(), today.getDay());
        System.out.println(information);
    }
}
