/**Program to check whether given number is palindrome or not**/

import java.util.*;
public class Cycle_1_qn_10 
{
    public static void main(String args[])
    {
        Scanner qn10=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=qn10.nextInt();
        int copy=num,i=0,a,b=0;
        while(i<num)
        {
            a=num%10;
            b=a+(b*10);
            num=num/10;    
        }
        if(b==copy)
            System.out.println(copy+" is palindrome");
        else
            System.out.println(copy+" isn't palindrome");
    }    
}

/**
Output:

Enter a number: 1221
1221 is palindrome

**/
