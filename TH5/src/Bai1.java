import java.util.Scanner;
import java.util.ArrayList;
public class Bai1 {
    public static void main(String[] args){
        ArrayList<ChuyenXeNoiThanh> arrChuyenXeNoiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> arrChuyenXeNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so chuyen xe noi thanh: ");
        soChuyenNoiThanh = sc.nextInt();
        System.out.print("Nhap so chuyen xe ngoai thanh: ");
        soChuyenNgoaiThanh = sc.nextInt();
         
        System.out.println("Nhap thong tin chuyen xe noi thanh:");
        for (int i = 0; i < soChuyenNoiThanh; i++) {
            System.out.println("Nhap thong tin chuyen xe thu " + (i + 1) + ":");
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhapThongTinChuyenXe();
            doanhThuXeNoiThanh += chuyenXeNoiThanh.getDoanhThu();
            arrChuyenXeNoiThanh.add(chuyenXeNoiThanh);
        }
         
        System.out.println("Nhap thong tin chuyen xe ngoai thanh:");
        for (int i = 0; i < soChuyenNgoaiThanh; i++) {
            System.out.println("Nhap thong tin chuyen xe thu " + (i + 1) + ":");
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhapThongTinChuyenXe();
            doanhThuXeNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
            arrChuyenXeNgoaiThanh.add(chuyenXeNgoaiThanh);
        }
         
        System.out.println("-----Thong tin chuyen xe noi thanh-----");
        for (int i = 0; i < arrChuyenXeNoiThanh.size(); i++) {
            System.out.println(arrChuyenXeNoiThanh.get(i).toString());
        }
         
        System.out.println("-----Thong tin chuyen xe ngoai thanh-----");
        for (int i = 0; i < arrChuyenXeNgoaiThanh.size(); i++) {
            System.out.println(arrChuyenXeNgoaiThanh.get(i).toString());
        }
         
        System.out.println("Doanh thu tung chuyen xe: ");
        System.out.println("Doanh thu chuyen xe noi thanh: " + doanhThuXeNoiThanh);
        System.out.println("Doanh thu chuyen xe ngoai thanh: " + doanhThuXeNgoaiThanh);
        sc.close();
    }
} 
class ChuyenXe{
    protected String maSoChuyen, hoTenTaiXe, soXe;
    protected double doanhThu;    
    public ChuyenXe() {
        super();
        this.maSoChuyen = "";
        this.hoTenTaiXe = "";
        this.soXe = "";
        this.doanhThu = 0;
    }
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super();
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    } 
    public String getMaSoChuyen() {
        return maSoChuyen;
    }
    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }
    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    public String getSoXe() {
        return soXe;
    }
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    public double getDoanhThu() {
        return doanhThu;
    }
    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    Scanner sc = new Scanner(System.in); 
    public void nhapThongTinChuyenXe() {
        System.out.print("Nhap ma so chuyen: ");
        maSoChuyen = sc.nextLine();
        System.out.print("Nhap ho ten tai xe: ");
        hoTenTaiXe = sc.nextLine();
        System.out.print("Nhap so xe: ");
        soXe = sc.nextLine();
        System.out.print("Nhap doanh thu: ");
        doanhThu = sc.nextDouble();
    } 
    public String toString() {
        return "Ma so chuyen: " + this.maSoChuyen + ", Ho ten tai xe: " + this.hoTenTaiXe
                + ", so xe: " + this.soXe + ", doanh thu: " + this.doanhThu;
    }
}
class ChuyenXeNoiThanh extends ChuyenXe {
    private String soTuyen;
    private double soKmDiDuoc;    
    public ChuyenXeNoiThanh() {
        super();
    }
    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    } 
    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    public Scanner getScanner() {
        return sc;
    } 
    public void setScanner(Scanner scanner) {
        this.sc = scanner;
    }
    public void nhapThongTinChuyenXe() {
        super.nhapThongTinChuyenXe();   // gọi hàm nhapThongTinChuyenXe() của lớp ChuyenXe
        System.out.print("Nhap so tuyen: ");
        soTuyen = sc.nextLine();
        System.out.print("Nhap so km di duoc: ");
        soKmDiDuoc = sc.nextDouble();
    }    
    public String toString() {
        return super.toString() + ", so tuyen: " + this.soTuyen + 
                ", so km di duoc: " + this.soKmDiDuoc;
    }
}
class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;     
    public ChuyenXeNgoaiThanh() {
        super();
        this.noiDen = "";
        this.soNgayDiDuoc = 0;
    } 
    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    public String getNoiDen() {
        return noiDen;
    } 
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    } 
    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    } 
    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }     
    public void nhapThongTinChuyenXe() {
        super.nhapThongTinChuyenXe();
        System.out.print("Nhap noi den: ");
        noiDen = sc.nextLine();
        System.out.print("Nhap so ngay di duoc: ");
        soNgayDiDuoc = sc.nextInt();
    }
    public String toString() {
        return super.toString() + ", noi den: " + this.noiDen + ", so ngay di duoc: " + 
                this.soNgayDiDuoc;
    }
}

