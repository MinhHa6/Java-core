package Gt.List;

public class Target {
    public static int []twoSum(int []nums,int target)
    {
        for (int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==target-nums[i])
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int []{};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7};
        int[] result = twoSum(nums, 3);

        if (result.length == 3) {
            System.out.println("Vị trí: " + result[0] + " và " + result[1]);
        } else {
            System.out.println("Không tìm thấy cặp số nào.");
        }

    }
}
