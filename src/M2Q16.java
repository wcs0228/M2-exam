import java.util.Scanner;
public class M2Q16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int a = 1;
        int answer =0;
        for(int i= 1 ;i<=n; i++)
        {
            a = a*2;
            answer = answer+a;
        }
        System.out.println(answer);
    }

}