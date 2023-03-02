import java.util.ArrayList;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> arrSachThamKhao = new ArrayList<>();
        int soSachGiaoKhoa, soSachThamKhao;
        double tongTienSachGiaoKhoa = 0, tongTienSachThamKhao = 0, tongDonGiaSachThamKhao = 0, 
            trungBinhCongDonGia = 0;

        Scanner sc = new Scanner(System.in);         
        System.out.print("Nhap so sach giao khoa: ");
        soSachGiaoKhoa = sc.nextInt();
        System.out.print("Nhap so sach tham khao: ");
        soSachThamKhao = sc.nextInt();
         
        System.out.println("Nhap thong tin sach giao khoa:");
        for (int i = 0; i < soSachGiaoKhoa; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            arrSachGiaoKhoa.add(sachGiaoKhoa);
        }
         
        System.out.println("Nhap thong tin sach tham khao:");
        for (int i = 0; i < soSachThamKhao; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            SachThamKhao sachThamKhao = new SachThamKhao();
            sachThamKhao.nhapSach();
            arrSachThamKhao.add(sachThamKhao);
        }
         
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            if (arrSachGiaoKhoa.get(i).getNumber() == 0) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                    arrSachGiaoKhoa.get(i).getDonGia() * 50 / 100;
            } else if (arrSachGiaoKhoa.get(i).getNumber() == 1) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                    arrSachGiaoKhoa.get(i).getDonGia();
            }
        }
        System.out.println("Tong tien sach giao khoa = " + tongTienSachGiaoKhoa);
         
        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            tongTienSachThamKhao += arrSachThamKhao.get(i).getSoLuong() * 
                arrSachThamKhao.get(i).getDonGia() + arrSachThamKhao.get(i).getThue();
        }
        System.out.println("Tong tien sach tham khao = " + tongTienSachThamKhao);
         
        System.out.println("-----Thong tin sach giao khoa-----");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            System.out.println(arrSachGiaoKhoa.get(i).toString());
        }
         
        System.out.println("-----Thong tin sach tham khao-----");
        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            System.out.println(arrSachThamKhao.get(i).toString());
        }
         
        System.out.println("---Trung binh cong don gia cac sach tham khao---");
        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            tongDonGiaSachThamKhao += arrSachThamKhao.get(i).getDonGia();
            trungBinhCongDonGia = tongDonGiaSachThamKhao / arrSachThamKhao.size();
        }
        System.out.println("Trung binh cong don gia cac sach tham khao = " + trungBinhCongDonGia);
         
        System.out.println("---Cac sach giao khoa cua NXB X---");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            if (arrSachGiaoKhoa.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(arrSachGiaoKhoa.get(i).toString());
            }
        }
        sc.close();
    }
}
class Sach{
    private
    String maSach, nhaXuatBan;
    double donGia;
    int soLuong;
    Scanner sc = new Scanner(System.in);
    public Sach() {
        super();
    }
    public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong) {
        super();
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
 
    public String getMaSach() {
        return maSach;
    }
 
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
 
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
 
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
 
    public double getDonGia() {
        return donGia;
    }
 
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
 
    public int getSoLuong() {
        return soLuong;
    }
 
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
 
    public void nhapSach() {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
    }

    public String toString() {
        return "Ma sach: " + this.maSach + ", ten NXB: " + this.nhaXuatBan + ", don gia: " + 
                this.donGia + ", so luong: " + this.soLuong;
    }
}
class SachGiaoKhoa extends Sach {
    private String tinhTrang;
    private int number; 
    public SachGiaoKhoa() {
        super();
    }
 
    public SachGiaoKhoa(String tinhTrang, int number) {
        super();
        this.tinhTrang = tinhTrang;
        this.number = number;
    }
 
    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
 
    public int getNumber() {
        return number;
    }
 
    public void setNumber(int number) {
        this.number = number;
    }
 
    public String tinhTrangSach(int x) {
        switch (number) {
            case 0:
                tinhTrang = "cu";
                break;
            case 1:
                tinhTrang = "moi";
                break;
            default:
                break;
        }
        return tinhTrang;
    }
     
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap tinh trang sach (0 - cu/ 1 - moi): ");
        number = sc.nextInt();
    }
     
    public String toString() {
        return super.toString() + ", tinh trang sach: " + this.tinhTrangSach(number);
    }
}
class SachThamKhao extends Sach {
    private double thue;
 
    public SachThamKhao() {
        super();
    }
 
    public SachThamKhao(double thue) {
        super();
        this.thue = thue;
    }
 
    public double getThue() {
        return thue;
    }
 
    public void setThue(double thue) {
        this.thue = thue;
    }
 
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap thue: ");
        thue = sc.nextDouble();
    }
     
    public String toString() {
        return super.toString() + ", thue: " + this.thue;
    }     
}