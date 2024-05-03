import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        int[] arr = new int[4];
        int[] arr2 = new int[4];
        Scanner sc = new Scanner(System.in);
        int size = arr.length;
        int size1 = arr2.length;
        Integer[] marray = new Integer[size + size1];

        System.out.println("Enter array 1 ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array 2 ");
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Merged array : ");
        for (i = 0; i < size ; i++) {
            marray[i] = arr[i];
            marray[size+i] = arr2[i];
        }

        System.out.println(Arrays.toString(marray));
        Arrays.sort(marray, Collections.reverseOrder());
        System.out.println("Array after sorting in descending order :" + Arrays.toString(marray));
    }
}