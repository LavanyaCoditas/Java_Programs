package CodingPractice;

import java.util.Arrays;

public class PairWithGivenDiffrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 22, 11, 21, 9, 5, 8};
        int diff = 5;
        Arrays.sort(arr);
        int len = arr.length;
        int i = 0, j = 1;
        while (i < arr.length && j < arr.length) {
            if (arr[j] - arr[i] == diff && i != j) {
                System.out.println(arr[j] + "  : " + arr[i]);
                break;
            } else if (arr[j] - arr[i] > diff) {
                i++;

            } else if (arr[j] - arr[i] < diff) {
                j++;
            }
        }

    }
}
