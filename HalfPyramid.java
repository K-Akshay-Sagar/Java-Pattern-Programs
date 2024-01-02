import java.util.Scanner;

public class HalfPyramid
{
    public static void main(String args[])
    {
        // Half Pyramid
        // *
        // **
        // ***
        // ****
        // *****

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();
        
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}