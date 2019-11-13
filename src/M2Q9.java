import java.util.Scanner;
public class M2Q9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int max=0;
        for(int i=a;i>1;i--)
        {
            if(a%i ==0&&b%i==0)
            {
                max =i;
                break;
            }

        }
        System.out.println(max);
        System.out.println((a*b)/max);

    }
}
