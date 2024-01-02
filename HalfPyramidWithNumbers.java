import java.util.Scanner;

public class HalfPyramidWithNumbers
{
    public static void main(String args[])
    {

        // Half Pyrmaid with Numbers
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();

        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}
