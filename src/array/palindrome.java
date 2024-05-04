package array;

public class palindrome {
    public static void main(String[] args) {
        int n=1551;
        int n1,d,r=0;
        n1=n;
        while (n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if (n1==r)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
