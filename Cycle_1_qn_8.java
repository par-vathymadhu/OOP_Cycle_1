import java.util.*;
public class Cycle_1_qn_8 
{
    public static void main(String args[])
    {
        Scanner qn8=new Scanner(System.in);
        int fact=1;
        System.out.println("Enter the number whose factorial needs to be found: ");
        int num=qn8.nextInt();
        for(int i=1;i<=num;i++)
            fact=fact*i;
        System.out.println("Factorial of "+num+" : "+fact);
    }    
}
