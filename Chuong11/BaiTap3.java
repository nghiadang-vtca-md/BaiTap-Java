
class Rational{
    int tuSo, mauSo;
    public Rational(){
        this.tuSo = 0;
        this.mauSo = 1;
    }
    public Rational(int _tuSo, int _mauSo){
        this.tuSo = _tuSo;
        this.mauSo = _mauSo;
    }
    public void negate(){
        if((this.tuSo > 0 && this.mauSo >0) || (this.tuSo < 0 && this.mauSo < 0)) {
            this.tuSo = Math.abs(this.tuSo) * -1;
            this.mauSo = Math.abs(this.mauSo);
        }
        else{
            this.tuSo = Math.abs(this.tuSo);
            this.mauSo = Math.abs(this.mauSo);
        }
    }
    public void invert(){
        int temp = this.tuSo;
        this.tuSo = this.mauSo;
        this.mauSo = temp;
        //this.negate();
    }
    public double toDouble(){
        double result = 0.0;
        result = (double)this.tuSo / this.mauSo;
        return result;
    }

    public Rational reduce(){
        Rational result = new Rational(this.tuSo,this.mauSo);
        int gcd = BaiTap3.gcd(this.tuSo, this.mauSo);
        result.tuSo = this.tuSo / gcd;
        result.mauSo = this.mauSo / gcd;
        return result;
    }
    public static Rational add(Rational r1, Rational r2){
        Rational result = new  Rational();
        result.tuSo = r1.tuSo*r2.mauSo + r2.tuSo*r1.mauSo;
        result.mauSo = r1.mauSo * r2.mauSo;
        return result.reduce();
    }
}

public class BaiTap3 {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0)
            return a+b;
        if(a>b)
            return gcd(b,a-b);
        if(b>a)
            return gcd(a,b-a);
        return a;
    }
    public static void printRational(Rational r){
        System.out.println(r.tuSo + "/" + r.mauSo);
    }
    public static void main(String[] args){
        // Tạo phân số r1
        Rational r1 = new Rational();
        r1.tuSo = -3;
        r1.mauSo = 6;
        printRational(r1);
        // đảo ngược r1
        r1.invert();
        printRational(r1);
        // chuyển phân số thành kiểu double
        System.out.println(r1.toDouble());
        // Tạo phân số r2
        Rational r2 = new Rational(-3,15);
        // rút gọn phân số
        printRational(r2.reduce());
        // cộng 2 phân số 
        printRational(Rational.add(r1, r2));
    }   
}