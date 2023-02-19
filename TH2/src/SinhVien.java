// Bai 2
import java.util.Scanner;
class SinhVien {
    private
        int MSSV=0;
        String HoTen="";
        float LT=0, TH=0;
    public SinhVien()
    {
        this.MSSV=0;
        this.HoTen="";
        this.LT=0;
        this.TH=0;
    }
    public SinhVien(int MSV, String Name, float LT, float TH)
    {
        this.MSSV=MSV;
        this.HoTen=Name;
        this.LT=LT;
        this.TH=TH;
    }
    Scanner sc = new Scanner(System.in);
    public void setMSV()
    {
        System.out.print("Nhap MSSV: ");
        int MSV = sc.nextInt();
        this.MSSV=MSV;
    }
    public void setName()
    {
        System.out.print("Nhap Ho ten: ");
        String HoTen = sc.nextLine();
        this.HoTen=HoTen;
    }
    public void setLT()
    {
        System.out.print("Nhap diem LT: ");
        float LT = sc.nextFloat();
        this.LT=LT;
    }
    public void setTH()
    {
        System.out.print("Nhap diem TH: ");
        float TH = sc.nextFloat();
        this.TH=TH;
    }
    public int getMSSV()
    {
        return MSSV;
    }
    public String getName()
    {
        return HoTen;
    }
    public float getLT()
    {
        return LT;
    }
    public float getTH()
    {
        return TH;
    }
    public float DTB()
    {
        return (TH+LT)/2;
    }
    public String toString()
    {
        return "MSSV: "+MSSV+", Ho ten: "+HoTen+", Diem ly thuyet: "+LT+", Diem thuc hanh: "+TH+", Diem trung binh: "+ DTB();
    } 
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien(19020819,"Cao Viet Hoang",10,10);
        SinhVien sv2 = new SinhVien(19020531,"Nguyen Tien Dung",9,9);
        Scanner sc = new Scanner(System.in);
        SinhVien sv3 = new SinhVien();
        sv3.setName();
        sv3.setMSV();
        sv3.setLT();
        sv3.setTH();
        System.out.printf("%-10s %-18s %-8s %-8s %-8s \n","MSSV","Ho ten","LT","TH","DTB");
        System.out.printf("%-10d %-18s %-8.2f %-8.2f %-8.2f \n",sv1.getMSSV(), sv1.getName(),sv1.getLT(),sv1.getTH(),sv1.DTB());
        System.out.printf("%-10d %-18s %-8.2f %-8.2f %-8.2f \n",sv2.getMSSV(), sv2.getName(),sv2.getLT(),sv2.getTH(),sv2.DTB());
        System.out.printf("%-10d %-18s %-8.2f %-8.2f %-8.2f \n",sv3.getMSSV(), sv3.getName(),sv3.getLT(),sv3.getTH(),sv3.DTB());
        sc.close();
    }
}
