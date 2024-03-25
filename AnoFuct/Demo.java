/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package AnoFuct;
@FunctionalInterface
interface A {

     void drive ();

}

//class B implements A
//{
//    public void drive()
//    {
//        System.out.println("Driver drives Car");
//    }
//}


public class Demo {

    public static void main(String[] args) {
        A car =
//                new A() {
//            public void drive()

                () ->
    {
        System.out.println("Driver drives Car");
    };


//        };

        car.drive();
    }




}
