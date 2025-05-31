package Lab06.B5;

public class B8 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 8, 2, 9};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;  // vị trí phần tử nhỏ nhất

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi arr[i] với arr[minIndex] nếu cần
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        // In ra mảng sau khi sắp xếp
        System.out.print("Mảng sau khi được sắp xếp là: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
