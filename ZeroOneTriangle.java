import java.util.Scanner;

public class ZeroOneTriangle
{
    public static void main(String args[])
    {
        // 0-1 Triangle
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();

        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                // By using matrix representation,
                // '1' is present at the even cell number when row number and column number is summed up.
                
                if( (i+j)%2 == 0) // Even
                { 
                    System.out.print("1");
                }
                else // Odd
                { 
                    System.out.print("0");
                }
            }
            
            System.out.println();
        }
    }
}
