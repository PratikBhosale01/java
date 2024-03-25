/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package Conditonals;
abstract class food {

      abstract double getCalories();
//      abstract method cannot be private
      void test(String test){};
}

abstract  class junk extends food{
//    public abstract void test();  allowed
//     abstract void test();        allowed
//abstract void test(String test);    allowed

//public void test(Object obj) {}  allowed
 

}

public class Abs  extends food  {
    public static void main(String[] args) {



}

    @Override
       public double getCalories() {
        return 0;
    }
}
//  getCalories() of both class both public , protected , default are allowed , private not allowed
//  food.getCalories() is protected  and  abs.getCalories() is public allowed  , other combo not alllowed