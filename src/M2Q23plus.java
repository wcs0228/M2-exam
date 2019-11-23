import java.util.Scanner;
public class M2Q23plus {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int a;
        String s="";
        while(n>0)
        {
            a=n%10;
            n=n/10;
            s =s+ Integer.toString(a);
        }
        a=Integer.parseInt(s);
        System.out.println(a);

    }
}
