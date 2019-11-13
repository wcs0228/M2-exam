import java.util.Scanner;
public class M2Q19 {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int i =1,j=1;
        while(i<=n)
        {
           System.out.print(i+"\t");
           i=i+j;
           j++;
        }
        System.out.println(i);

        for(int p =1;p<=n+1;p++)
        {
            for(int k=1;k<=p;k++)
            {
                System.out.print(p+"\t");
            }
        }
        System.out.println();

    }
}