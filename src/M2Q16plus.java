import java.util.Scanner;
public class M2Q16plus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=0;
        int a;
        for(int k =1;k<=n;k++)
        {
            a=1;
            for (int i = 1; i <= k; i++)
            {

                a =a*2;
            }
            sum=sum+a;
        }
        System.out.println(sum);

    }
}





