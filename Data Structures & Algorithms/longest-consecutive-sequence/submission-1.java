class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 ) return 0;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int longestConsecutive = 0;
        int consecutive = 0;

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i + 1] == nums[i] + 1) {
                consecutive++;
                longestConsecutive = longestConsecutive > consecutive ? longestConsecutive : consecutive;
                System.out.println(consecutive + " " + longestConsecutive + " " + (nums[i] + 1) + " " + nums[i + 1]);
            }
            else if(nums[i + 1] == nums[i]){
                System.out.println(consecutive + " " + longestConsecutive + " " + nums[i] + " " + nums[i + 1]);
                continue;
            }
            else {
                System.out.println(consecutive + " " + longestConsecutive + " " + nums[i] + " " + nums[i + 1]);
                consecutive = 0;
            }
        }

        return (longestConsecutive+1);
    }
}
