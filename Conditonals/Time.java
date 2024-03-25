/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package Conditonals;
import java.time.LocalDate;
import java.time.LocalTime;
public class Time {


            public static void main(String[] args) {
            LocalDate date =LocalDate.parse("1947-08-14");

            LocalTime time =LocalTime.MAX;

        System.out.println(date.atTime(time));

}
}
