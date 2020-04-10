public class test1 {
    public static void main(String [] args){
        int [] nums = {3,2,2,3};
        int  val = 3;
        System.out.println(removeElement( nums, val));

    }
    public static int removeElement(int[] nums, int val) {
        int j = 0;

        for(int i = 0; i<nums.length;i++){

            if(nums[i]!= val){
                nums[j] = nums[i];
                j++;
            }

        }

        return j;


    }
}
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
//        你可以假设数组中无重复元素。
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        if(target<nums[0]){
//            return 0;
//        }
//        if(target>nums[nums.length-1]){
//            return nums.length;
//        }
//        for(int i = 0;i<nums.length;i++){
//            if(nums[i] == target){
//                return i;
//            }if(nums[i]>target){
//                return i;
//            }
//            //if(nums[i]<target){
//            //  continue;
//            // }
//
//        }
//        return 0;
//    }
//}