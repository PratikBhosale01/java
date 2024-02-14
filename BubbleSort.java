/*
* Author : Pratik Bhosale
* Date : $(DATE)
* created with : IntelliJ IDEA Community Edition
*/


import java.lang.reflect.Array;

public class BubbleSort {
    public static void main(String []args){
        int number[]  ={5,9,24,2,45,52};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length-i-1; j++) {
                if( number[j]>number[j+1]){
                    int temp= number[j];
                    number[j]= number[j+1];
                    number[j+1]=temp;
                }
                
            }
            
        }

        for (int a:number
             ) {

            System.out.print(a +" ");

        }
    }


}
