import java.util.Scanner;
    public class M2Q17 {
        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            int sum=0;
            int count =0;
            int n =scn.nextInt();
            while(n>0){
                sum+=n%10;
                count++;
                n=n/10;
            }
            System.out.println(count);
            System.out.println(sum);



        }
}
