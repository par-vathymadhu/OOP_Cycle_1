/**Program to find factor of a given number**/

import java.util.*;
public class Cycle_1_qn_6 
{
    public static void main(String args[])
    {
        Scanner qn6=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=qn6.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                System.out.println("Factor of "+num+" : "+i);
        }
    }
}

/**
Output:

Enter the number: 4
Factor of 4 : 1
Factor of 4 : 2
Factor of 4 : 4

**/
