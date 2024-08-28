package exercicios_java _revisao;

public class Main {

     public static void main(String[] args) {
        Calculadora calc = new Calculadora();                     /*calc = definir   new = criou uma nova class */
        calc.numA = 2.0;
        calc.numB = 3.0;

        System.out.println("Soma: " + calc.somar ());
       
     }
    }