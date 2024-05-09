import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i;
        Integer[] arr = new Integer[4];
        Integer[] arr2 = new Integer[7];
        Scanner sc = new Scanner(System.in);
        Integer[] marray;

        System.out.println("Enter array 1 ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array 2 ");
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int msize = arr.length+ arr2.length;
        System.out.println("Merged array : ");
        marray= new Integer[msize];

        System.arraycopy(arr, 0, marray, 0, arr.length);

        System.arraycopy(arr2, 0, marray, arr.length, arr2.length);


        System.out.println(Arrays.toString(marray));
        Arrays.sort(marray, Collections.reverseOrder());
        System.out.println("Array after sorting in descending order :" + Arrays.toString(marray));
    }
}