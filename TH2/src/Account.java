// Bai 3
import java.util.Scanner;
public class Account {
    private
        long STK;
        String TenTK;
        double Tien;
    public Account (){
        this.STK =0;
        this.TenTK ="";
        this.Tien=0;
    }
    public Account (long STK, String TenTK, double Tien){
        this.STK =STK;
        this.TenTK =TenTK;
        this.Tien=Tien;
    }
    Scanner sc = new Scanner(System.in);
    public void setSTK()
    {
        System.out.print("Nhap STK: ");
        long STK = sc.nextLong();
        this.STK=STK;
    }
    public void setTenTK()
    {
        System.out.print("Nhap Ten TK: ");
        String TenTK = sc.nextLine();
        this.TenTK=TenTK;
    }
    public void setTien()
    {
        System.out.print("Nhap Tien: ");
        double Tien = sc.nextDouble();
        this.Tien=Tien;
    }
    public long getSTK()
    {
        return STK;
    }
    public String getTenTK()
    {
        return TenTK;
    }
    public double getTien()
    {
        return Tien;
    }
    public String toString()
    {
        return "STK: "+STK+", Ten TK: "+TenTK+", Tien: "+Tien+",USD";
    }
    double LAISUAT=0.035; 
    public Account (long STK, String TenTK){
        this.STK =STK;
        this.TenTK =TenTK;
        this.Tien=50;
    }
    public void NapTien(double TienNap)
    {
        if (TienNap<0)
            System.out.println("Khong hop le, Nhap lai");
        else 
            this.Tien+=TienNap;
    }
    double PhiRutTien=1;
    public void RutTien(double TienRut)
    {
        if (TienRut>this.Tien)
            System.out.println("Khong hop le, Nhap lai");
        else 
            this.Tien-=(TienRut+PhiRutTien);
    }
    public void DaoHan()
    {
        this.Tien+=this.Tien*LAISUAT;
    }
    public void ChuyenKhoan(double TienCK)
    {
        if (TienCK>this.Tien)
            System.out.println("Khong hop le, Nhap lai");
        else 
            this.Tien-=TienCK;
    }
    public static void main(String[] args){
        /*Account ACC = new Account(21000251, "Cao Viet Hoang", 1000);
        Account ACC=new Account();
        ACC.setTenTK();
        ACC.setSTK();
        ACC.setTien();
        System.out.println(ACC.toString()); */
        Account acc1=new Account(123456, "Nguyen Van Hoang");
        System.out.println(acc1.toString());
        acc1.NapTien(100);
        System.out.println(acc1.getTien());
        acc1.RutTien(20);
        System.out.println(acc1.getTien());
        acc1.DaoHan();
        System.out.println(acc1.getTien());
        acc1.ChuyenKhoan(40);
        System.out.println(acc1.getTien());
    }
}
