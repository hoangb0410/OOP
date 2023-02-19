// Bai 5
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class HangThucPham {
    // Cac thuoc tinh
    private
    int ma;
    String ten;
    double donGia;
    Date NSX, HSD;
    // Constructor mac dinh
    public HangThucPham(){
    }
    // Constructor
    public HangThucPham(int ma, String ten, int donGia, Date NSX, Date HSD){
        this.ma = ma;
        this.ten=ten;
        this.donGia=donGia;
        this.NSX=NSX;
        this.HSD=HSD;
    }
    // Constructor co tham so la ma hang
    public HangThucPham(int ma){
        this.ma=ma;
    }
    // set va get
    public void setMa(int mahang){
        this.ma = mahang;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
    public void setDonGia(double dongia){
        this.donGia=dongia;
    }
    public void setNSX(Date NSX){
        this.NSX=NSX;
    }
    public void setHSD(Date HSD){
        this.HSD=HSD;
    }
    public int getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public double getDonGia(){
        return donGia;
    }
    public Date getNSX(){
        return NSX;
    }
    public Date getHSD(){
        return HSD;
    }
    // toString
    public String toString() {
        // sử dụng phương thức SimpleDateFormat để biến đổi ngày tháng năm theo dạng "dd/MM/yyyy"
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(NSX);
        String str2 = simpleDateFormat.format(HSD);
        return "Thong tin ve thuc pham: " +
                "\nMa hang : " + ma +
                "\nTen hang : " + ten +
                "\nDon gia : " + donGia +
                "\nNgay san xuat: " + str1 +
                "\nHan su dung : " + str2
                ;
    }
 
    // Nhap nam thang ngay san xuat
    public void setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.NSX = calendar.getTime();
    }
 
    // Nhap han su dung
    public void setHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.HSD = calendar.getTime();
    }
 
    // Kiem tra ten hang khong duoc de trong
    public boolean kiemTraTenHang(boolean k) {
        if (this.ten == "" || this.ten.isEmpty()) {
            System.out.println("Ten hang khong duoc de trong : ");
        } else {
            k = false;
        }
        return k;
    }
 
    //Kiem tra HSD khong duoc nho hon NSX
    public boolean kiemTraNgay(boolean t) {
        if (this.getNSX().compareTo(this.getHSD()) < 0) {
            t = false;
        } else {
            System.out.println("Ngay het han khong duoc nho hon ngay san xuat : ");
        }
        return t;
    }
 
    //Kiem tra don hang da het han chua
    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getHSD().compareTo(today) < 0) {
            System.out.println("Hom nay la ngay " + st + ", hang hoa da het han ");
        } else {
            System.out.println("Hom nay la ngay " + st + ", hang hoa chua het han ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HangThucPham tp = new HangThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhap ma hang : ");
        tp.setMa(sc.nextInt());
        sc.nextLine();
        do {
            System.out.println("Nhap ten hang : ");
            tp.setTen(sc.nextLine());
        } while (tp.kiemTraTenHang(kt));
        System.out.println("Nhap don gia : ");
        tp.setDonGia(sc.nextDouble());
        do {
            System.out.println("Nhap nam, thang, ngay san xuat: ");
            tp.setNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("Nhap nam, thang, ngay het han: ");
            tp.setHSD(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
        sc.close();
    }
}
