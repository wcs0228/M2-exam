import java.util.Scanner;
public class M2Q13plus {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long a =1;
        for(int i=1;i<=n;i++)
        {
            a=a*i;
        }
        System.out.println(a);

    }
}

