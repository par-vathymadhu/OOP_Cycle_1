/**Program to check whether a given number is prime or not**/

import java.util.*;
class Cycle_1_qn_4
{
    public static void main(String args[])
    {
        Scanner qn4 = new Scanner(System.in);
        int a=0;
        System.out.println("Enter the number: ");
        int num=qn4.nextInt();
        for(int i=1;i<=(num/2);i++)
        {
            if(num%i==0)
                a++;
        }
        if (a==1)
            System.out.println(num+" is prime");
        else
            System.out.println(num+" isn't prime");
    }
}

/**
Output:

Enter the number: 
7
7 is prime

**/
