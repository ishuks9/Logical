import java.util.Scanner;
public class Perfect
  {
    public static void main(String arg[])
      {
         long num,m;
          Scanner s_c=new Scanner(System.in);
          System.out.println("Enter number");
          num=s_c.nextLong();
          m=perfectOrNot(num);
          if(m==num)
         System.out.println(num+" The given number is perfect number");
          else
        System.out.println(num+" The given number is not perfect number");
       }
      static long perfectOrNot(long n)
        {
          long s=0;
         for(int j=1;j<=n/2;j++)
         {
           if(n%j==0)
          {
             s+=j;
          }
         }
     return s;
   }
}
