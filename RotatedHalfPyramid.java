import java.util.Scanner;

public class RotatedHalfPyramid
{
    public static void main(String args[])
    {
        // Inverted Half Pyramid (Rotated by 180 degree)
        //    *
        //   **
        //  ***
        // ****
        
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
            // stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
