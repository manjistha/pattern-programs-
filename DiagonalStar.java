/*
 *  *
 *    *
 *      *
 *        *
 *          *
 */
import java.util.*;
public class DiagonalStar {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=input.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int space=0;space<i-1;space++)
            {
                System.out.print(" ");

            }
            
            System.out.print("*");
            System.out.println();

        }
    }

    
}
