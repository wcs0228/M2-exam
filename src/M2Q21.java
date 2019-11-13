import java.util.Scanner;
public class M2Q21 {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        long res =1;
        int count=0;
        for(int i =n;i>1;i--)
        {
            res*=i;
        }
        while(res%10 ==0)
        {
            count++;
            res/=10;
        }
        System.out.println(count);
    }
}