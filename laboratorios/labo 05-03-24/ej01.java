import java.util.Scanner;
public class ej01 {
    public int num1;
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum1(){
        return num1;
    }
    public int primos(int num1){
        int caja=0;
        for(int i=2; i<num1; i++){
            if(num1 % i == 0){
                caja=1;
            }
        }return caja;
    }
}
