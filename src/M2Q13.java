import java.util.Scanner;
public class M2Q13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long base = 1;
        long sum;
        for(int i = 1;i<n;i++)
        {
            base=base*i;
        }
        sum = n*base;
        System.out.println(sum);
    }

}
