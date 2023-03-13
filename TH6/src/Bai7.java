public class Bai7 {
    public static void main(String[] args){

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
// to String
    public String toString(){
        return "Thong tin: [Ho Ten: "+HoTen+", Dia Chi: "+DiaChi; 
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
// toString
    public String toString(){
        return "Thong tin hoc sinh: "+super.toString()+", Diem mon 1: "+this.mon1+ ", Diem mon 2: "+this.mon2;
    }
}
class Employee extends Person{
    private 
        double heSoLuong;
    public Employee(){
        super();
        this.heSoLuong=0;
    }
    public Employee(double heSoLuong){
        super();
        this.heSoLuong=heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong){
        this.heSoLuong=heSoLuong;
    }
    public double getHeSoLuong(){
        return this.heSoLuong;
    }
    public String toString(){
        return "Thong tin nhan vien: "+super.toString()+", He so luong: "+this.heSoLuong;
    }
}
class Customer extends Person{
    private
        String Ten;
        double TriGiaHoaDon;
        String DanhGia;
}