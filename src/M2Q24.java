import java.util.Scanner;
    public class M2Q24 {
        public static void main(String[] args) {
            Scanner scn =new Scanner(System.in);
            int n = scn.nextInt();
            int sum =0;
            int i =0;
            while(sum<=n)
            {
                i++;
                sum+=i;
                //sum+=++i
            }
            System.out.println(i-1);

        }
}
