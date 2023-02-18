import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        if (n%2==0){
            for (int i=2;i<=n;i+=2)
                sum=sum+i;
        }
        else {
            for (int i=1;i<=n;i+=2)
                sum=sum+i;
        }
        System.out.print(sum);
        sc.close();
    }
}
