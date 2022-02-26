/**Program to check whether a given number is odd or even**/

import java.util.*;
public class Cycle_1_qn_3 
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner (System.in);
        System.out.print("Enter the number: ");
        int a = obj.nextInt();
        if( a%2==0)
            System.out.println(a+" is an even number");   
        else
            System.out.println(a+" is an odd number");   
    }
}

/**
Output:

Enter the number: 76
76 is an even number

**/

