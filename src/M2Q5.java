import java.util.Scanner;
public class M2Q5 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a =0;
        String str="";

        while(n>0)
        {
            a=n%2;
            str=Integer.toString(a)+str;
            n=n/2;
        }
        int leng=str.length();
        for(int i =1;i<=8-leng;i++)
        {
            str="0"+str;
        }
        System.out.println(str);


    }
}
