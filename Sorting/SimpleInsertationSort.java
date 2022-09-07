public class SimpleInsertationSort {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 7, 43, 2, 1, 3 };
        for (int i = 1; i < arr.length; i++) {
            //check the all privious value and set into correct position 
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    break;
                }
            }

        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}