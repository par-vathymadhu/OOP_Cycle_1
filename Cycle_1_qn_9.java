import java.util.*;
public class Cycle_1_qn_9 
{
    public static void main(String args[])
    {
        Scanner qn9=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=qn9.nextInt();
        int copy=num,a,b=0,i=0;
        while(i<num)
        {
            a=num%10;
            b=b+(a*a*a);
            num=num/10;
        }
        if(b==copy)
            System.out.println(copy+" is an armstrong number");
        else
            System.out.println(copy+" isn't an armstrong number");
    }    
}
