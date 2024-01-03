import java.util.Scanner;

public class DiamondPattern
{
    public static void main(String args[])
    {
        // Diamond Pattern
        //    *
        //   ***
        //  *****
        // *******
        // *******
        //  *****
        //   ***
        //    *

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();


        //Upper Half
        for (int i=1; i<=rows; i++)
        {
            // spaces
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }

            // stars
            for (int j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }


        // Lower Half
        for (int i=rows; i>=1; i--)
        {
            // spaces
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }

            // stars
            for (int j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
