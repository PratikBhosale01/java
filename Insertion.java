/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


public class Insertion {
    public static void main(String[] args) {
        int nums [] ={65,56,34,54,45,33};
        int temp , j;

        for (int i = 1; i < nums.length; i++) {
            temp = nums[i]; //34
            j=i;  //1
            while (j>0&& nums[j-1]>temp){

               nums[j] =nums[j-1];
               j= j-1;
        }
            nums[j]=temp;



        }

        for (int a:nums
        ) {

            System.out.print(a +" ");

        }

    }
}
