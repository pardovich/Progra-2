public class ej5 {
    public int n;
    public int a = 1, b = 0, c = 0;

    public ej5(int n) {
        this.n = n;
    }

    public void matris_completa() {
        for (int i = 1; i <= getN(); i++) {
            for (int j = 1; j <= getN(); j++) {
                if (j == i && i + j == n + 1) {
                    System.out.print(">:v    ");
                } else if (j == 1 && i == 1) {
                    System.out.print(0 + "    ");
                } else if (j == i || i + j == n + 1) {
                    c = a + b;
                    System.out.print(c + "    ");
                    a = b;
                    b = c;
                } else {
                    System.out.print(0 + "    ");
                }

            }
            System.out.print("\n");
        }

    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

}