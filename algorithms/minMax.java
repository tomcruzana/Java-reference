/*
* Code created by Tom, 100%.
* */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        arrayInitializer(10);
    }

    public static void arrayInitializer(int count){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        getMin(arr);
        getMax(arr);
    }

    public static void getMin(int[] arr){
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println("min value" + min);
    }

    public static void getMax(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println("max value" + max);
    }
}

