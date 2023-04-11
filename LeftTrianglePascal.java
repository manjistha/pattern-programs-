/*
 *
 *  *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 */
import java.util.*;
public class LeftTrianglePascal {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        int up=rows/2;
        int down=rows-up-1;
        for(int i=1;i<=up;i++)
        {
            for(int space=up-i;space>=1;space--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
        for(int i=down;i>=1;i--)
        {
            for(int space=1;space<=down-i+1;space++)
            System.out.print(" ");
            for(int j=i;j>=1;j--)
            System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
    
}
