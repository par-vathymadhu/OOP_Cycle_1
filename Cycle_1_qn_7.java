import java.util.*;
public class Cycle_1_qn_7 
{
    public static void main(String args[])
    {
        Scanner qn7=new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num=qn7.nextInt();
        int n1=0,n2=1,n3;
        System.out.print("Fibpnacci series :");
        for(int i=0;i<num;i++)
        {
            n3=n1+n2;
            System.out.print(n1+" ");
            n1=n2;
            n2=n3;
        }

    }   
}
