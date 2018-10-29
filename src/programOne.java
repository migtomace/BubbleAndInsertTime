import java.util.Arrays;
import java.util.Random;

public class programOne {

    public static void main(String[] args) {

        int[] hundred = buildArray(100);
        int[] twoHundredThousand = buildArray(200);

        System.out.println("Bubble Sort 100 Element Array " + bubbleSort(hundred));
        System.out.println("Bubble Sort 200,000 Element Array " + bubbleSort(twoHundredThousand));

        System.out.println("Insert Sort 100 Element Array " + insertSort(hundred));
        System.out.println("Insert Sort 200,000 Element Array " + insertSort(twoHundredThousand));


    }


    public static int[] buildArray(int numberElements) {
        int[] array = new int[numberElements];
        Random random = new Random();
        for (int i = 0; i < numberElements; i++) {
            array[i] = random.nextInt(numberElements);
        }

        return array;
    }


    public static String bubbleSort(int[] array) {
        int counter = 0;
        long start_time = System.nanoTime();

        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
//
//        recursive 200,000 causes stackOverflow
//        if (counter == 0){
//            start_time = System.currentTimeMillis();
//            counter++;
//        }
//        int swapped = 0;
//        for (int i = 1; i < array.length; i++){
//            if (array[i] < array[i-1]){
//                int element = array[i-1]; //store an element as a variable so that it doesn't get overwritten
//                array[i-1] = array[i];
//                array[i] = element;
//                swapped++;
//            }

//        }
//        System.out.println(swapped);
//        if(swapped != 0){
//            bubbleSort(array);
//        }


        long end_time = System.nanoTime();
        return "Start: " + start_time + "milliseconds - End: " + end_time + "milliseconds";
    }

    public static String insertSort(int[] array) {
        int counter = 0;
        long start_time = 0;
        if (counter == 0) {
            start_time = System.nanoTime();
            counter++;
        }

        for (int i = 1; i < array.length; i++) {

            int j = i - 1;
            while (j >= 0 && array[j] > array[i]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = array[i];
        }


        long end_time = System.nanoTime();
        return "Start: " + start_time + "milliseconds - End: " + end_time + "milliseconds";
    }
}
