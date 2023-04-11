/*
 *
 *  *****
     ****
      ***
       **
        *
 */
import java.util.*;
public class RightMirrorStar {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=input.nextInt();
        int k=rows;
        for(int i=1;i<=rows;i++)
        {
            for(int space=0;space<=i-1;space++)
            System.out.print(" ");
            for(int j=1;j<=k;j++)
            System.out.print("*");
            k--;
            System.out.println();
        }
    }
    
}
