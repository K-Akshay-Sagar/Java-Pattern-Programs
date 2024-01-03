import java.util.Scanner;

public class SolidRhombus
{
    public static void main(String args[])
    {

        // Solid Rhombus
        //     *****
        //    *****
        //   *****
        //  *****
        // *****

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();

        for (int i=1; i<=rows; i++)
        {
            // spaces
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            
            //stars
            for (int j=1; j<=rows; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
