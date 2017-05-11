
package Controller;


public class Aritmetica {
    private float num1;
    private float num2;
    private int operacao;

    public Aritmetica(float num1, float num2, int operacao) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }
    
    public float Operacao (){
        if(operacao == 1){ //Somar
            return getNum1() + getNum2();}
        else  if(operacao == 2){ //Subtrair
            return getNum1() - getNum2();}
        else  if(operacao == 3){ //multiplicar
            return getNum1() * getNum2();}
        else { //Dividir
            return getNum1() / getNum2();}
    }
    
    

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
    
    
    
    
    
    
}
