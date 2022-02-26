import java.util.*;
public class Cycle_1_qn_6 
{
    public static void main(String args[])
    {
        Scanner qn6=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=qn6.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                System.out.println("Factor of "+num+" : "+i);
        }
    }
}
