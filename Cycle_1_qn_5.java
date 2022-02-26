/**Program to find sum of first n natural numbers**/

import java.util.*;
public class Cycle_1_qn_5 
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner qn5= new Scanner(System.in);
        System.out.println("Enter the natural number till which the sum needs to be calculated: ");
        int num= qn5.nextInt();
        for(int i=1;i<=num;i++)
            sum=sum+i;
        System.out.println("Sum of first "+num+" natural numbers: "+sum);
    }
}

/**
Output:

Enter the natural number till which the sum needs to be calculated: 6
Sum of first 6 natural numbers: 21

**/
