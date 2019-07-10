/**
 * BaiTap2
 */
class Date{
    int year,month,day;
    public Date(){};
    public Date(int _year, int _month, int _day){
        this.year = _year;
        this.month = _month;
        this.day = _day;
    }
    public void print(){
        System.out.println("Your birthday is " + this.day + "/" + this.month + "/" + this.year);
    }
}

public class BaiTap2 {

    public static void main(String[] args){
        Date birthday = new Date(1996,05,12);
        birthday.print();
    }
}