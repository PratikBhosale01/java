/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package Conditonals;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Date {


        public static void main(String[] args) {
            LocalDate date = LocalDate.of(2012, 1, 11);
            Period period = Period.ofMonths(2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M-dd-yy");
            System.out.print(formatter.format(date.minus(period)));
        }
    }


