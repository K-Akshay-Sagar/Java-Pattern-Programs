 import java.util.Scanner;

public class ButterflyPattern
{
    public static void main(String args[])
    {

        // Butterfly Pattern

        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();

        // Upper Half
        for (int i=1; i<=rows; i++)
        {
            // left part
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            // Spaces
            for (int j=1; j<=2*(rows-i); j++)
            {
                System.out.print(" ");
            }
            // right part
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }


        // Lower Half
        for (int i=rows; i>=1; i--)
        {
            // left part
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            //Spaces
            for (int j=1; j<=2*(rows-i); j++)
            {
                System.out.print(" ");
            }
            // right part
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
