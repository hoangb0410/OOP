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
    public void setSTK(long STK)
    {
        this.STK=STK;
    }
    public void setTenTK(String TenTK)
    {
        this.TenTK=TenTK;
    }
    public void setTien(double Tien)
    {
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
        Account ACC=new Account();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap Ten TK: ");
        ACC.setTenTK(sc.nextLine());
        System.out.print("Nhap STK: ");
        ACC.setSTK(sc.nextLong());
        System.out.print("Nhap Tien: ");
        ACC.setTien(sc.nextDouble());
        System.out.println(ACC.toString());

        System.out.print("Nhap Tien Nap: ");
        ACC.NapTien(sc.nextDouble());
        System.out.print("Tien sau khi nap: ");
        System.out.println(ACC.getTien());
        System.out.print("Nhap Tien Rut: ");
        ACC.RutTien(sc.nextDouble());
        System.out.print("Tien con lai sau khi Rut: ");
        System.out.println(ACC.getTien());
        System.out.print("Tien sau dao han: ");
        ACC.DaoHan();
        System.out.println(ACC.getTien());
        System.out.print("Nhap Tien Chuyen khoan: ");
        ACC.ChuyenKhoan(sc.nextDouble());
        System.out.print("Tien con lai sau Chuyen khoan: ");
        System.out.println(ACC.getTien());
        sc.close();
    }
}
