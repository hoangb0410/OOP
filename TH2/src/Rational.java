// Bai 4
public class Rational {
    private 
    int numerator;
    int denominator;
    // constructor mac dinh
    public Rational(){
        this.numerator=1;
        this.denominator=1;
    }
    // constructor 
    public Rational(int num, int den)
    {
        this.numerator=num;
        this.denominator=den;
    }
    // get and set
    public void setNum(int num){
        this.numerator=num;
    }
    public void setDen(int den){
        this.denominator=den;
    }
    public int getNum()
    {
        return numerator;
    }
    public int getDen()
    {
        return denominator;
    }
    // In phan so
    public String toString(){
        return numerator+"/"+denominator;
    }
    // Toi gian
    public void reduce()
    {
        int tu=numerator, mau=denominator;
        while (tu != mau)
        {
            if (tu>mau)
                tu-=mau;
            else mau-=tu;
        }
        numerator=numerator/tu;
        denominator=denominator/tu;
    }
    // Nghich dao
    public void reciprocal()
    {
        int temp=numerator;
        numerator=denominator;
        denominator=temp;
    }
    // Cong
    public void add(Rational R) {
        this.numerator =this.numerator*R.getDen()+this.denominator*R.getNum();
        this.denominator=this.denominator*R.getDen();
    }
    // Tru
    public void subtract(Rational R) {
        this.numerator =this.numerator*R.getDen()-R.getNum()*this.denominator;
        this.denominator=this.denominator*R.getDen();
    }
    // Nhan
    public void multiply(Rational R) {
        this.numerator=this.numerator*R.getNum();
        this.denominator=this.denominator*R.getDen();
    }
    // Chia
    public void divide(Rational R) {
        this.numerator=this.numerator*R.getDen();
        this.denominator=this.denominator*R.getNum();
    }
    // So sanh
    public void comparision (Rational R){
        float temp1 = (float) this.numerator/this.denominator;
        float temp2 = (float) R.getNum()/R.getDen();
        if (temp1 > temp2)
            System.out.println("Lon hon");
        else
            System.out.println("Nho hon");
    }
    public static void main(String[] args){
        Rational P1 = new Rational(15, 10);
        Rational P2 = new Rational(5,6);
        System.out.println("Phan so P1: "+P1.toString());
        P1.reduce();
        System.out.println("Phan so P1 toi gian: "+P1.toString());
        // P3 là phan so trung gian cho cac phep toan
        Rational P3= new Rational();
        P3.setDen(P1.getDen());
        P3.setNum(P1.getNum());
        P3.reciprocal();
        System.out.println("Nghich dao phan so P1: "+P3.toString());
        System.out.println("Phan so P2 toi gian: "+P2.toString());

        //Add     
        System.out.print("P1+P2 (toi gian) = : ");
        P3.setDen(P1.getDen()); 
        P3.setNum(P1.getNum());
        P3.add(P2);
        P3.reduce();
        System.out.println(P3.toString());

         //Subtract
        System.out.print("P1-P2 (toi gian) = : ");
        P3.setDen(P1.getDen());
        P3.setNum(P1.getNum());
        P3.subtract(P2);
        P3.reduce();
        System.out.println(P3.toString());

        //multiply
        System.out.print("P1*P2 (toi gian) = : ");
        P3.setDen(P1.getDen());
        P3.setNum(P1.getNum());
        P3.multiply(P2);
        P3.reduce();
        System.out.println(P3.toString());

        //divide
        System.out.print("P1/P2 (toi gian) = : ");
        P3.setDen(P1.getDen());
        P3.setNum(P1.getNum());
        P3.divide(P2);
        P3.reduce();
        System.out.println(P3.toString());

        // Comparision
        System.out.print("P1 ");
        P1.comparision(P2);
    } 
}
