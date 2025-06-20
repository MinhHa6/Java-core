package Gt.List;

public class Palindrome {
    public static boolean isPalindrome(int x)
    {
        if (x<0|| x%10==0 && x!=0)
            return false;
        int reverse=0;
        while (x>reverse)
        {
            reverse=reverse*10+x%10;
            x/=10;
        }
        // Nếu số có số chữ số chẵn -> x == reversedHalf
        // Nếu số có số chữ số lẻ -> bỏ chữ số ở giữa (reversedHalf / 10)
        return x==reverse|| x==reverse/10;
    }

    public static void main(String[] args) {
        System.out.println("kiem tra "+isPalindrome(1441));

    }
}
