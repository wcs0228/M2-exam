import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class M2Q7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int listen;
        int read;
        int speak;
        int num;
        for(int i =0;i<n;i++)
        {
            listen = scn.nextInt();
            read = scn.nextInt();
            speak = scn.nextInt();
            num = 0;
            if(listen>=60)
            {
                num++;
            }
            if(read>=60)
            {
                num++;
            }
            if(speak>=60)
            {
                num++;
            }
            if(num==3)
            {
                System.out.println("p");
            }
            else if(num==2)
            {
                if(listen+read+speak>=220)
                {
                    System.out.println("p");
                }
                else
                {
                    System.out.println("m");
                }
            }
            else if(num == 1)
            {
                if(listen>=80||read>=80||speak>=80)
                {
                    System.out.println("p");
                }
                else
                {
                    System.out.println("f");
                }

            }
            else
            {
                System.out.println("F");
            }

        }

    }
}
