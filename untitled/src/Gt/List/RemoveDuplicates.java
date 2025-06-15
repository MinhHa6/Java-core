package Gt.List;

public class RemoveDuplicates {
    public static int removeDuplicates (int []nums)
    {
        if(nums.length==0) return 0;
        int k=1; // dat vi tri phan tu mang tiep theo
        for (int i=0;i< nums.length;i++)
        {
            if( nums[i]!=nums[k-1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int []nums=new int[]{0,1,1,2,3,4};
        int k=removeDuplicates(nums);
        System.out.println("So phan tu duy nhat cua k la:"+k);
        System.out.println("mang sau khi dc xoa phan tu trung lap la:");
        for (int i=0;i<k;i++)
        {
            System.out.println(nums[i]+" ");
        }
    }
}
