import java.util.Scanner;
    public class M2Q1 {

    public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    Float n;
        float max=-Float.MAX_VALUE,min=Float.MAX_VALUE;

	    for(int i =1;i<=10;i++)
            {
                n =scn.nextFloat();
                if(n>max)
                {
                max=n;
                }
                if(n<min)
                {
                    min=n;
                }

            }
        System.out.printf("max=%.2f\n",max);
        System.out.printf("min=%.2f\n",min);




    }
}
