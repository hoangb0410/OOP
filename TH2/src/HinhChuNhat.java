// Bai 1
import java.util.Scanner;
public class HinhChuNhat {
    private float dai, rong;
    public void setDai(float d)
    {
        this.dai=d;
    }
    public void setRong(float r)
    {
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
    public static void main(String[] args) {  
        HinhChuNhat HCN = new HinhChuNhat();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");   
        HCN.setDai(sc.nextFloat());
        System.out.print("Nhap chieu rong: ");  
        HCN.setRong(sc.nextFloat()); 
        System.out.println("Chieu dai: "+HCN.getDai());
        System.out.println("Chieu rong: "+HCN.getRong());
        System.out.println("Dien tich: "+HCN.DienTich());
        System.out.println("Chu vi: "+HCN.ChuVi());
        System.out.println("Thong tin: "+HCN.toString());
        sc.close();
    }
}

