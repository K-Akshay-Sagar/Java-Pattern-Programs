import java.util.Scanner;

public class NumberPyramid
{
    public static void main(String args[])
    {
        // Number Pyramid
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();

        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++)
            {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
