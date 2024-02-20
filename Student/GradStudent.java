package Student;/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


public class GradStudent extends Student {
    public String getFood() {
        return "Taco";
    }

    public String getInfo() {
        super.getInfo();
        return "Eating";
    }
}
