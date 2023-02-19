// Bai 7
import java.util.Scanner;
public class CD {
    private
    int MaCD;
    String TuaCD;
    String CaSi;
    int SoBaiHat;
    double Gia;
    // Constructor mac dinh
    public CD(){}
    // Constructor co tham so
    public CD(int MaCD,String TuaCD, String CaSi, int SoBaiHat, double Gia){
        this.MaCD=MaCD;
        this.TuaCD=TuaCD;
        this.CaSi=CaSi;
        this.SoBaiHat=SoBaiHat;
        this.Gia=Gia;
    }
    // set va get
    public void setMaCD(int MaCD){
        this.MaCD=MaCD;
    }
    public void setTuaCD(String TuaCD){
        this.TuaCD=TuaCD;
    }
    public void setCaSi(String CaSi){
        this.CaSi=CaSi;
    }
    public void setSoBaiHat(int SoBaiHat){
        this.SoBaiHat=SoBaiHat;
    }
    public void setGia(double Gia){
        this.Gia=Gia;
    }
    public int getMaCD(){
        return MaCD;
    }
    public String getTuaCD(){
        return TuaCD;
    }
    public String getCaSi(){
        return CaSi;
    }
    public int getSoBaiHat(){
        return SoBaiHat;
    }
    public double getGia(){
        return Gia;
    }
    // Override Phuong thuc toString
    public String toString(){
        return "Thong tin CD:"+
                "\nMa CD: "+MaCD+
                "\nTua CD: "+TuaCD+
                "\nCa si: "+CaSi+
                "\nSo bai hat: "+SoBaiHat+
                "\nGia CD:  "+Gia;
    }
    // Phuong thuc hien thi
    public void hienThiCD(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",MaCD,TuaCD,CaSi,SoBaiHat,Gia);
    }
    // Nhap cac bai hat 
    static Scanner sc = new Scanner(System.in);
    static void nhapCD(CD ab) {
        System.out.print("Nhap ma CD: ");
        ab.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap tua CD: ");
        ab.setTuaCD(sc.nextLine());
        System.out.print("Nhap ten ca si: ");
        ab.setCaSi(sc.nextLine());
        System.out.print("Nhap so luong bai bat: ");
        ab.setSoBaiHat(sc.nextInt());
        System.out.print("Nhap gia thanh: ");
        ab.setGia(sc.nextFloat());
    }
    public static void main(String[] args) {
        CD alb[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Ban chon muon lam gi?");
            System.out.println("1. Nhap thong tin CD \n" +
                    "2. Xuat danh sach CD.\n" + "3. Tinh tong gia thanh \n" + "4. Tong so luong CD \n" +
                    "5. Sap xep giam dan theo gia thanh\n"+"6. Sap xep tang dan theo tua CD\n"+"Nhap so khac de thoat");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhap so luong CD : ");
                    n = sc.nextInt();
                    alb = new CD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thu " + (i + 1)+": ");
                        alb[i] = new CD();
                        nhapCD(alb[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Ma CD", "Tua CD", "Ten ca si", "So bai hat", "Gia thanh");
                    for (int i = 0; i < n; i++) {
                        alb[i].hienThiCD();
                    }
                    break;
                case 3:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += alb[i].getGia();
                    }
                    System.out.println("" +
                            "Tong gia thanh la : " + tong);
                    break;
                case 4:
                    System.out.println("Tong so luong CD la: " + n);
                    break;
                case 5:
                    CD temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getGia() < alb[j].getGia()) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong, nhap 2 de kiem tra!");
                    break;
                case 6:
                    temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getTuaCD().compareTo(alb[j].getTuaCD())>0) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong, nhap 2 de kiem tra!");
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        }while (flag) ;
    }
}
