import java.util.Scanner;

public class InvertedHalfPyramid
{
    public static void main(String args[])
    {
        // Inverted Half Pyramid
        // *****
        // ****
        // ***
        // **
        // *

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();
        
        for(int i=rows; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
