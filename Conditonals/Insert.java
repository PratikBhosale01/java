/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package Conditonals;

public class Insert {
    //WE want to get output printed as "NET"
    public static void main(String[] args) {
        String[] arr = {"I", "N", "S", "E", "R", "T"};
        //(int n = 0; n<arr.length; n+=1)       this will give NET
        //(int n = 0; n <= arr.length; n +=1)   this will give NET
        //(int n = 1; n <arr.length; n += 2)    this will give NET
        //(int n = 1; n <= arr.length; n += 2)  this will give NET

        for ( int n = 1; n <= arr.length; n += 2) {
            if ( n%2 ==0 ) {
                continue;
            }
            System.out.print(arr[n]); //Line ni
        }
    }
}
