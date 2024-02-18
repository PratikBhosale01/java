/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


public class objArraySort {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 45000)
        };

        // Sort employees array by salary using bubble sort
        bubbleSort(employees);

        // Print sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Bubble sort implementation
    public static void bubbleSort(Employee[] arr) {
        int n = arr.length;
        Employee temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getSalary() > arr[j + 1].getSalary()) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
