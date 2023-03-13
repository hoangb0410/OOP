import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args){
        QuanLy listPerson = new QuanLy();
        Scanner sc = new Scanner(System.in);
        int x;
        do
        {
            System.out.println("\n\t\t----------------------------------");
            System.out.println("\t\t|0. Thoat Ung dung\t\t\t\t |");
            System.out.println("\t\t|1. Them Sinh vien \t\t\t\t |");
            System.out.println("\t\t|2. Them Nhan vien \t\t\t |");
            System.out.println("\t\t|3. Them Khach hang \t\t\t |");
            System.out.println("\t\t|4. Sap xep danh sach theo ten \t\t\t |");
            System.out.println("\t\t|5. Hien Thi Danh Sach\t\t |");
            System.out.println("\t\t--------------------------------------");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                    Student sv = new Student();
                    sv.nhap();
                    listPerson.ThemNguoi(sv);
                    break;
                case 2:
                    Employee nv = new Employee();
                    nv.nhap();
                    listPerson.ThemNguoi(nv);
                    break;
                case 3:
                    Customer khach = new Customer();
                    khach.nhap();
                    listPerson.ThemNguoi(khach);
                    break;
                case 4:
                    listPerson.SortByName();
                    break;
                case 5:                
                    listPerson.xuat();
                    break;
                
            }
        }while(x!=0);
        System.out.println("");
        sc.close();
    }
}
class Person{
    private
        String HoTen;
        String DiaChi;
// constructors
    protected Person(){
        this.HoTen="";
        this.DiaChi="";
    }
    protected Person(String HoTen, String DiaChi){
        this.HoTen=HoTen;
        this.DiaChi=DiaChi;
    }
// set & get
    protected void setHoTen(String HoTen){
        this.HoTen=HoTen;
    }
    protected void setDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    protected String getHoTen(){
        return this.HoTen;
    }
    protected String getDiaChi(){
        return this.DiaChi;
    }
    Scanner in = new Scanner(System.in);
    protected void nhap(){
        System.out.print("Ho va ten: ");
        HoTen = in.nextLine();
        System.out.print("Dia Chi: ");
        DiaChi = in.nextLine();
    }

// to String
    public String toString(){
        return "Ho Ten: "+HoTen+", Dia Chi: "+DiaChi; 
    }
}
class Student extends Person {
    private 
        double mon1;
        double mon2;
    public Student(){
        super();
        this.mon1=0;
        this.mon2=0;
    }
    public Student(String HoTen, String DiaChi,  double mon1,  double mon2){
        super();
        this.mon1=mon1;
        this.mon2=mon2;
    }
    public void setMon1(double mon1){
        this.mon1=mon1;
    }
    public void setMon2(double mon2){
        this.mon2=mon2;
    }
    public double getMon1(){
        return this.mon1;
    }
    public double getMon2(){
        return this.mon2;
    }
    public void nhap(){
        super.nhap();
        System.out.print("Diem mon 1: ");
        mon1 = in.nextDouble();
        System.out.print("Diem mon 2: ");
        mon2 = in.nextDouble();
    }
// toString
    public String toString(){
        return "Thong tin sinh vien: "+super.toString()+", Diem mon 1: "+this.mon1+ ", Diem mon 2: "+this.mon2;
    }
}
class Employee extends Person{
    private 
        double heSoLuong;
    public Employee(){
        super();
        this.heSoLuong=0;
    }
    public Employee(String HoTen, String DiaChi, double heSoLuong){
        super();
        this.heSoLuong=heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong){
        this.heSoLuong=heSoLuong;
    }
    public double getHeSoLuong(){
        return this.heSoLuong;
    }
    public void nhap(){
        super.nhap();
        System.out.print("He so luong : ");
        heSoLuong = in.nextDouble();
    }
    public String toString(){
        return "Thong tin nhan vien: "+super.toString()+", He so luong: "+this.heSoLuong;
    }
}
class Customer extends Person{
    private
        String TenCty;
        double TriGiaHoaDon;
        String DanhGia;
    public Customer(){
        super();
        this.TenCty="";
        this.TriGiaHoaDon=0;
        this.DanhGia="";
    }
    public Customer(String HoTen, String DiaChi,String TenCty, double TriGiaHoaDon,String DanhGia){
        super(HoTen, DiaChi);
        this.TenCty=TenCty;
        this.TriGiaHoaDon=TriGiaHoaDon;
        this.DanhGia=DanhGia;
    }
    public void setTenCty(String TenCty){
        this.TenCty=TenCty;
    }
    public String getTenCty(){
        return this.TenCty;
    }
    public void setTriGiaHoaDon(double TriGiaHoaDon){
        this.TriGiaHoaDon=TriGiaHoaDon;
    }
    public double getTriGiaHoaDon(){
        return this.TriGiaHoaDon;
    }
    public void setDanhGia(String DanhGia){
        this.DanhGia=DanhGia;
    }
    public String getDanhGia(){
        return this.DanhGia;
    }
    public void nhap(){
        super.nhap();
        System.out.print("Ten cong ty: ");
        TenCty = in.nextLine();
        System.out.print("Tri gia hoa don: ");
        TriGiaHoaDon = in.nextDouble();
        in.nextLine();
        System.out.print("Danh Gia: ");
        DanhGia=in.nextLine();
    }
    public String toString(){
        return "Thong tin khach hang: "+super.toString()+", Ten Cong ty: "+TenCty+", Tri gia hoa don: "+TriGiaHoaDon+", Danh gia: "+ DanhGia;
    }
}
class QuanLy{
    int n=100,c,i;
    Person ps[]=new Person[n];
    private int tongNguoi;
    public QuanLy()
    {
        tongNguoi=0;
        for(int i=0; i<100; i++)
        ps[i] = new Person();
    }
    // them nguoi
    public void ThemNguoi(Person addPerson)
    {
        if(tongNguoi>100)
            System.out.println("Bo nho full !");
        else
        {           
            ps[tongNguoi] = new Person();
            ps[tongNguoi] = addPerson;
            tongNguoi++;
        }
    }
    // xoa nguoi
    public void XoaNguoi(String Name){
        for (c=i=0;i<n;i++){
            if (ps[i].getHoTen() != Name){
                ps[c] = ps[i];
                c++;
            }
        }     
    }
    // sap xep danh sach theo thu tu ho ten
    public void SortByName(){
        for (i=0;i<n-1;i++)
            for (int j=i+1;j<n;j++)
                if (ps[j].getHoTen().compareTo(ps[i].getHoTen())<0){
                    Person tam = ps[j];
                    ps[j]=ps[i];
                    ps[i]=tam;
                }
    }
    // xuat danh sach
    public void xuat(){
        for(i=0; i<tongNguoi; i++)
        {
            System.out.println("\n----So TT: " + (i+1));
            System.out.println(ps[i].toString());
        }
    }    
}