package test;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        for(int i =1;i<=n;i++)
        {


            for(int k =1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}





