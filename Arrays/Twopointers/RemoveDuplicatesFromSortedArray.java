package Arrays.Twopointers;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // Bruteforce approach using two extra spaces one is for hashset and the other
        // is for a new array
        // s.c=> hashset(n),new array(n) --> O(N)
        // t.c ==> O(N)+O(LogN)+O(N)+O(N) overall timecomplexity is O(N)
        // HashSet<Integer> hs = new LinkedHashSet<>();
        // for (int num : arr) {
        // hs.add(num);
        // }
        // int[] distinctArr = new int[hs.size()];
        // int idx = 0;
        // for (int element : hs) {
        // distinctArr[idx] = element;
        // idx++;
        // }
        // for (int i : distinctArr) {
        // System.out.print(i + " ");
        // }

        // Optimised version (Two pointers approach)
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        int newArrayIndex = i + 1;
        for (int index = 0; index < newArrayIndex; index++) {
            System.out.print(arr[index] + "  ");
        }

    }
}
