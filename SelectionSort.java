/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


public class SelectionSort {
    public static void main(String[] args) {
        int nums [] ={65,56,34,54,45,33};
        int temp =0;

        for (int i = 0; i < nums.length; i++) {
            int min =i;

            for (int j = i+1; j <nums.length ; j++) {

                if (nums[j]<nums[min]) { // change  condition to make descending
                    min=j;

                }

            }

            temp = nums[min];
            nums[min]= nums[i] ;
            nums[i]=temp;

        }

        for (int a:nums
        ) {

            System.out.print(a +" ");

        }

    }
}
