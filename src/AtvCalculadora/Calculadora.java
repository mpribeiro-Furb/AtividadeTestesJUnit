package AtvCalculadora;

public class Calculadora {
    private double valor1;
    private double valor2;
    private String operacao;

    public double calcular(){
        switch (operacao){
            case "+":
                return valor1 + valor2;
            case "-":
                return valor1 - valor2;
            case "*":
                return valor1 * valor2;
            case "/":
                if (valor2 > 0){
                    return valor1 / valor2;
                }
                throw new IllegalArgumentException("ERRO: Nenhum valor pode ser divido por Zero/0");
            default:
                throw new IllegalArgumentException("ERRO: Operador errado");
        }
    }



// gettes e settes
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
