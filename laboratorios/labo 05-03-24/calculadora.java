public class calculadora {
    public double num1;
    public double num2;
    

    public calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar (){
        return getNum1()+getNum2();
    }
    public double restar (){
        return getNum1()-getNum2();
    }

    public double multiplicar (){
        return getNum1()*getNum2();
    }

    public double dividir (){
        double res=0;
        if(getNum2()!=0){
            res = getNum1()/getNum2();
        }else{
            res=0;
        }
        return res;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public double getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    
    
}
