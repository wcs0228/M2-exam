import java.util.Scanner;
public class M2Q6 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=1;
        for(int i =2;i<n;i++)
        {
            if(n%i ==0)
            {
                a=0;
                break;
            }
        }
        if(a ==0)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }



    }
}
