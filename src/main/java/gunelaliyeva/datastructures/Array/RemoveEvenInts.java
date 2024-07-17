package gunelaliyeva.datastructures.Array;

public class RemoveEvenInts {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 3, 2, 5, 9, 10};
        ArrayUtil.printArray(arr);

        int[] result = removeEven(arr);
        ArrayUtil.printArray(result);
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) oddCount++;
        }

        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

}
