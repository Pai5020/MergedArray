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
        System.out.println("Merged array : ");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        list1.addAll(list2);
        marray = list1.toArray(new Integer[0]);

        System.out.println(Arrays.toString(marray));
        Arrays.sort(marray, Collections.reverseOrder());
        System.out.println("Array after sorting in descending order :" + Arrays.toString(marray));
    }
}