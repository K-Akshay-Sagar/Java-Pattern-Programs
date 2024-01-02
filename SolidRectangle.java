import java.util.Scanner;

public class SolidRectangle
{
    public static void main(String args[])
    {
        
        // Solid Rectangle
        // *****
        // *****
        // *****
        // *****

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter no.of Columns : ");
        int columns = sc.nextInt();

        // outer loop -> rows
        for(int i=1; i<=rows; i++)
        {
            //inner loop -> columns
            for(int j=1; j<=columns; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
