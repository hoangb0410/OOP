import java.util.Scanner;
public class Bai6_SinhVien {
    static Scanner sc = new Scanner(System.in);
    static void nhapThongTin(SV tt) {
        System.out.print("Nhap MSSV: ");
        tt.setMSSV(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap Ho va Ten: ");
        tt.setHoTen(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        tt.setDiaChi(sc.nextLine());
        do {
            System.out.print("Nhap so dien thoai gom 7 so: ");
            tt.setSDT(sc.nextLine());
        } while (tt.getSDT().length() != 7);
    }
    public static void main(String[] args){
        SV sv[] = null;
        int n = 0;
        // Nhap danh sach sinh vien
        System.out.print("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        sv = new SV[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1)+": ");
            sv[i] = new SV();
            nhapThongTin(sv[i]);
        }
        // In danh sach sinh vien theo thu tu tang dan MSSV
        SV temp = sv[0];
        for (int i = 0; i < sv.length - 1; i++) {
            for (int j = i + 1; j < sv.length; j++) {
                if (sv[i].getMSSV() > sv[j].getMSSV()) {
                    temp = sv[j];
                    sv[j] = sv[i];
                    sv[i] = temp;
                }
            }
        }
        System.out.printf("%-5s %15s %15s %20s \n", "MSSV", "Ho va ten", "Dia chi", "So dien thoai");
        for (int i = 0; i < n; i++) {
            sv[i].HienThi();
        }
    }
}
class SV{
    // Cac thuoc tinh
    private
    int MSSV;
    String HoTen;
    String DiaChi;
    String SDT;
    // Constructor mac dinh
    public  SV(){}
    // Constructor chua cac tham so 
    public SV(int MSSV, String HoTen, String DiaChi, String SDT){
        this.MSSV=MSSV;
        this.HoTen=HoTen;
        this.DiaChi=DiaChi;
        this.SDT=SDT;
    }
    // set va get
    public void setMSSV(int MSSV){
        this.MSSV=MSSV;
    }
    public void setHoTen(String HoTen){
        this.HoTen=HoTen;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    public void setSDT(String SDT){
        this.SDT=SDT;
    }
    public int getMSSV(){
        return MSSV;
    }
    public String getHoTen(){
        return HoTen;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public String getSDT(){
        return SDT;
    }
    // Override Phuong thuc toString
    public String toString(){
        return "Thong tin sinh vien:"+
                "\nMSSV: "+ MSSV +
                "\nHo Ten: "+ HoTen +
                "\nDia Chi: "+ DiaChi +
                "\nSDT: "+SDT+"\n";
    }
    public void HienThi() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", MSSV, HoTen, DiaChi, SDT);
    }
}
