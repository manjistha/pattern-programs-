/*
 *  *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
import java.util.*;

import javax.swing.filechooser.FileNameExtensionFilter;
public class DiamondStar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        int upRow=rows/2+1;
        int downRow=rows-upRow;
        
        


        System.out.println(upRow);
        int k;
        k=1;
        for(int i=1;i<=upRow;i++)
        {
            for(int space=1;space<=upRow-i;space++)
            System.out.print(" ");
            for(int j=1;j<=k;j++)
            System.out.print("*");
            k+=2;
            System.out.println();
        }
        k=1;
        for(int i=downRow;i>=0;i--)
        {
            for(int space=1;space<=k;space++)
            System.out.print(" ");
            for(int j=0;j<2*i+1;j++)
            System.out.print("*");
            k++;
            System.out.println();

        }
    }
}
