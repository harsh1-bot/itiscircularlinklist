package Arrays.Twopointers;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 3, 12 };
        int trackZeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                trackZeroes = i;
            } else {
                nums[trackZeroes] = nums[i];
                trackZeroes++;
            }
        }
        for (int i : nums) {
    System.out.println(i);
}
    }
}
