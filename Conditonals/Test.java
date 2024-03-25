/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package Conditonals;

import java.util.ArrayList;
import java.util.List;

class Point {
    int x;
    int y;

    void assign(int x, int y) {
        x = this.x ;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}
public class Test {




        public static void main(String[] args) {
            Point p1 = new Point();
            p1.x = 10;
            p1.y = 20;
            Point p2 = new Point();

            List<String> list  = new ArrayList<String>();

            p2.assign(p1.x, p1.y);
            System.out.println(p1.toString() + "; " + p2.toString());
        }
    }


