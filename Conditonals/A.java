/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package Conditonals;

class B{
    public int i1 = 1;
    protected int i2 = 2;
}
class A extends B {
    public void print(){
        B obj = new B();
        System.out.println(obj.i1);    // line 1
        System.out.println(obj.i2);    // line 2
        System.out.println(this.i2);   // line 3
        System.out.println(super.i2);   // line 4

    }


    public static void main(String[] args) {

        new A().print();



    }
}