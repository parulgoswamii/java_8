
import java.time.LocalDate;

class DateBean {
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static void main(String[] args) {
        DateBean d = new DateBean();

        System.out.println("Current Date: " + d.getCurrentDate());
    }
}
