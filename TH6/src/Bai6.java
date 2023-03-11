import java.util.Scanner;
import java.util.ArrayList;
public class Bai6 {
    public static void main(String[] args){
        ArrayList<HoaDonTheoGio> arrHoaDonTheoGio = new ArrayList<>();
        ArrayList<HoaDonTheoNgay> arrHoaDonTheoNgay = new ArrayList<>();
        int soHoaDonTheoGio, soHoaDonTheoNgay;
        double tongTienHoaDonTheoGio=0, tongTienHoaDonTheoNgay=0, trungBinhCongHoaDon = 0;
        Scanner sc = new Scanner(System.in);   
        System.out.print("Nhap so luong Hoa don theo gio: ");
        soHoaDonTheoGio=sc.nextInt();
        System.out.print("Nhap so luong Hoa don theo ngay: ");
        soHoaDonTheoNgay=sc.nextInt();
        System.out.println("Nhap thong tin Hoa don theo gio:");
        for (int i = 0; i < soHoaDonTheoGio; i++) {
            System.out.println("Nhap thong tin hoa don thu " + (i + 1) + ":");
            HoaDonTheoGio hoaDonTheoGio = new HoaDonTheoGio();
            hoaDonTheoGio.nhap();
            arrHoaDonTheoGio.add(hoaDonTheoGio);
        }
        System.out.println("Nhap thong tin Hoa don theo ngay:");
        for (int i = 0; i < soHoaDonTheoNgay; i++) {
            System.out.println("Nhap thong tin hoa don thu " + (i + 1) + ":");
            HoaDonTheoNgay hoaDonTheoNgay = new HoaDonTheoNgay();
            hoaDonTheoNgay.nhap();
            arrHoaDonTheoNgay.add(hoaDonTheoNgay);
        }
        System.out.println("---Thong tin cac hoa don theo gio---");
        for (int i = 0; i < arrHoaDonTheoGio.size(); i++) {
            System.out.println(arrHoaDonTheoGio.get(i).toString());
        }
        System.out.println("---Thong tin cac hoa don theo gio---");
        for (int i = 0; i < arrHoaDonTheoNgay.size(); i++) {
            System.out.println(arrHoaDonTheoNgay.get(i).toString());
        }
        // Tinh trung binh hoa don tien phong 9/2013
        for (int i = 0; i < arrHoaDonTheoGio.size(); i++) {
            String[] dateHoaDonTheoGio = arrHoaDonTheoGio.get(i).getNgayHD().split("/");
            if (dateHoaDonTheoGio[1].equals("9") && dateHoaDonTheoGio[2].equals("2013"))
                tongTienHoaDonTheoGio += arrHoaDonTheoGio.get(i).TTien();
        }
        for (int i = 0; i < arrHoaDonTheoNgay.size(); i++) {
            String[] dateHoaDonTheoNgay = arrHoaDonTheoNgay.get(i).getNgayHD().split("/");
            if (dateHoaDonTheoNgay[1].equals("9") && dateHoaDonTheoNgay[2].equals("2013"))
                tongTienHoaDonTheoNgay += arrHoaDonTheoNgay.get(i).TTien();
        }
        trungBinhCongHoaDon  = (tongTienHoaDonTheoGio+tongTienHoaDonTheoNgay) / (arrHoaDonTheoGio.size()+arrHoaDonTheoNgay.size());
        System.out.println("Trung binh thanh tien cua hoa don thue phong thang 9/2013: " + trungBinhCongHoaDon);    
        sc.close();
    }
}
class HoaDon{
    private 
        int MaHD;
        String NgayHD;
        String TenKH;
        int MaPhong;
        double DonGia;
    Scanner in = new Scanner(System.in);
// Constructors
    protected HoaDon(){
        this.MaHD=0;
        this.NgayHD="";
        this.TenKH="";
        this.MaPhong=0;
        this.DonGia=0;
    }
    protected HoaDon(int MaHD, String NgayHD, String TenKH, int MaPhong, double DonGia){
        this.MaHD=MaHD;
        this.NgayHD=NgayHD;
        this.TenKH=TenKH;
        this.MaPhong=MaPhong;
        this.DonGia=DonGia;
    }
// seter 
    protected void setMaHD(int MaHD) {
        this.MaHD=MaHD;
    }
    protected void setNgayHD(String NgayHD){
        this.NgayHD=NgayHD;
    }
    protected void setTenKH(String TenKH){
        this.TenKH=TenKH;
    }
    protected void setMaPhong(int MaPhong){
        this.MaPhong=MaPhong;
    }
    protected void setDonGia(double DonGia){
        this.DonGia=DonGia;
    }
// geter
    protected int getMaHD(){
        return this.MaHD;
    }
    protected String getNgayHD(){
        return this.NgayHD;
    }
    protected String getTenKH(){
        return this.TenKH;
    }
    protected int getMaPhong(){
        return this.MaPhong;
    }
    protected double getDonGia(){
        return this.DonGia;
    }
    protected void nhap(){
        System.out.println("Ma Hoa Don: ");
        MaHD = in.nextInt();
        System.out.println("Ngay Hoa Don (Ngay/Thang/Nam): ");
        NgayHD = in.next();
        in.nextLine();
        System.out.println("Ten Khach Hang: ");
        TenKH = in.nextLine();
        System.out.println("Ma Phong: ");
        MaPhong = in.nextInt();
        System.out.println("Don Gia: ");
        DonGia = in.nextDouble();
    }
    public String toString()
    {
        return " [MaHD=" + MaHD + ", NgayHD=" + NgayHD + ", TenKH=" + TenKH + ", MaPhong=" + MaPhong + ", DonGia=" + DonGia;
    }
}
class HoaDonTheoGio extends HoaDon{
    private 
        double SoGioThue;
        double ThanhTienTheoGio;
    public HoaDonTheoGio(){
        super();
        this.SoGioThue=0;
    }
    public HoaDonTheoGio(int MaHD, String NgayHD, String TenKH, int MaPhong, double DonGia, int SoGioThue){
        super(MaHD, NgayHD, TenKH, MaPhong, DonGia);
        this.SoGioThue=SoGioThue;
    }
    public double GetSoGioThue(){
        return this.SoGioThue;
    }
    public void setSoGioThue(int SoGioThue){
        this.SoGioThue=SoGioThue;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("So Gio Thue: ");
        SoGioThue = in.nextInt();
    }
    public double TTien(){
        if (SoGioThue<=24)
            return this.ThanhTienTheoGio=(double)this.SoGioThue*this.DonGia;
        else
            return this.ThanhTienTheoGio=(double)24*this.DonGia;
    }
    public String toString(){
        return "Hoa Don Theo Gio: " + super.toString()+", So Gio Thue: "+this.SoGioThue+", Thanh Tien: "+ this.ThanhTienTheoGio+"]";
    }
}
class HoaDonTheoNgay extends HoaDon{
    private 
        double SoNgayThue;
        double ThanhTienTheoNgay;
    public HoaDonTheoNgay(){
        super();
        this.SoNgayThue=0;
    }
    public HoaDonTheoNgay(int MaHD, String NgayHD, String TenKH, int MaPhong, double DonGia, int SoNgayThue){
        super(MaHD, NgayHD, TenKH, MaPhong, DonGia);
        this.SoNgayThue=SoNgayThue;
    }
    public double GetSoNgayThue(){
        return this.SoNgayThue;
    }
    public void setSoNgayThue(int SoNgayThue){
        this.SoNgayThue=SoNgayThue;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("So Ngay Thue: ");
        SoNgayThue = in.nextInt();
    }
    public double TTien(){
        if (SoNgayThue<=7)
            return this.ThanhTienTheoNgay=this.SoNgayThue*this.DonGia;
        else
            return this.ThanhTienTheoNgay=this.SoNgayThue*this.DonGia*0.8;
    }
    public String toString(){
        return "Hoa Don Theo Ngay: " + super.toString()+", So Ngay Thue: "+this.SoNgayThue+", Thanh Tien: "+ this.ThanhTienTheoNgay+"]";
    }
}