import java.util.Scanner;
public class M2Q5plus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int a ;
        String str ="";
        while(n>0)
        {
            a=n%2;
            str =Integer.toString(a)+str;
            n=n/2;
        }
        while(str.length()<8)
        {
            str=0+str;
        }
        System.out.println(str);
    }
}





