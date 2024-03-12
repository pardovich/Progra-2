public class ej4 {

    private String contraseña;


    public ej4(String contraseña) {
        this.contraseña = contraseña;
    }



    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public boolean validarContraseña() {
        return cumpleLongitud() && cumpleLetras() && contieneNumero() && contieneCaracterEspecial();
    }


    private boolean cumpleLongitud() {
        return contraseña.length() >= 10;
    }

    private boolean cumpleLetras() {
        int countMayusculas = 0;
        int countMinusculas = 0;

        for (char caracter : contraseña.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                countMayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                countMinusculas++;
            }
        }

        return countMayusculas >= 1 && countMinusculas >= 2;
    }

    private boolean contieneNumero() {
        for (char caracter : contraseña.toCharArray()) {
            if (Character.isDigit(caracter)) {
                return true;
            }
        }
        return false;
    }

    private boolean contieneCaracterEspecial() {
        char[] caracteresEspeciales = {'%', '&', '$', '/', '*'};

        for (char especial : caracteresEspeciales) {
            if (contraseña.indexOf(especial) != -1) {
                return true;
            }
        }

        return false;
    }
}
