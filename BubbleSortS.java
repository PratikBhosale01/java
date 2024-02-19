/*
 * Author : Pratik Bhosale
 * Date : $(DATE)
 * created with : IntelliJ IDEA Community Edition
 */


public class BubbleSortS {


        public static void main(String[] args) {
            String[] names = {"John", "Alice", "Bob", "David", "Eve"};


            System.out.println("Unsorted Names:");
            printArray(names);


            bubbleSort(names);


            System.out.println("\nSorted Names:");
            printArray(names);
        }

        // Bubble sort algorithm
        public static void bubbleSort(String[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        // Swap arr[j] and arr[j+1]
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }


        public static void printArray(String[] arr) {
            for (String element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }



