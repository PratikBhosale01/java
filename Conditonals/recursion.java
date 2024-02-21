/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package Conditonals;

public class recursion {

    public static void main(String[] args) {
        System.out.println(mystery(5));
    }
    public static int mystery(int n) {
        if (n == 0)
            return 1;
        else
            return 3* mystery(n - 1);
    }

}
