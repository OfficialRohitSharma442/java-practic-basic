import java.util.*;
public class PeakElement {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int index = -1;
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1])
                    index = i;
            } else if (i == size - 1) {
                if (arr[i] > arr[i - 1]) {
                    index = i;
                }
                } else {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        index = i;
                    }

            }
        }
System.out.println(index);
    }

}
