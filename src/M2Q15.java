import java.util.Scanner;
public class M2Q15 {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        double a = 0;
        double sum = 0;

        for(int i=1;i<=(2*n);i+=2)
        {
            a=1.0/(i*(i+1));
            sum=sum+a;


        }


        System.out.println(sum);
    }

}
