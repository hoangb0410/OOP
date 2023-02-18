import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args)
    {
        double nmax,nmin,num;
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        num=sc.nextDouble();
            nmax=num;
            nmin=num;
        for (int i=2;i<=n;i++)
        {
            num=sc.nextDouble();
            if (num>nmax)
                nmax=num;
            if (num<nmin)
                nmin=num;
        }    
        System.out.print(nmax+" "+nmin);
        sc.close();
    }
}
