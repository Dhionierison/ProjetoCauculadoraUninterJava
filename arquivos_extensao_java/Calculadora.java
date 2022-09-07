package pacote.projeto.calculadora.java;

public class Calculadora implements FuncoesCalculadora {
    private double numero1;
    private double numero2;

    /*GETTERS E SETTERS*/
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
    
    @Override
    public String somarNumeros() { return "Resultado:\n\n"+ numero1 + " + " + numero2 + " = " + (numero1 + numero2); }

    @Override
    public String subtrairNumeros() { return "Resultado:\n\n"+ numero1 + " - " + numero2 + " = " + (numero1 - numero2); }

    @Override
    public String multiplicarNumeros() { return "Resultado:\n\n"+ numero1 + " x " + numero2 + " = " + (numero1 * numero2); }

    @Override
    public String dividirNumeros() {
        if(numero2 == 0){
            return "\nNão é possível dividir por 0";
        } else {
            return "Resultado:\n\n"+ numero1 + " : " + numero2 + " = " + (numero1 / numero2);
        }
    }

    @Override
    public String elevarPotencia() { return "Resultado:\n\n("+ numero1 + ") ^ (" + numero2 + ") = " + (Math.pow(numero1, numero2)); }

    @Override
    public String extrairRaizQuadrada() {
        double raiz1 = Math.sqrt(numero1);
        double raiz2 = Math.sqrt(numero2);
        if(numero1 >= 0 && numero2 >= 0){
            return "Resultado:\n\nRaiz quadrada de " + numero1 + " = " + raiz1 + 
                   "\nRaiz quadrada de " + numero2 + " = " + raiz2;
        } else {
            return "\nENTRADA INVÁLIDA!";
        }
    }

    @Override
    public String obterFatorial() {
        if(numero1 >= 0 && numero2 >= 0){
            int fatorial1 = 1, fatorial2 = 1;
            for(int i = (int) numero1; i >= 1; i--){ //Converte o número para inteiro antes de calcular seu fatorial
                fatorial1 = fatorial1 * i;
            }
            for(int i = (int) numero2; i >= 1; i--){
                fatorial2 = fatorial2 * i;
            }
            return "Resultado:\n\nfact(" + (int)numero1 + ")" + " = " + fatorial1 +
                   "\nfact(" + (int)numero2 + ")" + " = " + fatorial2;
        } else {
            return "\nENTRADA INVÁLIDA!";
        }
    }
    
}
