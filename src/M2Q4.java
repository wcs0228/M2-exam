import java.util.Scanner;
public class M2Q4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i= 1;i<=n;i++)
        {
            for(int k =1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int p =1;p<=2*i-1;p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}