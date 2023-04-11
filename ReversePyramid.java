/*
 * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
 */
import java.util.*;
class ReversePyramid
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        
        for(int i=1;i<=rows;i++)
        {
            for(int space=0;space<=i-1;space++)
            System.out.print(" ");
            for(int j=rows;j>=i;j--)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}