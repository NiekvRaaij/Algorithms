package Sorting;

/**
 * Created by Niek van Raaij on 20-6-2015.
 */
public class Bubblesort {
    private static int[] array;

    public static void main(String[] args) {
        fillArray(10);
        printArray();
        System.out.println("---------------------------------------------");
        bubblesort();
        printArray();
    }

    private static void bubblesort() {
        int i, j, temp;
        for (i = 0; i < array.length; i++) {
            for (j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

    }

    private static void fillArray(int arraysize) {
        array = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    private static void printArray() {
        for (int i : array) {
            System.out.println(i);
        }
    }

}
