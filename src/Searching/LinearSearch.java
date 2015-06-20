package Searching;

/**
 * Created by Niek van Raaij on 20-6-2015.
 */
public class LinearSearch {

    private static int[] array;

    public static void main(String[] args) {
        fillArray(100);
        printArray();
        System.out.println("-------------------------");
        System.out.println("value 10  is found at index: "+ linearSearch(10));
    }

    private static int linearSearch(int searchValue){
        for(int i =0; i< array.length; i++){
            if(array[i]== searchValue){
                return i;
            }
        }
        return -1;
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
