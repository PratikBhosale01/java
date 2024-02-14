/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


public class RevBubble {

    public static void main (String Args[] ){

        int nums [] ={65,56,34,54,45,33};
        for (int i = nums.length; i>0 ; i--) {
            for (int j = nums.length-i-1; j >0 ; j--) {
                if( nums[j]<nums[j+1]){
                    int temp= nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                }

            }

        }

        for (int a:nums
        ) {

            System.out.print(a +" ");

        }




    }


}
