
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        temp=n;
        int result=0;
        while(temp>0)
        {
            int last=temp%10;
            result=result+(int)Math.pow(last,count);
            temp=temp/10;
        }

        if(result==n) System.out.println("Armstrong number");
        else System.out.println("Not an armstrong number");

    }
}
