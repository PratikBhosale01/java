/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


package Conditonals;

public abstract class Customer {
    private String name;
    public Customer(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public abstract void buy();


}
//class pr extends Customer{
//
//
//
//    @Override
//    public void buy() {
//
//    }
//}

