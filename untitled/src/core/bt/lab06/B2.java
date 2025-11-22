package core.bt.lab06;
// tim max va min cua mang
public class B2 {
  static int maxs(int arr[])
    {
        int max= arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }return max;
    }
    static int mins(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7};
        System.out.println("Max cua mang la:"+maxs(arr));
        System.out.println("Phan tu nho nhat cua mang la:"+mins(arr));
    }
}
