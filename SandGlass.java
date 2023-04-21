/*
 * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 */
import java.util.*;
public class SandGlass {
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows,up,down;
        rows=ip.nextInt();
        up=down=rows/2;
        for(int i=1;i<=up;i++)
        {
            for(int space=0;space<i-1;space++)
            System.out.print(" ");
            for(int star=up-i+1;star>=1;star--)
            System.out.print("* ");
            System.out.println();
        }
        for(int i=down;i>=1;i--)
        {
            for(int space=i-1;space>0;space--)
            System.out.print(" ");
            for(int star=1;star<=down-i+1;star++)
            System.out.print("* ");
            System.out.println();
        }

    }
    
}
