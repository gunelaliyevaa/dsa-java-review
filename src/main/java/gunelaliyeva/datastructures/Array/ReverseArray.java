package gunelaliyeva.datastructures.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 3, 2, 5, 9};
        ArrayUtil.printArray(arr);

        reverseArray(arr);
        ArrayUtil.printArray(arr);

    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
