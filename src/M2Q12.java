import java.util.Scanner;
public class M2Q12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        String c =scn.next();
        for(int u= 1;u<=n;u++)
        {
            for(int i= 1;i<=n;i++)
            {

                if(i<n)
                {
                    System.out.print(c);
                }
                else if(i==n)
                {
                    System.out.println(c);
                }
            }

        }

    }
}
