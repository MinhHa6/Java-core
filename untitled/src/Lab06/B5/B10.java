package Lab06.B5;

public class B10 {
    /**
     *
     * @param arr
     * @return arr[j+1]
     */
    //thuat toan chen sap xep tang dan 
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
