/*
 *
  1 
  2 1 
  3 2 1 
  4 3 2 1 
  5 4 3 2 1
 */
import java.util.*;
public class RightTriangleNumeric {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        int k=0;
        for(int i=1;i<=rows;i++)
        {
            k=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
    
}
