import java.util.Scanner;
public class M2Q23 {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        long n = scn.nextInt();
        while(n>0)
        {
            System.out.print(n%10);
            n=n/10;
        }
        System.out.println();
    }
}