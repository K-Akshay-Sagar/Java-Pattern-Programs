import java.util.Scanner;

public class HollowRectangle
{
    public static void main(String args[])
    {
        
        // Hollow Rectangle
        // *****
        // *   * 
        // *   *
        // *****

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of Columns : ");
        int columns = sc.nextInt();

        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=columns; j++)
            {
                // cell -> (i, j), stars are positioned on starting and ending row & columns.
                if(i==1 || j==1 || i==rows || j==columns)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}

