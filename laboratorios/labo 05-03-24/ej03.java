import java.util.Scanner;
public class ej03 {
    public int num1 = 0;
    public int caja ;

    public int getCaja() {
        return caja;
    }
    public ej03 (int num1, int caja) {
        this.num1 = num1;
        this.caja = caja;
    }

    public double primos() {
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                caja = 1;
            }
        }
        return getCaja();
    }
}
