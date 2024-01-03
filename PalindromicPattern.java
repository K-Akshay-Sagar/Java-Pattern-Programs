import java.util.Scanner;

public class PalindromicPattern
{
    public static void main(String args[])
    {
        // Palindromic Pattern
        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        
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
            
            // left part numbers
            for (int j=i; j>=1; j--)
            {
                System.out.print(j);
            }

            // right part numbers
            for (int j=2; j<=i; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
