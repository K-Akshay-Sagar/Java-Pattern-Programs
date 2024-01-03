import java.util.Scanner;

public class HollowRhombus
{
    public static void main(String args[])
    {

        // Hollow Rhombus
        //     *****
        //    *   *
        //   *   *
        //  *   *
        // *****

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();

        for (int i=1; i<=rows; i++)
        {
            //spaces
            for(int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=rows; j++)
            {
                // Printing star when row and column number is '1' & row and column number is 'n'.
                if(i==1 || i==rows || j==1 || j==rows)
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
