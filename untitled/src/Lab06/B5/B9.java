package Lab06.B5;

public class B9 {
    public static void main(String[] args) {
        int []arr= new int[ ]{3,5,6,8,9,2};
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=arr.length-1;j>i;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("Mang sau khi dc sap xep la:");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
