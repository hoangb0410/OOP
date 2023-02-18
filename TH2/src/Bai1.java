import java.util.Scanner;
public class Bai1{
    public static void main(String[] args) {  
        HinhChuNhat HCN = new HinhChuNhat();
        Scanner sc = new Scanner(System.in);
        float d= sc.nextFloat();
        float r= sc.nextFloat();    
        HCN.setdairong(d,r); 
        System.out.println("Chieu dai: "+HCN.getDai());
        System.out.println("Chieu rong: "+HCN.getRong());
        System.out.println("Dientich: "+HCN.DienTich());
        System.out.println("Chu vi: "+HCN.ChuVi());
        System.out.println("Thong tin: "+HCN.toString());
        sc.close();
    }
}
class HinhChuNhat {
    private float dai, rong;
    public void setdairong(float d, float r)
    {
        this.dai=d;
        this.rong=r;
    }
    public float getDai()
    {
        return dai;
    }
    public float getRong()
    {
        return rong;
    }
    public float DienTich()
    {
        return dai*rong;
    }
    public float ChuVi()
    {
        return (dai+rong)*2;
    }    
    public String toString()
    {
        return "Chieu dai = " + dai + ", Chieu rong = "+ rong + ", Dien tich = "+dai*rong+", Chu vi = "+ (dai+rong)*2;
    }
}

