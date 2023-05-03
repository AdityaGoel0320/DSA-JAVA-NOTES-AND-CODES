package BASIC;
public class ReturnDuplicateNumber {
    static int duplicatenumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {

                    ans = nums[i];
                }

            }

            return ans ;
        }
        return -1 ;
    }

    public static void main(String[] args) {

        int[]  arr = {1,0,0,3,4,5,6,7};
        int ans = duplicatenumber(arr);
        System.out.println(ans);
    }

}
