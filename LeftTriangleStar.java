/*
 *         * 
         * * 
       * * * 
     * * * * 
   * * * * *
 */
import java.util.*;
public class LeftTriangleStar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int space=1;space<=rows-i;space++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
    }
    
}
