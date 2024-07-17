package gunelaliyeva.datastructures.Array;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 9;

        printArray(arr);
        arr[3] = 7; //update
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
