import java.util.Scanner;

public class test02 {
    public static void main(String[] args) throws Exception

    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int i = n; i >= 0; i--)
        {
            System.out.printf("%d\n", i);
        }
    }
}

