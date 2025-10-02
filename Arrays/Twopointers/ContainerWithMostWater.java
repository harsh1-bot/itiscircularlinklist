package Arrays.Twopointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        // Two pointer variant
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (leftPointer < rightPointer) {
            int area = (Math.min(arr[leftPointer], arr[rightPointer])) * (rightPointer - leftPointer);
            if (area > maxArea) {
                maxArea = area;
            }
            if (arr[leftPointer] < arr[rightPointer]) {

                leftPointer++;
            }

            else {

                rightPointer--;
            }

        }

        System.out.println(maxArea);

    }
}
