import java.util.Scanner;
    public class M2Q10 {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n =scn.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int k=1;k<=n;k++)
                {
                        System.out.print(i*k+"\t");

                }
                System.out.println();
            }

        }

}
