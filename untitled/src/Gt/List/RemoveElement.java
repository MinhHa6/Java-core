package Gt.List;

public class RemoveElement {
    public static int removeElement (int []nums ,int val)
    {
        int k=0;
        {
            for (int i=0;i< nums.length;i++)
            {
                if(nums[i]!= val)
                {
                    nums[k]=nums[i];
                    k++;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int []nums= new int[]{2,3,1,2,4};
        int k= removeElement(nums,2);
        System.out.println("Mang sau khi duoc xoa phan tu trung lap la:");
        for (int i=0;i<k;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
