import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args){
        KhachHangList lkh = new KhachHangList();
        Scanner in = new Scanner(System.in);
        int x;
        do
        {
            System.out.println("\n\t\t------------------------------------");
            System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |");
            System.out.println("\t\t|1. Them Khach Hang Viet\t\t\t |");
            System.out.println("\t\t|2. Them Khach Hang Nuoc Ngoai\t\t\t |");
            System.out.println("\t\t|3. Hien Thi Danh Sach Khach Hang\t\t |");
            System.out.println("\t\t|4. Xem Tong (KW)cua cac KH\t\t |");
            System.out.println("\t\t|5. Xem TB Thanh Tien cua KH NN\t |");
            System.out.println("\t\t--------------------------------------");
            x=in.nextInt();
            System.out.println("======>>");
            switch(x)
            {
                case 1:
                    lkh.ThemKH(1);
                    break;
                case 2:
                    lkh.ThemKH(2);
                    break;
                case 3:
                    lkh.HienThiKH();
                    break;
                case 4:
                    lkh.TongSL();
                    break;
                case 5:
                    lkh.TrungBinh();
                    break;
            }
        }while(x!=0);
        System.out.println("");
        in.close();
    }
}
class KhachHang
{
    protected int MaKH, SoLuong;
    protected double DonGia, ThanhTien;
    protected String NgayHD, HoTenKH;
    Scanner in =new Scanner(System.in);
    protected KhachHang()
    {
        this.MaKH=0;
        this.DonGia=0;
        this.NgayHD="";
        this.HoTenKH="";
        this.SoLuong=0;
    }
    protected KhachHang(int ma, double dgia, String ngay, String hoten, int sl, double ttien)
    {
        this.MaKH=ma;
        this.DonGia=dgia;
        this.NgayHD=ngay;
        this.HoTenKH=hoten;
        this.SoLuong=sl;
        this.ThanhTien=ttien;
    }
    protected int getMaKH() {
        return MaKH;
    }
    protected void setMaKH(int maKH) {
        MaKH = maKH;
    }
    protected double getDonGia() {
        return DonGia;
    }
    protected void setDonGia(double donGia) {
        DonGia = donGia;
    }
    protected String getNgayHD() {
        return NgayHD;
    }
    protected void setNgayHD(String ngayHD) {
        NgayHD = ngayHD;
    }
    protected String getHoTenKH() {
        return HoTenKH;
    }
    protected void setHoTenKH(String hoTenKH) {
        HoTenKH = hoTenKH;
    }
    protected int getSoLuong() {
        return SoLuong;
    }
    protected void setSoLuong(int sl) {
        SoLuong = sl;
    }
    protected double getThanhTien() {
        return ThanhTien;
    }
    protected void setThanhTien(double thanhTien) {
        ThanhTien = thanhTien;
    }
    protected void nhap()
    {
        System.out.println("Nhap Ma Khach Hang: ");
        MaKH = in.nextInt();
        System.out.println("Ho va Ten Khach Hang: ");
        HoTenKH = in.next();
        System.out.println("Ngay Lap Hoa Don: ");
        NgayHD = in.next();
        System.out.println("So Luong(KW): ");
        SoLuong = in.nextInt();
        System.out.println("Don Gia: ");
        DonGia = in.nextDouble();
    }
    public String toString() {
        return "[MaKH: " + MaKH + ", HoTenKH: " + HoTenKH + ", NgayHD: " + NgayHD + ", DonGia: " + DonGia + ", SoLuong: " +SoLuong;
    }
}
class KhachHangNuocNgoai extends KhachHang
{
    private String QuocTich;
    public KhachHangNuocNgoai()
    {
        super();
        this.QuocTich="";
    }
    public KhachHangNuocNgoai(int ma, double dgia, String ngay, String hoten,
    int sl, double ttien, String qt)
    {
        super(ma, dgia, ngay, hoten, sl, ttien);
        this.QuocTich=qt;
    }
    public String getQuocTich() {
        return QuocTich;
    }
    public void setQuocTich(String quocTich) {
        QuocTich = quocTich;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Quoc Tich: ");
        QuocTich = in.next();
    }
    public double TTien()
    {
        return this.ThanhTien = this.SoLuong*this.DonGia;
    }
    public String toString()
    {
        return "Khach Hang Nuoc Ngoai: " + super.toString() + ", QuocTich: " + QuocTich + ", ThanhTien: " + ThanhTien;
    }
}
class KhachHangViet extends KhachHang
{
    private int LoaiKH, DinhMuc;
    public KhachHangViet()
    {
        super();
        this.LoaiKH=0;
        this.DinhMuc=0;
    }
    public KhachHangViet(int ma, double dgia, String ngay, String hoten, int sl, double ttien, int loai, int dm)
    {
        super(ma, dgia, ngay, hoten, sl, ttien);
        this.LoaiKH = loai;
        this.DinhMuc = dm;
    }
    public int getLoaiKH() {
        return LoaiKH;
    }
    public void setLoaiKH(int loaiKH) {
        LoaiKH = loaiKH;
    }
    public int getDinhMuc() {
        return DinhMuc;
    }
    public void setDinhMuc(int dinhMuc) {
        DinhMuc = dinhMuc;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Loai Khach Hang (1=SinhHoat, 2=KinhDoanh, 3=SanXuat)");
        LoaiKH = in.nextInt();
        System.out.println("Dinh Muc: ");
        DinhMuc = in.nextInt();
    }
    public double TTien()
    {
        if(SoLuong<=DinhMuc)
            return this.ThanhTien=this.DonGia*this.SoLuong;
        else
            return this.ThanhTien=this.DinhMuc*this.DonGia + (this.SoLuong-this.DinhMuc)*this.DonGia*2.5;
    }
    public String toString()
    {
        String temp;
        if(LoaiKH==1)
            temp="Sinh Hoat";
        else if(LoaiKH==2)
            temp="Kinh Doanh";
        else
            temp="San Xuat";
        return "Khach Hang Viet: " + super.toString() + ", LoaiKH: " + temp + ", Dinh Muc: " + DinhMuc + ", Thanh Tien: " + ThanhTien;
    }
}
class KhachHangList
{
    private KhachHang kh[] = new KhachHang[100];
    private int CountKH, sum1=0, sum2=0, dem=0, sumtien=0;
    public KhachHangList()
    {
        CountKH=0;
        for(int i=0; i<100; i++)
        kh[i] = new KhachHang();
    }
    public void ThemKH(int temp)
    {
        if(CountKH>100)
            System.out.println("Bo Nho Da Day, ko the them!");
        else
        {
            if(temp==1)
            {
                kh[CountKH] = new KhachHangViet();
                KhachHangViet khv = new KhachHangViet();
                khv.nhap();
                khv.ThanhTien = khv.TTien();
                kh[CountKH]=khv;
                sum1+=khv.SoLuong;
            }
            else
            {
                kh[CountKH] = new KhachHangNuocNgoai();
                KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
                khnn.nhap();
                khnn.ThanhTien = khnn.TTien();
                kh[CountKH] = khnn;
                sum2 += khnn.SoLuong;
                sumtien += khnn.ThanhTien;
                dem++;
            }
            CountKH++;
        }
    }
    public void HienThiKH()
    {
        for(int i=0; i<CountKH; i++)
        {
            System.out.println("\nSo TT: " + (i+1));
            System.out.println(kh[i].toString());
        }
    }
    public void TongSL()
    {
        System.out.println(":::->> Tong So Luong(KW) Dien cua KH Viet Nam: " + sum1);
        System.out.println(":::->> Tong So Luong(KW) Dien cua KH Nuoc Ngoai: "+ sum2);
    }
    public void TrungBinh()
    {
        System.out.println("|-->> Trung Binh Thanh Tien cua KH Nuoc Ngoai: " + (sumtien/dem));
    }
}
