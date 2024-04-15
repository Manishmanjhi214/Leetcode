import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
    int nums[]= {3,2,4};
    int target=6;
    int arr[] = new int[2];
    arr=twoSum(nums,target);
    System.out.print(Arrays.toString(arr));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i] + nums[j]) == target){
                    arr[0]= i;
                    arr[1]= j;

                }
            }
        }
        return arr;
    }
}
